package week6_morning;

public class isPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("level"));

    }

    public static boolean isPalindrome(String original){


        String reverse="";
        for (int i = original.length() - 1; i >= 0 ; i--){

            reverse += original.charAt(i);

        }
        return reverse.equalsIgnoreCase(original);
    }
}
