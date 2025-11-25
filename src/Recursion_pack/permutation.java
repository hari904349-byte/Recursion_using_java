package Recursion_pack;

import java.util.ArrayList;

public class permutation {
    public static void permutate(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String first=p.substring(0, i);
            String second=p.substring(i, p.length());
            permutate(first+ch+second, up.substring(1));
        }
    }

    public static ArrayList<String> permutatestring(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> result=new ArrayList<>();
            result.add(p);
            return result;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0, i);
            String second=p.substring(i, p.length());
            ans.addAll(permutatestring(first+ch+second, up.substring(1)));
        }
        return ans;
    }

    // count number of permutation

    public static int permutatecount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0, i);
            String second=p.substring(i, p.length());
            count+=permutatecount(first+ch+second, up.substring(1));
        }
        return count;
    }


    public static void main(String[] args) {
        //permutate("","abc");
       // ArrayList<String> a=permutatestring("", "abc");
        System.out.println(permutatecount("", "abc"));
    }
}
