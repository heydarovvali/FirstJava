package if_else_menimsetme;

public class Menimsetme {
    public static void main(String[] args) {

       int a = 12;
       int b = 13;
       int c = 14;

       if(a<b && a<c){
           System.out.println("a en kicikdir");
       }
       else if(b<a && b<c){
           System.out.println("b en kicikdir");
       }
       else if(c<a && c<b){
           System.out.println("c en kicikdir");
       } else{
           System.out.println("duzgun deyil");
       }


    }
}
