public class doubly_linked_list{
    
    public static void main(String[] args){
        Linkedlist l1 = new Linkedlist();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.addFirst(5);

        // System.out.println(l1.head.next.next.next.prev.data);

        l1.print();

    }
}
class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
class Linkedlist{
        Node head;

        void add(int data){

            Node newnode = new Node(data);

            
            if(head == null){
                head = newnode;
            }else{
                Node current = head;

                while(current.next != null){
                    current = current.next;
                }
                current.next = newnode;
                newnode.prev = current;
            }

        }
        void addFirst(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
            }
            newnode.next = head;
            head  = newnode;
            
        }

        void print(){
            Node temp = head;
            

            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
}
