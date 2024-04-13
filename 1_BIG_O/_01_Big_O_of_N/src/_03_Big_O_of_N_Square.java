public class _03_Big_O_of_N_Square {

    public static void printItems(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < n ; j++){
                System.out.println(i + " " + j); // n * n = n square --> O(n square)
            }
        }
    }
    public static void main(String[] args){
        printItems(10);
    }
}
