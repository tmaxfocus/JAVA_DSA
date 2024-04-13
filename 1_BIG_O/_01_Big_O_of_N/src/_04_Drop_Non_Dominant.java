public class _04_Drop_Non_Dominant {
    public static void printItems(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < n ; j++){
                System.out.println(i + " " + j); // n * n = n square --> O(n square)
            }
        }

        for(int k = 0 ; k < n ; k++){

                System.out.println(k ); // n * n = n square --> O(n)

        }

        // the equation becomes O(n square + n) -> in this instance O(n square)
        // runs faster and grows faster than O(n) so the n square becomes dominant
        //term, the n becomes non-dominant term. as N becomes larger the big O(n) starts
        // to become irrelevant so we drop O(n)
    }
    public static void main(String[] args){
        printItems(10);
    }
}
