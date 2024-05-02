public class EquelCase {
    public static void main(String[] args) {
        String a = "Ujang Herlan";
        String b = "Ujang herlan";
        String c = "ujang herlan";

        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(c));
    }
}
