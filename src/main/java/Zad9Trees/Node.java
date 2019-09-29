package Zad9Trees;

public class Node {
    private Node parent;
    private Node left;
    private Node right;
    private Integer value;

    public Node(int newVal){
        value = newVal;
    }

    public void insert(Node currentNode, int newValue){
        if (this.value < newValue){

        }
        else if (this.value > newValue){
            // ...
        } else { // if new value is equal to the current value, do nothing
            return;
        }
    }
}
