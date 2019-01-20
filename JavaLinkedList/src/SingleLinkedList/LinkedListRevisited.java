package SingleLinkedList;

public class LinkedListRevisited {
    
    private static Node head;
    private static int countNodes=1;
    
    public LinkedListRevisited(Object data){
        head = new Node(data);
    }
    
    public void addAtHead(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        countNodes++;
    }
    
    public void addAtTail(Object data){
        Node temp = head;
        
        while(temp.next!=null){
            temp = temp.next;
                    
        }
        temp.next = new Node(data);
        countNodes++;

        
        // 2   4   3   8    6   7
        //add 5 to 3rd index
        // find val and return index else -1;
        // delete ke 3 types
        // find bug in add at index
        // find size of linkedlist
        
    }
    
    public void addAtIndex(int index, Object data){
        // if user puts index more than size of list, 
        // the data is inserted at the end of the list.
        
        Node temp = head;
        
        for(int i=0; i<index-1 && temp.next!=null; i++){
            temp = temp.next;
        }
        Node afterWalaNode = temp.next;
        Node newNode = new Node(data);
        temp.next = newNode;
        newNode.next = afterWalaNode;  
        countNodes++;

        
       
        
    }
    
    public void print(){
        Node temp = head;
        
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        
        
    }
    
    public int countNodes(){
        return countNodes;
    }
    
    public void deleteHead(){
        Node temp = head;
        head = temp.next;
            countNodes--;
        }

        public void deleteTail(){
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        //System.out.println();
        countNodes--;
    }
    
    public void deleteAtIndex(int index){
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        countNodes--;
    }
    
    
    public static void main(String[] args) {
        LinkedListRevisited myList = new LinkedListRevisited(6);
        myList.addAtHead(51);
        myList.addAtHead(45);
        myList.addAtHead(48);
        //myList.addAtTail(99);
        //myList.addAtIndex(1,43);
//        myList.print();
//        System.out.println("Total Nodes = "+myList.countNodes());        
//        myList.deleteHead();
        
        //myList.print();
        //System.out.println("Total Nodes = "+myList.countNodes());
        //myList.print();
        //System.out.println("Total Nodes = "+myList.countNodes());        
//        myList.deleteTail();
        //myList.deleteAtIndex(2);
        myList.print();
        //System.out.println("Total Nodes = "+myList.countNodes());
    }
    
    class Node{
        
        private Object data;
        private Node next;
        
        public Node(Object incomingData){
            this.data = incomingData;
        }
        
    }
    
    
}
