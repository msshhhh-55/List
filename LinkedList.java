
public class LinkedList {
    private Node head;
    private int count;

    public LinkedList(Node head) {
        this.head = head;
        this.count = 1;
    }

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public int Count() {
        return count;
    }
    public Node getLastNode(){
        Node lastNode = this.head;
        for(int i = 0; i < count-1; i++){
            lastNode = lastNode.getNext();
        }
        return lastNode;
    }
    public boolean isEmpty(){
        return this.Count() == 0;
    }

    public void addNode(Node new_node){
        if (this.isEmpty()){
            this.head = new_node;
        }
        else{
            getLastNode().setNext(new_node);
        }
        this.count++;
    }
    public Node get(int n){
        if(this.Count() <= n){
            throw new ArrayIndexOutOfBoundsException("Индекс выходит за рамки списка!");
        }
        Node currNode = this.head;
        for(int i = 0; i < n; i++){
            if(i == n){
                break;
            }
            else{
                currNode = currNode.getNext();
            }
        }
        return currNode;

    }

    public void removeNode(Node node) {
        Node next = node.getNext();
        Node last = this.head;
        if(node == this.head){
            this.head = node.getNext();
            this.count--;
        }
        for(int i = 1; i < this.Count(); i++){
            if(this.get(i) == node){
                last.setNext(next);
                this.count--;
            }
            else{
                last = last.getNext();
                // node = node.getNext();
            }
        }


    }
}