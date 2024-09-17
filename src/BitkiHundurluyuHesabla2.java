public class BitkiHundurluyuHesabla2 {
    public static void main(String[] args) {
        double hundurluk = 2.0;  // ilk hundurluk 2sm
        double sumiqdari = 1.0;  // ilk gunde verilen su miqdari
        int gun = 1;  // ilk gun
        while (hundurluk <=100.0){
            hundurluk += sumiqdari *5;
            sumiqdari *= 1.5;
            gun++;
        }
        System.out.println("bitkinin hundurluyu " + gun + " gunde 100 sm artir");
    }
}
