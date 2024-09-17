public class String_Reverse {

    public static void main(String[] args) {

        String rvrs = "salam";
        String tersi = "";
        for (int i = rvrs.length() - 1; i >= 0; i--) {
            tersi += rvrs.charAt(i);
        }

        System.out.println(tersi);
    }
}
