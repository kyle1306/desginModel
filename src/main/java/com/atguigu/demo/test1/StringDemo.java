package com.atguigu.demo.test1;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abc123";
        String s2 = "bde3a";
        String commonChar = getCommonChar(s1, s2);
        System.out.println(commonChar);
    }
    public static String getCommonChar(String str1,String str2){
        StringBuffer sb = new StringBuffer();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if(chars2[j] == chars1[i]){
                    sb.append(chars1[i]);
                }
            }
        }
        return sb.toString();
    }
}
