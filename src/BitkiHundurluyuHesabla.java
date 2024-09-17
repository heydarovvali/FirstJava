public class BitkiHundurluyuHesabla {
    public static void main(String[] args) {

        double hundurluk = 2.0; // ilk hundurluk 2 sm;
        double suMiqradi = 1.0; // ilk gunde verilen su miqradi 1 litr;
        int gun = 1; // ilk gun;

        while (hundurluk <= 100.0) {
            // hundurluk artir
            hundurluk += suMiqradi * 5;//
            suMiqradi *= 1.5;
            gun++;


        }
        System.out.println("Bitkinin hundurluyu " + gun + " gunde 100 santimetr artir");

    }
}
