package cn.lanca.common.util.tool;

import cn.lanca.common.util.excel.ExcelListener;
import cn.lanca.common.vo.excel.CommonA;
import com.alibaba.excel.EasyExcel;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * @author meihongliang
 * @since 2022/4/12 11:42
 */
public class ExcelUtil {
    // 根据图片地址生成图片文件

    /**
     * 读取excel
     *
     * @param excelFilePath excel文件路径
     * @param t             那个类
     * @param <T>           传入类型
     * @return List<T>
     * @throws FileNotFoundException
     */
    public static <T> List<T> readExcel(String excelFilePath, Class<T> t) throws FileNotFoundException {
        ExcelListener<T> excelListener = new ExcelListener<>();
        EasyExcel.read(new FileInputStream(excelFilePath), t, excelListener).sheet().doRead();
        return excelListener.getObjs();
    }

    /**
     * 写入excel
     *
     * @param list          list
     * @param t             class
     * @param excelFilePath excel文件路径
     * @param <T>           传入类型
     */
    public static <T> void writeExcel(List<T> list, Class<T> t, String excelFilePath) {
        EasyExcel.write(excelFilePath, t).sheet(list.size() + "").doWrite(list);
    }

    /**
     * 根据url生成图片文件
     *
     * @param urlList 图片网络地址 www.xxxxxxx.xxxxx.jpg
     * @param path    图片存在系统的那个位置 图片名称是什么 baseDir/xxxx_1.jpg
     */
    public static void downloadPicture(String urlList, String path) {
        URL url = null;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<CommonA> getAllDBData() throws FileNotFoundException {
        return readExcel("/Users/meihongliang/Downloads/A_xiaowan/main/全部数据_69994.xlsx", CommonA.class);
    }
}
