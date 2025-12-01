package Recursion_pack;

public class circular_game {

        public static int findTheWinner(int n, int k) {
            return recursion(n, k) + 1;
        }

        public static int recursion(int n, int k) {
            if (n == 1) {
                return 0;
            }
            return (recursion(n - 1, k) + k) % n;
        }


    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
}
