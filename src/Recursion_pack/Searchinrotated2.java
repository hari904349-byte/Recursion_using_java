package Recursion_pack;

public class Searchinrotated2 {
    public static boolean Search(int arr[], int target){
        if(BinarySearch(arr, target, 0, arr.length-1)==-1){
            return false;
        }
        return true;
    }

    public static int BinarySearch(int arr[], int target, int s, int e){
            if(s>e){
                return -1;
            }
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            // 4,5,1,2,3
            if(arr[s]<=arr[m]){
                if(target<=arr[m] && target>=arr[s]){
                    return BinarySearch(arr, target, s, m-1);
                }
                else{
                    return BinarySearch(arr, target, m+1, e);
                }
            }
            if(target>=arr[m]&& target<=arr[e]){
                return BinarySearch(arr, target, m+1, e);
            }else{
                return BinarySearch(arr, target, s, m-1);
            }
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,0,0,1,2};
        int target=3;
        System.out.println(Search(arr, target));
    }
}
