package Recursion_pack;

import java.util.Arrays;

public class Selectionsort {

    // 3,4,2,1  r=4, c=0, m=0
    public static int[] sorting(int arr[], int r, int c , int max){
        if(r==0){
            return arr;
        }

        if(r>c){
            if(arr[c]>arr[max]){
                return sorting(arr, r, c+1, c);
            }else{
                return sorting(arr, r, c+1, max);
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            return sorting(arr, r-1, 0, 0);
        }

    }

    public static void main(String[] args) {
        int arr[]={3, 4, 1, 2};

        System.out.println(Arrays.toString(sorting(arr, arr.length, 0, 0)));
    }
}
