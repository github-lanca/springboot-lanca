package cn.lanca.common.vo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Objects;

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
public class Common3AndAll {


    // 0分类 1通用名 2商品名 3规格 4生产企业 5挂网底价 6建议零售价 7终端毛利率

    @ExcelProperty(value = "0分类", index = 0)
    private String a0 = "";
    @ExcelProperty(value = "1通用名", index = 1)
    private String a1 = "";
    @ExcelProperty(value = "2商品名", index = 2)
    private String a2 = "";
    @ExcelProperty(value = "3规格", index = 3)
    private String a3 = "";
    @ExcelProperty(value = "4生产企业", index = 4)
    private String a4 = "";
    @ExcelProperty(value = "5挂网底价", index = 5)
    private String a5 = "";
    @ExcelProperty(value = "6建议零售价", index = 6)
    private String a6 = "";
    @ExcelProperty(value = "7终端毛利率", index = 7)
    private String a7 = "";

    @ExcelProperty(value = "key3", index = 8)
    private String key3 = "";

    @ExcelProperty(value = "0网店商品分组", index = 9)
    private String b0 = "";
    @ExcelProperty(value = "1商品品牌", index = 10)
    private String b1 = "";
    @ExcelProperty(value = "2药品商品名", index = 11)
    private String b2 = "";
    @ExcelProperty(value = "3商品名称", index = 12)
    private String b3 = "";
    @ExcelProperty(value = "4药品通用名", index = 13)
    private String b4 = "";
    @ExcelProperty(value = "5药品规格", index = 14)
    private String b5 = "";
    @ExcelProperty(value = "6产品剂型", index = 15)
    private String b6 = "";
    @ExcelProperty(value = "7疾病", index = 16)
    private String b7 = "";
    @ExcelProperty(value = "8商品卖点", index = 17)
    private String b8 = "";
    @ExcelProperty(value = "9使用剂量", index = 18)
    private String b9 = "";
    @ExcelProperty(value = "10批准文号", index = 19)
    private String b10 = "";


    // 11有效期 12商品类目值 13生产企业 14药品类别 15用法 16适用人群 17条形码 18产品图片 19对应商品编码

    @ExcelProperty(value = "11有效期", index = 20)
    private String b11 = "";
    @ExcelProperty(value = "12商品类目值", index = 21)
    private String b12 = "";
    @ExcelProperty(value = "13生产企业", index = 22)
    private String b13 = "";
    @ExcelProperty(value = "14药品类别", index = 23)
    private String b14 = "";
    @ExcelProperty(value = "15用法", index = 24)
    private String b15 = "";
    @ExcelProperty(value = "16适用人群", index = 25)
    private String b16 = "";
    @ExcelProperty(value = "17条形码", index = 26)
    private String b17 = "";
    @ExcelProperty(value = "18产品图片", index = 27)
    private String b18 = "";
    @ExcelProperty(value = "19对应商品编码", index = 28)
    private String b19 = "";
    @ExcelProperty(value = "20图片名称", index = 29)
    private String b20 = "";

    @ExcelProperty(value = "批准文号", index = 30)
    private String c1 = "";
    @ExcelProperty(value = "药品规格", index = 31)
    private String c2 = "";
    @ExcelProperty(value = "allKey3", index = 32)
    private String allKey3 = "";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Common3AndAll)) return false;
        Common3AndAll common3 = (Common3AndAll) o;
        return
                Objects.equals(getKey3(), common3.getKey3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey3());
    }
}
