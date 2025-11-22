package Recursion_pack;

public class pattern_using_recursion {
    public static void main(String[] args) {
        int n=4;
        print(4,0);
    }
    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void print(int row, int col){
        if(row==0){
            return;
        }
        if(row>col){
            System.out.print("*");
            print(row, col+1);
        }else{
            System.out.println();
            print(row-1,0);
        }
    }

}
