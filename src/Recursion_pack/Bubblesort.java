package Recursion_pack;

import java.util.Arrays;

public class Bubblesort {
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int[] sortsimple(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;

    }

    public static int[] ssorting(int arr[]){
        //4, 2, 1, 3
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr, i, min);

        }
        return arr;
    }

    public static int[] bsorting(int arr[],int n, int j){
        if(n==0){
            return arr;
        }
        if(j<n){
            if(arr[j]>arr[j+1]){
                swap(arr, j, j+1);
            }
            return bsorting(arr, n, j+1);
        }else{
            return bsorting(arr, n-1, 0);
        }
    }


    public static void main(String[] args) {
        int arr[]={4, 5, 3, 1, 2};
        System.out.println(Arrays.toString(ssorting(arr)));
        //System.out.println(Arrays.toString(bsorting(arr, arr.length-1 , 0)));
       // System.out.println(Arrays.toString(sortsimple(arr)));
    }
}
