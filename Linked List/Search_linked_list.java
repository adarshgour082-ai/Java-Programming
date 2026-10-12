public class Search_linked_list{
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
    public static int size;

    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
        
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
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

    public int itrSearch(int key){  //  TC = O(n)
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head , int key){   // TC = O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }
    public int recSearch(int key){
        return helper(head , key);
    }

    public static void main(String[] args){
        Search_linked_list Ll = new Search_linked_list();
        Ll.addFirst(1);
        Ll.addFirst(2);
        Ll.addLast(3);
        Ll.addLast(4);
        
        Ll.Print();

        // System.out.println(Ll.itrSearch(3));
        // System.out.println(Ll.itrSearch(20));

        System.out.println(Ll.recSearch(3));
        System.out.println(Ll.recSearch(20));
        
    }
}