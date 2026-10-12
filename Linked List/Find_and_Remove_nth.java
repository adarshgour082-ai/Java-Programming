public class Find_and_Remove_nth{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
        
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    public void Print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz= 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        
        if(n == sz){
            head = head.next; //remove First 
            return;
        }

        //sz - n
        int i = 1;
        int toFind = sz - n;
        Node prev = head;
        while(i < toFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
   
    public static void main(String[] args){
        Find_and_Remove_nth Ll = new Find_and_Remove_nth();
        Ll.addFirst(1);
        Ll.addFirst(2);
        Ll.addLast(3);
        Ll.addLast(4);
        Ll.addLast(65);
        Ll.Print();
        Ll.deleteNthfromEnd(2);
        Ll.Print();
    }
}