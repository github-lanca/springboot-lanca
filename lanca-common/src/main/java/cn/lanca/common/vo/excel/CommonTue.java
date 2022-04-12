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
public class CommonTue {


    // 0单据状态 1生效时间 2商品编码 3商品名称 4商品简称 5规格 6生产企业 7产地 8单位 9入库数量 10含税进价

    @ExcelProperty(value = "0单据状态", index = 0)
    private String a0 = "";
    @ExcelProperty(value = "1生效时间", index = 1)
    private String a1 = "";
    @ExcelProperty(value = "2商品编码", index = 2)
    private String a2 = "";
    @ExcelProperty(value = "3商品名称", index = 3)
    private String a3 = "";
    @ExcelProperty(value = "4商品简称", index = 4)
    private String a4 = "";
    @ExcelProperty(value = "5规格", index = 5)
    private String a5 = "";
    @ExcelProperty(value = "6生产企业", index = 6)
    private String a6 = "";
    @ExcelProperty(value = "7产地", index = 7)
    private String a7 = "";
    @ExcelProperty(value = "8单位", index = 8)
    private String a8 = "";
    @ExcelProperty(value = "9入库数量", index = 9)
    private String a9 = "";
    @ExcelProperty(value = "10含税进价", index = 10)
    private String a10 = "";


    // 11返点后进价 12含税金额 13返点后扣率 14进项税金 15无税金额 16件数 17业务机构 18入库单号 19供应商编码 20供应商名称

    @ExcelProperty(value = "11返点后进价", index = 11)
    private String a11 = "";
    @ExcelProperty(value = "12含税金额", index = 12)
    private String a12 = "";
    @ExcelProperty(value = "13返点后扣率", index = 13)
    private String a13 = "";
    @ExcelProperty(value = "14进项税金", index = 14)
    private String a14 = "";
    @ExcelProperty(value = "15无税金额", index = 15)
    private String a15 = "";
    @ExcelProperty(value = "16件数", index = 16)
    private String a16 = "";
    @ExcelProperty(value = "17业务机构", index = 17)
    private String a17 = "";
    @ExcelProperty(value = "18入库单号", index = 18)
    private String a18 = "";
    @ExcelProperty(value = "19供应商编码", index = 19)
    private String a19 = "";
    @ExcelProperty(value = "20供应商名称", index = 20)
    private String a20 = "";

    // 21采购员 22付款方式 23批号 24生产日期 25有效期至 26送货单号 27配送价 28质量标准 29审核人1 30审核标志1

    @ExcelProperty(value = "21采购员", index = 21)
    private String a21 = "";
    @ExcelProperty(value = "22付款方式", index = 22)
    private String a22 = "";
    @ExcelProperty(value = "23批号", index = 23)
    private String a23 = "";
    @ExcelProperty(value = "24生产日期", index = 24)
    private String a24 = "";
    @ExcelProperty(value = "25有效期至", index = 25)
    private String a25 = "";
    @ExcelProperty(value = "26送货单号", index = 26)
    private String a26 = "";
    @ExcelProperty(value = "27配送价", index = 27)
    private String a27 = "";
    @ExcelProperty(value = "28质量标准", index = 28)
    private String a28 = "";
    @ExcelProperty(value = "29审核人1", index = 29)
    private String a29 = "";
    @ExcelProperty(value = "30审核标志1", index = 30)
    private String a30 = "";

    // 31审核人2 32审核标志2 33审核人3 34审核标志3 35审核人4 36审核标志4 37入库方式 38新最低限价 39验收情况 40部门标识
    @ExcelProperty(value = "31审核人2", index = 31)
    private String a31 = "";
    @ExcelProperty(value = "32审核标志2", index = 32)
    private String a32 = "";
    @ExcelProperty(value = "33审核人3", index = 33)
    private String a33 = "";
    @ExcelProperty(value = "34审核标志3", index = 34)
    private String a34 = "";
    @ExcelProperty(value = "35审核人4", index = 35)
    private String a35 = "";
    @ExcelProperty(value = "36审核标志4", index = 36)
    private String a36 = "";
    @ExcelProperty(value = "37入库方式", index = 37)
    private String a37 = "";
    @ExcelProperty(value = "38新最低限价", index = 38)
    private String a38 = "";
    @ExcelProperty(value = "39验收情况", index = 39)
    private String a39 = "";
    @ExcelProperty(value = "40部门标识", index = 40)
    private String a40 = "";

    // 41结算户名称 42标记 43订单号 44个性标识 45最终修改时间 46最终修改人 47抽检数量 48拒收数量 49器械序列号 50灭菌批次效期
    @ExcelProperty(value = "41结算户名称", index = 41)
    private String a41 = "";
    @ExcelProperty(value = "42标记", index = 42)
    private String a42 = "";
    @ExcelProperty(value = "43订单号", index = 43)
    private String a43 = "";
    @ExcelProperty(value = "44个性标识", index = 44)
    private String a44 = "";
    @ExcelProperty(value = "45最终修改时间", index = 45)
    private String a45 = "";
    @ExcelProperty(value = "46最终修改人", index = 46)
    private String a46 = "";
    @ExcelProperty(value = "47抽检数量", index = 47)
    private String a47 = "";
    @ExcelProperty(value = "48拒收数量", index = 48)
    private String a48 = "";
    @ExcelProperty(value = "49器械序列号", index = 49)
    private String a49 = "";
    @ExcelProperty(value = "50灭菌批次效期", index = 50)
    private String a50 = "";

    // 51不合格事项 52上市许可持有人
    @ExcelProperty(value = "51不合格事项", index = 51)
    private String a51 = "";
    @ExcelProperty(value = "52上市许可持有人", index = 52)
    private String a52 = "";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommonTue)) return false;
        CommonTue commonTue = (CommonTue) o;
        return Objects.equals(getA5(), commonTue.getA5())
                && Objects.equals(getA28(), commonTue.getA28());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA5(), getA28());
    }
}
