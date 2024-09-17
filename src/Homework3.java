public class Homework3 {
    public static void main(String[] args) {

        int bal = 71;
        if (bal >= 0 && bal <= 50) {
            System.out.println("kesilmisen");
        } else if (bal >= 51 && bal <= 60) {
            System.out.println("E almisan");
        } else if (bal >= 61 && bal <= 70) {
            System.out.println("D almisan");
        } else if (bal >= 71 && bal <= 80) {
            System.out.println("C almisan");
        } else if (bal >= 81 && bal <= 90) {
            System.out.println("B almisan");
        } else if (bal >= 91 && bal <= 100) {
            System.out.println("A almisan");
        } else if (bal < 0) {
            System.out.println("0 ve 100 araliginda eded daxil ede bilersen");
        } else if (bal > 100) {
            System.out.println("100 den boyuk eded daxil ede bilmersen");
        }


    }
}
