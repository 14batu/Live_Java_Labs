package week6_morning;

public class Reverse {
    public static void main(String[] args) {

        String original = "Cydeo";
        System.out.println(reverse(original));

    }

    public static String reverse(String original){

        String reverse="";
        for (int i = original.length() - 1; i >= 0 ; i--){

            reverse += original.charAt(i);

        }
        return reverse;
    }
}
