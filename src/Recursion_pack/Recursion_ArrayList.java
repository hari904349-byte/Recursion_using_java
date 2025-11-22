package Recursion_pack;

import java.util.ArrayList;

public class Recursion_ArrayList {

    public static ArrayList<Integer> LinearSearch(int arr[], int target, int index, ArrayList<Integer> l){
        if(index==arr.length){
            return l;
        }
        if(arr[index]==target){
            l.add(index);
        }
        return LinearSearch(arr, target, index+1, l);
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 4, 5, 3, 7};
        int target=4;
        int index=0;
        ArrayList<Integer> l=new ArrayList<>();
        LinearSearch(arr, target, index, l);
        System.out.println(l);
    }
}
