import java.util.ArrayList;
import java.util.List;

public class CommonPitfallsDemo {
    public static void main(String[] args) {
        integerOverflow();
        stringComparison();
        listModification();
        floatingPoint();
        integerCache();
        nullPointer();
    }

    private static void integerOverflow() {
        System.out.println("=== 整数溢出 ===");
        int max = Integer.MAX_VALUE;
        System.out.println("MAX = " + max);
        System.out.println("MAX + 1 = " + (max + 1));
        long safe = (long) max + 1;
        System.out.println("使用 long 规避: " + safe);
    }

    private static void stringComparison() {
        System.out.println("=== 字符串比较 ===");
        String a = new String("java");
        String b = new String("java");
        System.out.println("a == b ? " + (a == b));
        System.out.println("a.equals(b) ? " + a.equals(b));
    }

    private static void listModification() {
        System.out.println("=== 集合遍历修改 ===");
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // 错误示例：foreach 中修改会抛 ConcurrentModificationException
        // 正确做法：使用 removeIf 或迭代器
        list.removeIf(item -> item.equals("B"));
        System.out.println("删除后: " + list);
    }

    private static void floatingPoint() {
        System.out.println("=== 浮点精度 ===");
        double sum = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("使用 BigDecimal 更安全");
    }

    private static void integerCache() {
        System.out.println("=== Integer 缓存 ===");
        Integer x = 100;
        Integer y = 100;
        Integer m = 200;
        Integer n = 200;
        System.out.println("x == y ? " + (x == y));
        System.out.println("m == n ? " + (m == n));
        System.out.println("请用 equals 比较包装类型");
    }

    private static void nullPointer() {
        System.out.println("=== 空指针 ===");
        String text = null;
        System.out.println("安全写法: " + "java".equals(text));
    }
}
