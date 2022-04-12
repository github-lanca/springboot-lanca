package cn.lanca;

import cn.lanca.common.util.tool.ExcelUtil;
import cn.lanca.common.vo.excel.CommonImgName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.util.List;

@SpringBootTest
class LancaAuthApplicationTests {

    @Test
    void contextLoads() throws FileNotFoundException {
        List<CommonImgName> list = ExcelUtil.readExcel("/Users/meihongliang/Downloads/建设路-316提取图片名称.xlsx", CommonImgName.class);
        ExcelUtil.writeExcel(list, CommonImgName.class, "/Users/meihongliang/Downloads/建设路-316提取图片名称_util.xlsx");

    }

}
