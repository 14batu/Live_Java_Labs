package week6_morning;

public class Frequency {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result ="";



        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j))
                    frequency++;
            }
            if (!result.contains(""+ch+frequency))
                result += ""+ch+frequency;
        }
        System.out.println(result);
    }
}
