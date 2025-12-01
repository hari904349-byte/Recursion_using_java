package Recursion_pack;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class phonepad {

    public static void main(String[] args) {
        System.out.println(padret("","12"));
    }

    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int value=up.charAt(0)-'0';
        for(int i=(value-1)*3;i<value*3;i++){
            char ch=(char) ('a'+i);
            pad(p+ch, up.substring(1));
        }
    }
    public static ArrayList<String> padret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;
        }

        int value=up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        for(int i=(value-1)*3;i<value*3;i++){
            char ch=(char) ('a'+i);
            ans.addAll(padret(p+ch, up.substring(1)));
        }
        return ans;
    }
}
