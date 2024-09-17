package homework_calculator;

import java.util.Scanner;

public class MainCalculator1 {

    public static void main(String[] args) {

        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = scan.nextInt();
        System.out.println("b-ni daxil edin");
        int b = scan.nextInt();
        System.out.println("hansini istifade etmek isteyirsen?");
        String islem = scan.next();
        if((a==0 || b==0 && (islem.equals("*") || (islem.equals("/"))))){
            System.out.println("0-a vurma ve 0-a bolme yoxdur");
        } else {

            if (islem.equals("+")){
                result = sum(a,b);
            }
            else if(islem.equals("-")){
                result = subtraction(a,b);
            }
            else if(islem.equals("*")){
                result = multiplication(a,b);
            }
            else if(islem.equals("/")){
                result = division(a,b);
            }else System.out.println("yalniz + , - , * , /  - bunlar ist'fad' oluna biler");
            System.out.println(result);

        }




    }

    public static int sum(int a,int b){
        return a+b;

    }

    public static int subtraction(int a,int b){
        return a-b;
    }

    public static int multiplication(int a,int b){
        return a*b;
    }

    public static int division(int a,int b){
        return a/b;
    }


}































