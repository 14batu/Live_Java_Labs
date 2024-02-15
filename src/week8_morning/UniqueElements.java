package week8_morning;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String[] inputArray = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};
        Arrays.sort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0 && !inputArray[i].equals(inputArray[i+1]) || !inputArray[i].equals(inputArray[i-1]) && !inputArray[i].equals(inputArray[i+1])){
                System.out.println(inputArray[i]);
            }
        }


    }

}
/*
1. Write a program that identifies the unique elements in an array of Strings.
		   Example:
		      Input array: {"Java", "Python", "Python", "Ruby", "Ruby", "C#"}

		   Output:
		      Java
		      C#

 */