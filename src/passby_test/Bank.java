package passby_test;

public class Bank {

    double balace;

    public Bank(double balace) {
        this.balace = balace;
    }

    void drawMoney(double amount) {
        this.balace -= amount;
    }

    void showBalance() {
        System.out.println("cari balans " + balace);
    }
}
