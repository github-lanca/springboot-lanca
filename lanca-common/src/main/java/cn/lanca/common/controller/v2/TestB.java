package cn.lanca.common.controller.v2;

import cn.lanca.common.util.tool.ExcelUtil;
import cn.lanca.common.vo.excel.Common3;
import cn.lanca.common.vo.excel.CommonA;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * project name:<font size = "1"><b>小芄健康数据运营平台</b></font><br>
 * file name:<font size = "1"><b>TODO</b></font><br>
 * description:<font size = "1"><b>TODO</b></font><br>
 * company name:<font size = "1"><b>小芄医药科技（成都）有限公司-研发中心</b></font><br>
 *
 * @author <a href="mail to: meihongliang@xiaowanjiankang.com" rel="nofollow">meihongliang<br>
 * @version 1.0.0<br>
 * @since [1] [2022/4/12 18:20] [meihongliang] [新建] <br>
 */
public class TestB {
    //  /Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three
    public static void main(String[] args) throws FileNotFoundException {
        List<Common3> common3List = ExcelUtil.readExcel("/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/儿科-肛肠-妇产科产品计划目录供货价格_ALL.xlsx", Common3.class);
        List<CommonA> allList = ExcelUtil.getAllDBData();
        System.out.println(allList.size()); //69994
        System.out.println(allList.get(0));
        System.out.println(common3List.size()); // 1451
        System.out.println(common3List.get(0));
        common3List.stream().collect(Collectors.groupingBy(Common3::getA1)).forEach((k, v) -> {
            if (v.size() > 1) {
                System.out.println(k + "\t" + v.size());
            }
        });

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
