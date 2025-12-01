package Recursion_pack;

import java.util.Arrays;

public class reverseString {

    public static String reverse(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        return reverse(s.substring(1))+ch;
    }

    public static void reverse(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        reverse(ch+p,up.substring(1));
    }

    public static String reverseEachWord(String s){
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=reverse(arr[i]);
        }
        String ans="";
        for(String x: arr){
            ans+=x;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello world"));
        reverse("","hello world");
        String str="Hello world";
        System.out.println(reverseEachWord(str));
    }
}
