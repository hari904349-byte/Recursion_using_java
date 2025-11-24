package Recursion_pack;

import java.util.ArrayList;

public class Recursion_on_strings {
    public static void main(String[] args) {
        System.out.println(subseqret("","abc"));
    }


   public static String removeCharacter(String s){
        if(s.isEmpty()){
            return "";
        }

        char ch=s.charAt(0);
        if(ch=='a'){
            return removeCharacter(s.substring(1));
        }
        else{
            return ch+ removeCharacter(s.substring(1));
        }
   }

   // remove String from the original String

    public static String removeString(String s){
        if(s.isEmpty()){
            return " ";
        }
        char ch=s.charAt(0);
        if(s.startsWith("apple")){
            return removeString(s.substring(5));
        }else{
            return ch+ removeString(s.substring(1));
        }
    }

    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    public static ArrayList<String> subseqret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= subseqret(p+ch, up.substring(1));
        ArrayList<String> rigth=subseqret(p, up.substring(1));

        left.addAll(rigth);
        return left;
    }

}

