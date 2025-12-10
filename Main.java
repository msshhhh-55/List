public class Main {
    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        Node n0 = new Node(0, n1);

        LinkedList ll = new LinkedList(n0);
        ll.addNode(n1);
        ll.addNode(n2);
        ll.addNode(n3);
        ll.addNode(n4);
        ll.addNode(n5);

        System.out.println(ll.Count());
        System.out.println(ll.get(2).getValue());
        ll.removeNode(n2);
        System.out.println(ll.get(2).getValue());
        System.out.println(ll.isEmpty());
        System.out.println(new LinkedList().isEmpty());
        System.out.println(new LinkedList().Count());
    }
}