package passby_test;

public class Shopping {

    void shop(Bank abb, Product product, double quantity) {
        double totalAmount = product.price * quantity;
        abb.drawMoney(totalAmount);
        System.out.println("Mehsulun adi " + product.name);
        System.out.println("Miqdari " + quantity);
        System.out.println("Umumi mebleg " + totalAmount);
    }
}
