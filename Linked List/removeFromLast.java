public class removeFromLast{
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null ;
        }

    }
    static Node head = null;
    static Node tail = null;
    static int size  =  0;
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail =  newNode;
            size++;
            return;
            
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public static void remove(){
       
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return;
    }
    public static void findValue(int val){
        Node curr = head;
        while(curr.next.data != val && curr.next.next != null){
                curr = curr.next;
            }

        curr.next = curr.next.next;
    
    }
    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
        // System.out.print(size);
    }
    public static void main(String[] args){

        removeFromLast l1 = new removeFromLast();
        l1.add(10);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.print();
        l1.findValue(40);
        l1.print();
        l1.remove();
        l1.print();
        

    }
}