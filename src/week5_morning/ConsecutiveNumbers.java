package week5_morning;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        System.out.println(consecutiveNumbers(17));
    }

    public static String  consecutiveNumbers(int n){

        String result = "";

        for (int i = 1; i <=n; i++) {
            String temp= "";

            if (i % 2 == 0){
                temp += "Codility";
            }
            if (i % 3 == 0) {
                temp += "Test";
            }
            if (i % 5 == 0) {
                temp += "Coders";
            }
            if (result.isEmpty()){
                temp+=""+i;
            }
            result+=temp+"\n";

        }
        return result;
    }
}
