package Recursion_pack;

import java.util.ArrayList;

public class Recursion_array {

    public static void main(String[] args) {
        int arr[]={1, 2, 4, 3, 5,3 ,12, 3 , 3,0};
        int index=0;
        int target=3;
        printingIndex(arr, target, index);
        System.out.println(l);

        System.out.println(linearSearch(arr, 5, index));
       // System.out.println(checking(arr, index)==false? "Duplicate Array": "Not Duplicate Array");
    }
    // sorted Array or not
    public static boolean checking(int arr[], int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && checking(arr, index+1);
    }

    // Linear Search Using recursion
    // find index
    public static int linearSearch(int arr[], int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearch(arr, target, index+1);
    }

    // if element exists or not

    public  static boolean Exists(int arr[], int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || Exists(arr, target, index+1);
    }

    // find the elemnt in multiple index and put it in the arraylist
    static ArrayList l=new ArrayList();
    public static ArrayList printingIndex(int arr[], int target, int index){

        if(index==arr.length){
            return l;
        }

        if(arr[index]==target){
            l.add(index);
        }
        return printingIndex(arr, target, index+1);
    }
}
