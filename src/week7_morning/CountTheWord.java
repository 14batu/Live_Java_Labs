package week7_morning;

public class CountTheWord {

    public static void main(String[] args) {

        String str = "java JAVA Java jAvA python Python";
        String word = "java";

        int count = 0;

        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i,i + word.length()).equalsIgnoreCase(word)){
                count++;

            }
        }
        System.out.println(count);
    }


}
/*
2. Create a class named CountTheWord. Given the following two String variables:
            str
            word

    Write a program that counts how many times the given word has appeared in the string `str`.

            Example:
                str = "java JAVA Java jAvA python Python"
                word = "java"

            Output:
                4
 */