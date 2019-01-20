package DoublyLinkedList;

public class DoublyLinkedList {
    
    private static Node head;
    private static Node tail;
    private static int size = 0;
    
    public DoublyLinkedList(){
        
    }
    
    public int countNode(){
        return size;    
    }
    
    public void print(){
        Node temp = head;
        //System.out.println("Here");
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }System.out.println((temp.data));
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void addAtHead(Object data){
        
        if(isEmpty()){
            Node newNode = new Node(data);
//            newNode.next = null;
//            newNode.previous = null;
            head = newNode;
            tail = newNode;
        }else{
            Node temp = head;
            head = new Node(data);
            head.previous = null;
            head.next = temp;
            temp.previous = head;
        }
        size++;
//        
//        
//        
//        Node newNode = new Node(data);
//        //System.out.println("in add");
//        if(isEmpty()){
//            tail = newNode;
//            newNode.next = null;
//            newNode.previous = null;
//            head = newNode;
//        }else{
//            head.previous = newNode;
//            newNode.next = head;
//            newNode.previous = null;
//        }
//        size++;
    }
    
    public void addAtTail(Object data){
        Node newNode = new Node(data);
        if(isEmpty()){
            tail = newNode;
            newNode.next = null;
            newNode.previous = null;
            head = tail;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
            newNode.next = null;
        }
        size++;
    }
    
    public void addAtIndex(int index, Object data){
        if (isEmpty()) {
            addAtHead(data);
        } else if (index < 0 || index > size) {
            //System.out.println("Invalid Index Entered, the data will be inserted at the end of the list.");
            addAtTail(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node afterWalaNode = temp.next;
            Node newNode = new Node(data);
            newNode.next = afterWalaNode;
            newNode.previous = temp;
            temp.next = newNode;
            afterWalaNode.previous = newNode;
        }
        size++;
    }
    
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.addAtHead(2);
        //System.out.println(size);
        myList.addAtHead(8);
        //System.out.println(size);
        myList.addAtHead(79);
        //System.out.println(size);
        //myList.print();
        myList.addAtHead(3);
        //System.out.println(size);
        //myList.print();
        myList.addAtTail(16);
        myList.addAtTail(20);
        myList.addAtTail(54);
        myList.addAtIndex(5, 15);
        myList.addAtIndex(2, 18);
        myList.print();
        System.out.println("No. of Nodes = "+ size);
    }
    
    private class Node{
        
        private Object data;
        private Node next;
        private Node previous;
        
        public Node(Object incomingData){
            this.data = incomingData;
        }
    }
}
