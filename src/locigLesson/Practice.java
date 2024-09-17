package locigLesson;

public class Practice {
    public static void main(String[] args) {
        String text = "Avtomobil";
        int dongu = 0;


        while (dongu < text.length()) {
            System.out.println(text.substring(dongu,dongu+1));
            {
                dongu++;
            }
        }
    }
}
