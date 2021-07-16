package com.iamshashiraj.apis.solutions;

public class LongestPalindromeSubstring {
    private static int resultStart;
    private static int resultLength;
    public static void main(String[] args) {
        String input = "mnopabccbayzy";
        int strLength = input.length();
        if(strLength < 2) {
            System.out.println(input);
        } else {
            for(int start = 0; start< input.length(); start++) {
                getLongestPalindromeSubstring(input, start, start);
                getLongestPalindromeSubstring(input, start, start+1);
            }
            System.out.println(resultStart);
            System.out.println(resultLength);
            System.out.println(input.substring(resultStart, resultLength+resultStart));
        }
    }

    private static void getLongestPalindromeSubstring(String str, int start, int end) {
        while(start >=0 && end < str.length() && str.charAt(start) == str.charAt(end) ) {
            start --;
            end ++;
        }
        if (resultLength < end-start-1){
            resultLength = end - start -1;
            resultStart = start+1;
        }
    }
}
