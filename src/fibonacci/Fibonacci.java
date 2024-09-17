package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

        int ilksay = 1;
        int ikincisay = 1;
        System.out.println(ilksay);
        System.out.println(ikincisay);
        for (int i = 0; i < 10; i++) {
            int temp = ikincisay;
            ikincisay = ikincisay + ilksay;
            ilksay = temp;
            System.out.println(ikincisay);
        }
    }
}



