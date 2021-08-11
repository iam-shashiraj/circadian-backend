package com.iamshashiraj.apis.solutions;

public class IntToRoman {
    public static void main(String[] args){
        int number = 324;
        System.out.println(convertIntToRoman(number));
    }

    private static String convertIntToRoman(int num) {
        String[] hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return hundreds[num/100] + tens[(num%100)/10] + units[num%10];
    }
}
