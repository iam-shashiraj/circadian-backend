package com.iamshashiraj.apis.solutions;

public class IntegerReverse {
    public static void main(String[] args) {
        int number = 54321;
        String reversedNumber= "";
        long reverse = 0;

        while(number > 0) {
            int reminder = number%10;
            reverse = reverse* 10 + reminder;
            number /= 10;
        }
        System.out.println(reverse);
    }
}
