package cn.lanca.common.controller.v4;

import cn.lanca.common.util.tool.ExcelUtil;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 根据已知的四个表，返回去重的四个表，其中数据量最大的表，需要加一个字段
 *
 * @since [1] [2022/4/13 17:02] [meihongliang] [新建] <br>
 */
public class Test4 {
    public static void main(String[] args) throws FileNotFoundException {

//        quchongBigExcel();

        List<Common4A> common4F = ExcelUtil.readExcel("/Users/meihongliang/Downloads/库存明细_F_去重.xlsx", Common4A.class);
        List<Common4C> common4A = ExcelUtil.readExcel("/Users/meihongliang/Downloads/肛肠科产品计划目录供货价-G_去重.xlsx", Common4C.class);
        List<Common4C> common4B = ExcelUtil.readExcel("/Users/meihongliang/Downloads/儿科产品计划目录供货价格_G_去重.xlsx", Common4C.class);
        List<Common4C> common4C = ExcelUtil.readExcel("/Users/meihongliang/Downloads/妇产科产品计划目录供货价_G_去重.xlsx", Common4C.class);
        HashSet<String> hashSetA = new HashSet<>();
        HashSet<String> hashSetB = new HashSet<>();
        HashSet<String> hashSetC = new HashSet<>();
        common4A.forEach(e -> {
            hashSetA.add(e.getA1());
        });
        common4B.forEach(e -> {
            hashSetB.add(e.getA1());
        });
        common4C.forEach(e -> {
            hashSetC.add(e.getA1());
        });
        System.out.println("F:" + common4F.size());
        System.out.println("A:" + hashSetA.size());
        System.out.println("B:" + hashSetB.size());
        System.out.println("C:" + hashSetC.size());

        ArrayList<Common4A> common4AS_1 = new ArrayList<>(common4F);
        ArrayList<Common4A> common4AS_2 = new ArrayList<>(common4F);
        ArrayList<Common4A> common4AS_3 = new ArrayList<>(common4F);

        System.out.println("1前: " + common4AS_1.size());

        HashSet<String> eqA = new HashSet<>();
        common4AS_1.removeIf(e -> {
            if (hashSetA.contains(e.getD3())) {
                eqA.add(e.getD3());
                return true;
            }
            return false;
        });
        System.out.println("肛肠-相同的'通用名'和'品名'" + eqA);
        ArrayList<Common4A> common4AS_A = new ArrayList<>(common4AS_1);
        System.out.println("1后:" + common4AS_A.size());

        System.out.println("2前: " + common4AS_2.size());
//        common4AS_2.removeIf(e -> hashSetB.contains(e.getD3()));

        HashSet<String> eqB = new HashSet<>();
        common4AS_2.removeIf(e -> {
            if (hashSetB.contains(e.getD3())) {
                eqB.add(e.getD3());
                return true;
            }
            return false;
        });
        System.out.println("儿科-相同的'通用名'和'品名'" + eqB);
        ArrayList<Common4A> common4AS_B = new ArrayList<>(common4AS_2);
        System.out.println("2后: " + common4AS_B.size());

        System.out.println("3前: " + common4AS_3.size());
        HashSet<String> eqC = new HashSet<>();
        common4AS_3.removeIf(e -> {
            if (hashSetC.contains(e.getD3())) {
                eqC.add(e.getD3());
                return true;
            }
            return false;
        });
        System.out.println("妇科-相同的'通用名'和'品名'" + eqC);
        ArrayList<Common4A> common4AS_C = new ArrayList<>(common4AS_3);
        System.out.println("3后:" + common4AS_C.size());

//        ExcelUtil.writeExcel(common4AS_A, Common4A.class, "/Users/meihongliang/Downloads/库存明细排除_肛肠科_剩余产品计划目录供货价Y.xlsx");
//        ExcelUtil.writeExcel(common4AS_B, Common4A.class, "/Users/meihongliang/Downloads/库存明细排除_儿科_剩余产品计划目录供货价格Y.xlsx");
//        ExcelUtil.writeExcel(common4AS_C, Common4A.class, "/Users/meihongliang/Downloads/库存明细排除_妇产科_剩余产品计划目录供货价Y.xlsx");

    }


    private static void checkNumber(String path, Integer sheetNo) throws FileNotFoundException {
        List<Common4C> common4CS = ExcelUtil.readExcel(path, Common4C.class, sheetNo);
        common4CS.forEach(e -> {
            e.setKey(e.getA1() + "_" + e.getA3() + "_" + e.getA4());
        });
        AtomicInteger count = new AtomicInteger(0);
        common4CS.stream().collect(Collectors.groupingBy(Common4C::getKey)).forEach((k, v) -> {
            count.incrementAndGet();
        });
        System.out.println(count);
        ExcelUtil.writeExcel(common4CS, Common4C.class, path.replace("E.xlsx", "G_去重.xlsx"));
    }

    private static void quchongBigExcel() throws FileNotFoundException {
        List<Common4A> common4s = ExcelUtil.readExcel("/Users/meihongliang/Downloads/库存明细.xlsx", Common4A.class);
        System.out.println(common4s.size()); // 2443
        AtomicInteger atomicInteger = new AtomicInteger(0);
        List<Common4A> result = new ArrayList<>();
        common4s.stream().collect(Collectors.groupingBy(Common4A::getD3)).forEach((k, v) -> {
            System.out.println(k + "\t" + v.size());
            atomicInteger.incrementAndGet();
            result.add(v.get(0));
        });
        result.sort(Comparator.comparing(Common4A::getD0));
        System.out.println(atomicInteger);
        ExcelUtil.writeExcel(result, Common4A.class, "/Users/meihongliang/Downloads/库存明细_F_去重.xlsx");
    }
}
