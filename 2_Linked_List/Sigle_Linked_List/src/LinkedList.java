public class LinkedList {

    private Node head;
    private  Node tail;

    private int length;

    public LinkedList(int value){
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }



    class Node {
        int Value;
        Node Next;

        public Node(int value){
            this.Value = value;
        }
    }

    public void printHead(){
        System.out.println("Node Head -> " + head.Value);
    }

    public void printTail(){
        System.out.println("Node Tail -> " + tail.Value);
    }

    public void printLenght(){
        System.out.println("Node Length -> " + length);
    }
    public void PrintNode(){
        Node tempNode = head;

        System.out.println();
        while(tempNode != null){
            System.out.print("Next node in line -> " + tempNode.Value);
            tempNode = tempNode.Next;
        }
    }
}
