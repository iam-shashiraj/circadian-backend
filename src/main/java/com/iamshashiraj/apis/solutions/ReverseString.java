package com.iamshashiraj.apis.solutions;

public class ReverseString {
    public static void main(String[] args) {
        String inputString = "Hello Me!";
        System.out.println(reverseStringWithStringBuilder(inputString));
        System.out.println(reverseManually(inputString));
        System.out.println(reverseWithoutStringBuilder(inputString));
    }

    private static String reverseStringWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    private static String reverseManually(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() -1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    private static String reverseWithoutStringBuilder(String str) {
        String result = "";

        for (int i = str.length() -1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
