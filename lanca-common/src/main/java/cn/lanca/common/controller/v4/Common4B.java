package cn.lanca.common.controller.v4;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * project name:<font size = "1"><b>小芄健康数据运营平台</b></font><br>
 * file name:<font size = "1"><b>TODO</b></font><br>
 * description:<font size = "1"><b>TODO</b></font><br>
 * company name:<font size = "1"><b>小芄医药科技（成都）有限公司-研发中心</b></font><br>
 *
 * @author <a href="mail to: meihongliang@xiaowanjiankang.com" rel="nofollow">meihongliang<br>
 * @version 1.0.0<br>
 * @since [1] [2022/4/8 10:20] [meihongliang] [新建] <br>
 */
@Data
public class Common4B {


    // 序号	0分类	1通用名	2商品名	3规格	4生产企业	5挂网底价	6建议零售价	7终端毛利率	8网店商品分组

    @ExcelProperty(value = "序号", index = 0)
    private String a0 = "";
    @ExcelProperty(value = "0分类", index = 1)
    private String a1 = "";
    @ExcelProperty(value = "1通用名", index = 2)
    private String a2 = "";
    @ExcelProperty(value = "2商品名", index = 3)
    private String a3 = "";
    @ExcelProperty(value = "3规格", index = 4)
    private String a4 = "";
    @ExcelProperty(value = "4生产企业", index = 5)
    private String a5 = "";
    @ExcelProperty(value = "5挂网底价", index = 6)
    private String a6 = "";
    @ExcelProperty(value = "6建议零售价", index = 7)
    private String a7 = "";
    @ExcelProperty(value = "7终端毛利率", index = 8)
    private String a8 = "";
    @ExcelProperty(value = "8网店商品分组", index = 9)
    private String a9 = "";

    private String key = "";
}
