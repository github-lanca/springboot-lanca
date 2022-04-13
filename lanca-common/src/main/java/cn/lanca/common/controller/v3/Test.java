package cn.lanca.common.controller.v3;

import cn.lanca.common.util.tool.ExcelUtil;
import cn.lanca.common.vo.excel.Common3;
import cn.lanca.common.vo.excel.CommonA;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * @since 2022/4/13 14:07
 */
public class Test {

    //
    public static void main(String[] args) throws FileNotFoundException {
        Object o = new Object();
        int i = o.hashCode();
        System.out.println(o.hashCode());//10位hashCode
//        get_E();

    }

    private static void get_E() throws FileNotFoundException {
        // /Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three

        List<Common3> common3List = ExcelUtil.readExcel("/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/肛肠科产品计划目录供货价.xlsx", Common3.class);
        List<CommonA> allDBData = ExcelUtil.getAllDBData();
        System.out.println("How:" + common3List.size());
        allDBData.forEach(commonA -> {
            common3List.forEach(common3 -> {
                if (common3.getA1().equals(commonA.getB4())) {
                    common3.setA8(commonA.getB0());
                }
            });
        });
        ExcelUtil.writeExcel(common3List, Common3.class, "/Users/meihongliang/Downloads/A_xiaowan/2022-04-12/three/肛肠科产品计划目录供货价_E.xlsx");
    }
}
