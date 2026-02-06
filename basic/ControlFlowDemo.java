public class ControlFlowDemo {
    public static void main(String[] args) {
        int score = 86;

        System.out.println("=== 条件判断 ===");
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        System.out.println("=== for 循环 ===");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1..5 的和 = " + sum);

        System.out.println("=== while 循环 ===");
        int count = 3;
        while (count > 0) {
            System.out.println("倒计时: " + count);
            count--;
        }
    }
}
