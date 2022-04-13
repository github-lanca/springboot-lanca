package cn.lanca.common.controller.v2;

import cn.lanca.common.util.tool.ExcelUtil;
import cn.lanca.common.vo.excel.Common3;
import cn.lanca.common.vo.excel.Common3AndAll;
import cn.lanca.common.vo.excel.CommonA;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @since 2022/4/12 18:20  meihongliang
 */
public class TestB {
    //  /Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three
    public static void main(String[] args) throws FileNotFoundException {
        // downloadPic();

    }

    private static void downloadPic() throws FileNotFoundException {
        String baseDir = "/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/wed/";
        List<Common3AndAll> common3AndAllList = ExcelUtil.readExcel("/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/数据库匹配'通用名'+'规格'+'生产企业'完全相同_530.xlsx", Common3AndAll.class);
        System.out.println(common3AndAllList.size());
        // 69 408  458
        for (int i = 0; i < common3AndAllList.size(); i++) {
            if (i != 407 && i != 457) {
                continue;
            }
            Common3AndAll common3AndAll = common3AndAllList.get(i);
            String imgUrls = common3AndAll.getB18();
            if (StringUtils.hasText(imgUrls)) {
                String[] split = imgUrls.split(",");
                System.out.println("第" + (i + 1) + "条数据，图片数量:" + split.length);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < split.length; j++) {
                    String url = split[j];
                    String imgName = common3AndAll.getB10() + "_" + common3AndAll.getB4() + "_" + (j + 1);
                    // 图片名称不能带/ 会影响文件夹路径
                    imgName = imgName.replace("/", "");
                    try {
                        ExcelUtil.downloadPicture(url, baseDir + imgName + ".jpg");
                        sb.append(imgName).append(";");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                common3AndAll.setB20(sb.toString());
            }
        }
        ExcelUtil.writeExcel(common3AndAllList, Common3AndAll.class, "/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/数据库匹配'通用名'+'规格'+'生产企业'完全相同_530_图片名称.xlsx");
    }


    // ----------------------------------------------------------

    private static void getStep2() throws FileNotFoundException {
        List<Common3> common3List = ExcelUtil.readExcel("/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/Three_三个字段都有值_1274.xlsx", Common3.class);
        List<CommonA> allList = ExcelUtil.getAllDBData();
        AtomicInteger count = new AtomicInteger(0);
        System.out.println(common3List.size());
        System.out.println(allList.size()); //69994
        allList.forEach(e -> {
            if (StringUtils.hasText(e.getB4()) && StringUtils.hasText(e.getB5()) && StringUtils.hasText(e.getB13())) {
                e.setKey3(e.getB4() + "_" + e.getB5() + "_" + e.getB13());
            }
        });
        HashSet<Common3AndAll> common3AndAllList = new HashSet<>();
        List<String> eq = new ArrayList<>();
        allList.forEach(commonA -> {
            common3List.forEach(common3 -> {
                if (common3.getKey3().equals(commonA.getKey3())) {
                    Common3AndAll common3AndAll = new Common3AndAll();
                    BeanUtils.copyProperties(common3, common3AndAll);
                    BeanUtils.copyProperties(commonA, common3AndAll);
//                    System.out.println(common3AndAll);
                    common3AndAllList.add(common3AndAll);
                    count.incrementAndGet();
                    eq.add(common3.getKey3());
                }
            });
        });
        System.out.println(common3AndAllList.size());
        ExcelUtil.writeExcel(new ArrayList<>(common3AndAllList), Common3AndAll.class, "/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/数据库匹配'通用名'+'规格'+'生产企业'完全相同_" + common3AndAllList.size() + ".xlsx");
        common3List.removeIf(next -> eq.contains(next.getKey3()));
        System.out.println("剩余：" + common3List.size());
        ExcelUtil.writeExcel(common3List, Common3.class, "/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/数据库匹配'通用名'+'规格'+'生产企业'不完全相同_" + common3List.size() + ".xlsx");
    }

    private static void threeHasValue() throws FileNotFoundException {
        List<Common3> common3List = ExcelUtil.readExcel("/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/儿科-肛肠-妇产科产品计划目录供货价格_ALL.xlsx", Common3.class);
        AtomicInteger count = new AtomicInteger(0);
        List<Common3> result = new ArrayList<>();
        HashSet<Common3> common3HashSet = new HashSet<>();
        common3List.forEach(e -> {
            if (StringUtils.hasText(e.getA1()) && StringUtils.hasText(e.getA3()) && StringUtils.hasText(e.getA4())) {
                String s = e.getA1() + "_" + e.getA3() + "_" + e.getA4();
                String sWithoutSpace = StringUtils.trimAllWhitespace(s);
                e.setKey3(sWithoutSpace);
                common3HashSet.add(e);
                count.incrementAndGet();
            }
        });
        System.out.println("F:" + common3List.size());
        common3List.stream().collect(Collectors.groupingBy(Common3::getKey3)).forEach((k, v) -> {
            //System.out.println(k + "\t" + v.size());
        });
        ExcelUtil.writeExcel(new ArrayList<>(common3HashSet), Common3.class, "/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/Three_三个字段都有值_" + common3HashSet.size() + ".xlsx");

        System.out.println(count);
        System.out.println(common3HashSet.size());
        System.out.println("----");
        common3List.removeIf(common3HashSet::contains);
        ExcelUtil.writeExcel(common3List, Common3.class, "/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/Three_三个字段都没有值_" + common3List.size() + ".xlsx");

        System.out.println(common3List.size());
    }

    private static void getAll() throws FileNotFoundException {
        // 儿科产品计划目录供货价格.xlsx
        // 肛肠科产品计划目录供货价.xlsx
        // 妇产科产品计划目录供货价.xlsx
        List<Common3> common3A = ExcelUtil.readExcel("/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/儿科产品计划目录供货价格.xlsx", Common3.class);
        List<Common3> common3B = ExcelUtil.readExcel("/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/肛肠科产品计划目录供货价.xlsx", Common3.class);
        List<Common3> common3C = ExcelUtil.readExcel("/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/妇产科产品计划目录供货价.xlsx", Common3.class);
        System.out.println(common3A.size());
        System.out.println(common3B.size());
        System.out.println(common3C.size());
        List<Common3> all = new ArrayList<>();
        all.addAll(common3A);
        all.addAll(common3B);
        all.addAll(common3C);
        System.out.println(all.size());
        HashSet<Common3> common3HashSet = new HashSet<>();
        all.forEach(e -> {
            common3HashSet.add(e);
        });
        System.out.println(common3HashSet.size());// 1451
        ExcelUtil.writeExcel(new ArrayList<>(common3HashSet), Common3.class, "/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/儿科-肛肠-妇产科产品计划目录供货价格_ALL.xlsx");
    }
}
