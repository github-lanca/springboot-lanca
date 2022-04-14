package cn.lanca.common.controller.v4;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @version 1.0.0<br>
 * @since [1] [2022/4/13 17:04] [meihongliang] [新建] <br>
 */
@Data
public class Common4A {

    // 2442	1业务机构 2商品编码 3品名 4规格 5生产企业 6单位 7剂型 8库存数量 9生产批号 10批次号


    @ExcelProperty(value = "2442", index = 0)
    private Integer d0 = 0;
    @ExcelProperty(value = "1业务机构", index = 1)
    private String d1 = "";
    @ExcelProperty(value = "2商品编码", index = 2)
    private String d2 = "";
    @ExcelProperty(value = "3品名", index = 3)
    private String d3 = "";
    @ExcelProperty(value = "4规格", index = 4)
    private String d4 = "";
    @ExcelProperty(value = "5生产企业", index = 5)
    private String d5 = "";
    @ExcelProperty(value = "6单位", index = 6)
    private String d6 = "";
    @ExcelProperty(value = "7剂型", index = 7)
    private String d7 = "";
    @ExcelProperty(value = "8库存数量", index = 8)
    private String d8 = "";
    @ExcelProperty(value = "9生产批号", index = 9)
    private String d9 = "";
    @ExcelProperty(value = "10批次号", index = 10)
    private String d10 = "";

    // 11库区 12货位号 13货位名称 14批次进价 15批次进价金额 16最新售价 17售价金额 18进项税率 19无税进价 20无税进价金额
    @ExcelProperty(value = "11库区", index = 11)
    private String d11 = "";
    @ExcelProperty(value = "12货位号", index = 12)
    private String d12 = "";
    @ExcelProperty(value = "13货位名称", index = 13)
    private String d13 = "";
    @ExcelProperty(value = "14批次进价", index = 14)
    private String d14 = "";
    @ExcelProperty(value = "15批次进价金额", index = 15)
    private String d15 = "";
    @ExcelProperty(value = "16最新售价", index = 16)
    private String d16 = "";
    @ExcelProperty(value = "17售价金额", index = 17)
    private String d17 = "";
    @ExcelProperty(value = "18进项税率", index = 18)
    private String d18 = "";
    @ExcelProperty(value = "19无税进价", index = 19)
    private String d19 = "";
    @ExcelProperty(value = "20无税进价金额", index = 20)
    private String d20 = "";

    // 21进货数量 22类型 23采购员 24付款方式 25生产日期 26有效期至 27供应商 28供应商名称 29在库天数 30批准文号
    @ExcelProperty(value = "21进货数量", index = 21)
    private String d21 = "";
    @ExcelProperty(value = "22类型", index = 22)
    private String d22 = "";
    @ExcelProperty(value = "23采购员", index = 23)
    private String d23 = "";
    @ExcelProperty(value = "24付款方式", index = 24)
    private String d24 = "";
    @ExcelProperty(value = "25生产日期", index = 25)
    private String d25 = "";
    @ExcelProperty(value = "26有效期至", index = 26)
    private String d26 = "";
    @ExcelProperty(value = "27供应商", index = 27)
    private String d27 = "";
    @ExcelProperty(value = "28供应商名称", index = 28)
    private String d28 = "";
    @ExcelProperty(value = "29在库天数", index = 29)
    private String d29 = "";
    @ExcelProperty(value = "30批准文号", index = 30)
    private String d30 = "";

    // 31外部标识 32生效时间 33商品简称
    @ExcelProperty(value = "31外部标识", index = 31)
    private String d31 = "";
    @ExcelProperty(value = "32生效时间", index = 32)
    private String d32 = "";
    @ExcelProperty(value = "33商品简称", index = 33)
    private String d33 = "";
}
