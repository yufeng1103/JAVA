public class BasicSyntaxDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        double c = 2.5;

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        double quotient = a / c;

        System.out.println("=== 基本运算 ===");
        System.out.printf("%d + %d = %d%n", a, b, sum);
        System.out.printf("%d - %d = %d%n", a, b, diff);
        System.out.printf("%d * %d = %d%n", a, b, product);
        System.out.printf("%d / %.1f = %.2f%n", a, c, quotient);

        boolean isAdult = true;
        char grade = 'A';
        String name = "Java Learner";

        System.out.println("=== 类型示例 ===");
        System.out.println("isAdult = " + isAdult);
        System.out.println("grade = " + grade);
        System.out.println("name = " + name);
    }
}
