package array_homework;

public class ArrayHomeWork {

    public static void main(String[] args) {

        int number[] = {45, 96, 74, 23, 36, 44};
        int largest = 0;

        for (int i = 1; i < number.length; i++) {
            if (number[i] > largest) {

                largest = number[i];
                System.out.println(" MAX " + largest);
                System.out.println();
            }


        }

        int[] num = new int[5];
        num[0] = 5;
        num[1] = 4;
        num[2] = 2;
        num[3] = 5;
        num[4] = 3;

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        int length = num.length;
        System.out.println("massivin elemenlerinin cemi " + sum);

        double average = sum / length;
        System.out.println("massivin elemetlerinin ededi ortasi " + average);

        int enkicik = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < enkicik)
                enkicik = num[i];
        }

        System.out.println("massivin elementlerinin en kiciyi " + enkicik);

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println("massivin elemetlerinin tek olani " + num[i]);
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("massivin elemetlerinin cut olani " + num[i]);
            }
        }


    }
}




