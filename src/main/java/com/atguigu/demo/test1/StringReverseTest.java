package com.atguigu.demo.test1;

import java.util.Stack;

public class StringReverseTest {

    public static void main(String[] args) {
        String str = "abcdefg";
        String s = reverse2(str);
        System.out.println(s);
    }

   //方法7 利用stack的特性 先进后出
    public static String reverse7(String s) {
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length; i++)
            stack.push(str[i]);

        String reversed = "";
        for (int i = 0; i < str.length; i++)
            reversed += stack.pop();
        return reversed;
    }

    // 方法6 双指针，数组交换位置
    public static String reverse6(String s) {
        char[] str = s.toCharArray();
        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
            //交换
            str[begin] = (char) (str[begin] ^ str[end]);
            str[end] = (char) (str[begin] ^ str[end]);
            str[begin] = (char) (str[end] ^ str[begin]);
            begin++;
            end--;
        }
        return new String(str);
    }

    // 方法5 把字符串转换成字符数组首位对调位置
    public static String reverse5(String orig) {
        char[] s = orig.toCharArray();
        int n = s.length - 1;
        int halfLength = n / 2;
        for (int i = 0; i <= halfLength; i++) {
            char temp = s[i];
            s[i] = s[n - i];
            s[n - i] = temp;
        }
        return new String(s);
    }

    // 方法4 调用StringBuffer中的reverse方法
    public static String reverse4(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    // 方法3 把字符串转换成字符数组倒叙拼接然后返回值
    public static String reverse3(String s) {
        char[] array = s.toCharArray(); // 将字符串转成字符数组
        String reverse = "";
        for (int i = array.length - 1; i >= 0; i--)
            reverse += array[i];
        return reverse;
    }

    // 方法2 通过 charAt(int index)返回char值进行字符串拼接
    public static String reverse2(String s) {
        int length = s.length();
        String reverse = "";
        for (int i = 0; i < length; i++)
            reverse = s.charAt(i) + reverse; // 这个反转的写法真是漂亮
        return reverse;
    }

    // 方法1 递归方法
    public static String reverse1(String s) {
        int length = s.length();
        if (length <= 1){
            return s;
        }
        String left = s.substring(0, length / 2);
        String right = s.substring(length / 2, length);
        return reverse1(right) + reverse1(left);
    }
}
