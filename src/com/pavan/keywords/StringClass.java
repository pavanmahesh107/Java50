package com.pavan.keywords;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Pavan");
        String s3 = new String("Hello");

        String s4 = "Pavan Mahesh";
        String s5 = " paVan maHESH ";

        System.out.println(s5.length());
        System.out.println(s5.trim().length());
        System.out.println(s5.toUpperCase());
//      System.out.println(s4.startsWith("p"));
        System.out.println(s5.endsWith("h"));
        char [] a = s5.toCharArray();
        System.out.println(a);
//      System.out.println(s5.toCharArray());
        System.out.println(s5.indexOf("a"));
//      System.out.println(s1.equals(s3));

        System.out.println(s4.substring(5));

    }
}
