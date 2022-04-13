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
public class Common3 {


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

    private String key3 = "";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Common3)) return false;
        Common3 common3 = (Common3) o;
        return
                Objects.equals(getKey3(), common3.getKey3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey3());
    }
}
