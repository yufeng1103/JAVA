import java.util.Arrays;

public class ArrayStringDemo {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5};
        System.out.println("原始数组: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("排序后数组: " + Arrays.toString(numbers));

        String text = "  Java Learning  ";
        String trimmed = text.trim();
        String replaced = trimmed.replace("Learning", "Basics");
        String[] words = replaced.split(" ");

        System.out.println("原始字符串: [" + text + "]");
        System.out.println("去空格: [" + trimmed + "]");
        System.out.println("替换后: [" + replaced + "]");
        System.out.println("分割结果: " + Arrays.toString(words));
    }
}
