public class whilecut {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            int count = 0;
            int k = 1;
            while (k <= i) {
                if ((i % k) == 0) {
                    count++;
                }
                k++;
            }
            if (count == 2) {
                System.out.println(i);
            }
            i++;
        }
    }
}

