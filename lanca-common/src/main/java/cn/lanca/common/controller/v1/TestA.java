package cn.lanca.common.controller.v1;

import cn.lanca.common.util.tool.ExcelUtil;
import cn.lanca.common.vo.excel.CommonA;
import cn.lanca.common.vo.excel.CommonAandTue;
import cn.lanca.common.vo.excel.CommonTue;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @since  2022/4/12 14:31 meihongliang
 */
public class TestA {

    public static void main(String[] args) throws FileNotFoundException {
        // 建设路新增药品3.5—4.12(1).xlsx
        // /Users/meihongliang/Downloads/建设路新增药品3.5—4.12(1).xlsx
        List<CommonTue> commonTues = ExcelUtil.readExcel("/Users/meihongliang/Downloads/建设路新增药品3.5—4.12(1).xlsx", CommonTue.class);
        System.out.println("A:" + commonTues.size());
        System.out.println(commonTues.get(0));
        // CommonTue(a0=生效, a1=2022-3-7 10:29, a2=359780, a3=益脑宁片, a4=益脑宁片, a5=0.37g*48片, a6=哈尔滨市龙生北药生物工程股份有限公司, a7=哈尔滨市, a8=盒, a9=26, a10=19.29, a11=19.29, a12=501.54, a13=100.00%, a14=14.61, a15=486.93, a16=26, a17=四川丸小二智能大药房有限公司, a18=22030701000001, a19=000149, a20=山西乐进医药有限公司, a21=张静, a22=01, a23=20210402, a24=2021/4/16, a25=2024/3/31, a26=, a27=, a28=国药准字号Z20083093, a29=张静, a30=√, a31=张静, a32=√, a33=, a34=, a35=, a36=, a37=1, a38=, a39=质量合格, a40=, a41=, a42=0, a43=22030701000001, a44=, a45=2022-3-7 10:29, a46=张静, a47=0, a48=0, a49=, a50=, a51=, a52=)
        // a28=国药准字号Z20083093,
        //

        // /Users/meihongliang/Downloads/A_xiaowan/main/全部数据_69994.xlsx
        List<CommonA> commonAS = ExcelUtil.readExcel("/Users/meihongliang/Downloads/A_xiaowan/main/全部数据_69994.xlsx", CommonA.class);
//        System.out.println(commonAS.size());
//        System.out.println(commonAS.get(0));
        HashSet<String> pizhunSet = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<CommonTue> hashObj = new HashSet<>();
//        HashSet<String> hashSetKey = new HashSet<>();
        List<CommonTue> commonTueListEQ = new ArrayList<>();
        HashSet<CommonAandTue> result = new HashSet<>();
        List<CommonTue> commonTueListNOT = new ArrayList<>();
        commonAS.stream().collect(Collectors.groupingBy(CommonA::getB10)).forEach((k, v) -> {
            commonTues.stream().collect(Collectors.groupingBy(CommonTue::getA28)).forEach((m, n) -> {
                if (k.equals(m)) {
                    // v 数据库中的数据
                    pizhunSet.add(k);
                    v.forEach(commonA -> {
                        // n小部分数据
                        String aaa5 = commonA.getB5();
                        String a5 = StringUtils.trimAllWhitespace(aaa5);
                        a5 = a5.replace("/盒", "");
                        a5 = a5.replace("片", "粒");
                        a5 = a5.replace("G", "g");
                        a5 = a5.replace("t", "粒");
                        a5 = a5.replace("*1瓶", "");
                        a5 = a5.replace("*1支", "");
                        String finalA = a5;
                        // n
                        n.forEach(commonTue -> {
                            String a51 = commonTue.getA5();
                            a51 = a51.replace("片", "粒");
                            a51 = a51.replace("G", "g");
                            a51 = a51.replace("t", "粒");
                            a51 = a51.replace("*1瓶", "");
                            a51 = a51.replace("*1支", "");
                            if (finalA.equals(a51)) {
//                                System.out.println(m + "  " + finalA + "==" + a51);
                                // 把批准文号记录下来，等会儿在那边没匹配上的，再删一次
                                CommonAandTue commonAandTue = new CommonAandTue();
                                BeanUtils.copyProperties(commonTue, commonAandTue);
                                BeanUtils.copyProperties(commonA, commonAandTue);
                                commonTueListEQ.add(commonTue);
                                result.add(commonAandTue);

                                hashObj.add(commonTue);
                                hashSet.add(m + "_" + commonTue.getA5());
                            }
                        });
                    });
                }
            });
        });

        System.out.println("全部:" + commonTues.size());

        ArrayList<CommonTue> commonTues_all = new ArrayList<>(commonTues);


        commonTues.removeIf(next -> pizhunSet.contains(next.getA28()));
        // 根据批准文号不匹配的数据
        ArrayList<CommonTue> commonTues_shengyu = new ArrayList<>(commonTues);
        System.out.println("否——不匹配:" + commonTues_shengyu.size());

        commonTues_all.removeAll(commonTues_shengyu);
        // sheng剩余 批准文号+规格
        ArrayList<CommonTue> arrayList = new ArrayList<>(commonTues_all);
        System.out.println("X " + arrayList.size());
        arrayList.removeIf(next -> hashSet.contains(next.getA28() + "_" + next.getA5()));


        System.out.println("++++++++++");
        System.out.println("X " + result.size());//66
        System.out.println("hashObj " + hashObj.size());//66
        System.out.println("X " + arrayList.size());//24
        List<CommonAandTue> commonTues1 = new ArrayList<>(result);
        String baseDir = "/Users/meihongliang/Downloads/A_xiaowan/tue0412/pic/";
        downLoadPic(commonTues1, baseDir);


//        ExcelUtil.writeExcel(commonTues_shengyu, CommonTue.class, "/Users/meihongliang/Downloads/建设路新增药品3.5—4.12根据'批准文号'完全不匹配上的数据_A_NO_" + commonTues_shengyu.size() + ".xlsx");
        ExcelUtil.writeExcel(commonTues1, CommonAandTue.class, "/Users/meihongliang/Downloads/建设路新增药品3.5—4.12根据'批准文号+规格'匹配上的数据_B_YES_" + commonTues1.size() + ".xlsx");
//        ExcelUtil.writeExcel(arrayList, CommonTue.class, "/Users/meihongliang/Downloads/建设路新增药品3.5—4.12根据'批准文号+规格'未匹配上的数据_C_NOT_" + arrayList.size() + ".xlsx");

        //hashSet.forEach(System.out::println);
//        commonTues_shengyu.removeIf(next -> hashSet.contains(next.getA28() + "_" + next.getA5()));
//        System.out.println("shengyu:" + commonTues_shengyu.size());
//        System.out.println("af:" + commonTueListNOT.size());


//        System.out.println(hashSet.size());  //87
//        System.out.println(commonTues.size());

//        // 未匹配上的
//        System.out.println(commonTues.size());

        // ExcelUtil.writeExcel(commonTues,CommonTue.class,"/Users/meihongliang/Downloads/建设路新增药品3.5—4.12根据批准文号未匹配上的数据.xlsx");
    }

    private static void downLoadPic(List<CommonAandTue> commonTues1, String baseDir) {
        for (int m = 0; m < commonTues1.size(); m++) {
            CommonAandTue commonAandTue = commonTues1.get(m);
            String picUrlList = commonAandTue.getB18();
            if (StringUtils.hasText(picUrlList)) {
                // https://img.alicdn.com/imgextra/i1/858915326/O1CN01Gohy9l1pDLwVf2vl9_!!858915326.jpg,https://img.alicdn.com/imgextra/i2/858915326/O1CN01uDnDAZ1pDLwYof3ap_!!858915326.jpg,https://img.alicdn.com/imgextra/i4/858915326/O1CN018Xw8xP1pDLwZrXINE_!!858915326.jpg,https://img.alicdn.com/imgextra/i1/858915326/O1CN01RINyn21pDLwaMJ82y_!!858915326.jpg
                String[] picUrlArr = picUrlList.split(",");
                StringBuffer sb = new StringBuffer();
                System.out.println("第" + (m + 1) + "条数据,图片数量:" + picUrlArr.length);
                if (picUrlArr.length > 0) {
                    for (int i = 0; i < picUrlArr.length; i++) {
                        String url = picUrlArr[i];
                        String picName = commonAandTue.getB10() + "_" + commonAandTue.getB4() + "_" + (i + 1);
                        try {
                            ExcelUtil.downloadPicture(url, baseDir + picName + ".jpg");
                            sb.append(picName).append(";");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    commonAandTue.setB20(sb.toString());
                }
            }
        }
    }
}
