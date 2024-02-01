package week7_morning;

public class CapetClient {
    public static void main(String[] args) {
        Carpet carpet = new Carpet();

        carpet.width = 10;
        carpet.length = 18;
        carpet.unitPrice = 4.0;
        carpet.isPersian = true;

        System.out.println(carpet);
    }
}
