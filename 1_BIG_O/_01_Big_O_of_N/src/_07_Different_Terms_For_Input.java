public class _07_Different_Terms_For_Input {

    public static void printItems(int a , int b){
        for(int i =0; i < a; i++){
            System.out.println(i); // O(a)
        }

        for(int j =0; j < b; j++){
            System.out.println(j); //(Ob)
        }

        // In this instance big O will not be O(2n) instead
        // we are going to have big O( a + b) since they are on different N;
    }

    public static void printItemsII(int a , int b){
        for(int i =0; i < a; i++){
            for(int j =0; j < b; j++){
                System.out.println(i + " " + j); //(Ob)
            } // O(a)
        }



        // In this instance big O will not be O(n square) instead
        // we are going to have big O( a * b) since they are on different N;
    }
    public static void main(String[] args){
        printItems(10,5);
    }
}
