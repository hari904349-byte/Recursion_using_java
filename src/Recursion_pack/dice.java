package Recursion_pack;

import java.util.ArrayList;

public class dice {

    public static void main(String[] args) {
        System.out.println(thrownret("",4));
    }
    public static void thrown(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        for(int i=1;i<=target;i++){
            thrown(p+i,target-i);
        }
    }

    public static ArrayList<String> thrownret(String p, int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=target;i++) {
            list.addAll(thrownret(p + i, target - i));
        }
        return list;

    }
}
