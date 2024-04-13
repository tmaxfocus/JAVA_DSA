public class _02_Drop_Constants {

    public static void printItems(int n){
        for(int i =0; i < n ; i++){
            System.out.println(i); //O(n)
        }

        System.out.println();
        System.out.println("Print " + n + " in reverse order.");

        for(int j=n; j > 0 ; j-- ){
            System.out.println((j));// O(n)
        }
        //  O(n) + O(n) = O(2n) --> Drop the constant --> O(n)
        //In this instance you have to drop 2 as it is a constant
    }
    public static void main(String[] args){
        printItems(10);
    }
}
