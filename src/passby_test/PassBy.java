package passby_test;

public class PassBy {
    public static void main(String[] args) {

        Bank myBank = new Bank(100);
        Product alma = new Product("Alma", 2.5);
        Product alca = new Product("Alca", 3.5);
        Product banan = new Product("Banan", 4);

        myBank.showBalance();

        System.out.println();

        Shopping shopping = new Shopping();
        shopping.shop(myBank, alma, 3);
        System.out.println();
        shopping.shop(myBank, banan, 1.2);
        System.out.println();
        shopping.shop(myBank, alca, 2.3);
        System.out.println();

        myBank.showBalance();
    }
}
