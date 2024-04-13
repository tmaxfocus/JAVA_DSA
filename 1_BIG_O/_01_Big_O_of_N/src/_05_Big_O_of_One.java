public class _05_Big_O_of_One {

    public static int addItems(int n){
        return n + n; // O(1)
    }
    public static void main(String[] args){
        System.out.println(addItems(10));
    }

    // In this situation as n grows the number of operation still remain the same.
    // O(1) is also called constant time. As N grows the operation remain constant.
}
