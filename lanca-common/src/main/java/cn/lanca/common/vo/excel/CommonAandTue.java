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
public class CommonAandTue {
    // 0网店商品分组 1商品品牌 2药品商品名 3商品名称 4药品通用名 5药品规格 6产品剂型 7疾病 8商品卖点 9使用剂量 10批准文号

    @ExcelProperty(value = "0网店商品分组", index = 0)
    private String b0 = "";
    @ExcelProperty(value = "1商品品牌", index = 1)
    private String b1 = "";
    @ExcelProperty(value = "2药品商品名", index = 2)
    private String b2 = "";
    @ExcelProperty(value = "3商品名称", index = 3)
    private String b3 = "";
    @ExcelProperty(value = "4药品通用名", index = 4)
    private String b4 = "";
    @ExcelProperty(value = "5药品规格", index = 5)
    private String b5 = "";
    @ExcelProperty(value = "6产品剂型", index = 6)
    private String b6 = "";
    @ExcelProperty(value = "7疾病", index = 7)
    private String b7 = "";
    @ExcelProperty(value = "8商品卖点", index = 8)
    private String b8 = "";
    @ExcelProperty(value = "9使用剂量", index = 9)
    private String b9 = "";
    @ExcelProperty(value = "10批准文号", index = 10)
    private String b10 = "";


    // 11有效期 12商品类目值 13生产企业 14药品类别 15用法 16适用人群 17条形码 18产品图片 19对应商品编码

    @ExcelProperty(value = "11有效期", index = 11)
    private String b11 = "";
    @ExcelProperty(value = "12商品类目值", index = 12)
    private String b12 = "";
    @ExcelProperty(value = "13生产企业", index = 13)
    private String b13 = "";
    @ExcelProperty(value = "14药品类别", index = 14)
    private String b14 = "";
    @ExcelProperty(value = "15用法", index = 15)
    private String b15 = "";
    @ExcelProperty(value = "16适用人群", index = 16)
    private String b16 = "";
    @ExcelProperty(value = "17条形码", index = 17)
    private String b17 = "";
    @ExcelProperty(value = "18产品图片", index = 18)
    private String b18 = "";
    @ExcelProperty(value = "19对应商品编码", index = 19)
    private String b19 = "";
    @ExcelProperty(value = "20图片名称", index = 20)
    private String b20 = "";

    @ExcelProperty(value = "批准文号", index = 21)
    private String c1 = "";
    @ExcelProperty(value = "药品规格", index = 22)
    private String c2 = "";
    @ExcelProperty(value = "key", index = 23)
    private String key = "";

    // 0单据状态 1生效时间 2商品编码 3商品名称 4商品简称 5规格 6生产企业 7产地 8单位 9入库数量 10含税进价

    @ExcelProperty(value = "0单据状态", index = 24)
    private String a0 = "";
    @ExcelProperty(value = "1生效时间", index = 25)
    private String a1 = "";
    @ExcelProperty(value = "2商品编码", index = 26)
    private String a2 = "";
    @ExcelProperty(value = "3商品名称", index = 27)
    private String a3 = "";
    @ExcelProperty(value = "4商品简称", index = 28)
    private String a4 = "";
    @ExcelProperty(value = "5规格", index = 29)
    private String a5 = "";
    @ExcelProperty(value = "6生产企业", index = 30)
    private String a6 = "";
    @ExcelProperty(value = "7产地", index = 31)
    private String a7 = "";
    @ExcelProperty(value = "8单位", index = 32)
    private String a8 = "";
    @ExcelProperty(value = "9入库数量", index = 33)
    private String a9 = "";
    @ExcelProperty(value = "10含税进价", index = 34)
    private String a10 = "";


    // 11返点后进价 12含税金额 13返点后扣率 14进项税金 15无税金额 16件数 17业务机构 18入库单号 19供应商编码 20供应商名称

    @ExcelProperty(value = "11返点后进价", index = 35)
    private String a11 = "";
    @ExcelProperty(value = "12含税金额", index = 36)
    private String a12 = "";
    @ExcelProperty(value = "13返点后扣率", index = 37)
    private String a13 = "";
    @ExcelProperty(value = "14进项税金", index = 38)
    private String a14 = "";
    @ExcelProperty(value = "15无税金额", index = 39)
    private String a15 = "";
    @ExcelProperty(value = "16件数", index = 40)
    private String a16 = "";
    @ExcelProperty(value = "17业务机构", index = 41)
    private String a17 = "";
    @ExcelProperty(value = "18入库单号", index = 42)
    private String a18 = "";
    @ExcelProperty(value = "19供应商编码", index = 43)
    private String a19 = "";
    @ExcelProperty(value = "20供应商名称", index = 44)
    private String a20 = "";

    // 21采购员 22付款方式 23批号 24生产日期 25有效期至 26送货单号 27配送价 28质量标准 29审核人1 30审核标志1

    @ExcelProperty(value = "21采购员", index = 45)
    private String a21 = "";
    @ExcelProperty(value = "22付款方式", index = 46)
    private String a22 = "";
    @ExcelProperty(value = "23批号", index = 47)
    private String a23 = "";
    @ExcelProperty(value = "24生产日期", index = 48)
    private String a24 = "";
    @ExcelProperty(value = "25有效期至", index = 49)
    private String a25 = "";
    @ExcelProperty(value = "26送货单号", index = 50)
    private String a26 = "";
    @ExcelProperty(value = "27配送价", index = 51)
    private String a27 = "";
    @ExcelProperty(value = "28质量标准", index = 52)
    private String a28 = "";
    @ExcelProperty(value = "29审核人1", index = 53)
    private String a29 = "";
    @ExcelProperty(value = "30审核标志1", index = 54)
    private String a30 = "";

    // 31审核人2 32审核标志2 33审核人3 34审核标志3 35审核人4 36审核标志4 37入库方式 38新最低限价 39验收情况 40部门标识
    @ExcelProperty(value = "31审核人2", index = 55)
    private String a31 = "";
    @ExcelProperty(value = "32审核标志2", index = 56)
    private String a32 = "";
    @ExcelProperty(value = "33审核人3", index = 57)
    private String a33 = "";
    @ExcelProperty(value = "34审核标志3", index = 58)
    private String a34 = "";
    @ExcelProperty(value = "35审核人4", index = 59)
    private String a35 = "";
    @ExcelProperty(value = "36审核标志4", index = 60)
    private String a36 = "";
    @ExcelProperty(value = "37入库方式", index = 61)
    private String a37 = "";
    @ExcelProperty(value = "38新最低限价", index = 62)
    private String a38 = "";
    @ExcelProperty(value = "39验收情况", index = 63)
    private String a39 = "";
    @ExcelProperty(value = "40部门标识", index = 64)
    private String a40 = "";

    // 41结算户名称 42标记 43订单号 44个性标识 45最终修改时间 46最终修改人 47抽检数量 48拒收数量 49器械序列号 50灭菌批次效期
    @ExcelProperty(value = "41结算户名称", index = 65)
    private String a41 = "";
    @ExcelProperty(value = "42标记", index = 66)
    private String a42 = "";
    @ExcelProperty(value = "43订单号", index = 67)
    private String a43 = "";
    @ExcelProperty(value = "44个性标识", index = 68)
    private String a44 = "";
    @ExcelProperty(value = "45最终修改时间", index = 69)
    private String a45 = "";
    @ExcelProperty(value = "46最终修改人", index = 70)
    private String a46 = "";
    @ExcelProperty(value = "47抽检数量", index = 71)
    private String a47 = "";
    @ExcelProperty(value = "48拒收数量", index = 72)
    private String a48 = "";
    @ExcelProperty(value = "49器械序列号", index = 73)
    private String a49 = "";
    @ExcelProperty(value = "50灭菌批次效期", index = 74)
    private String a50 = "";

    // 51不合格事项 52上市许可持有人
    @ExcelProperty(value = "51不合格事项", index = 75)
    private String a51 = "";
    @ExcelProperty(value = "52上市许可持有人", index = 76)
    private String a52 = "";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommonAandTue)) return false;
        CommonAandTue that = (CommonAandTue) o;
        return Objects.equals(getA5(), that.getA5()) && Objects.equals(getA28(), that.getA28());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA5(), getA28());
    }
}
