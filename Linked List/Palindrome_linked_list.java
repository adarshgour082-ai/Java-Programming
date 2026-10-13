public class Palindrome_linked_list{
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
    //slow - fast approch 
    public Node findMid(Node head){
        Node slow =head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next;
        }
        return slow;   // slow is mid node

    }
    public boolean checkPalindrome(){
        if(head  == null || head.next == null){
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step 2 - reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // this is right half head
        Node left = head;// this is left half head

        //step 3 - check left half && right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

   
    public static void main(String[] args){
        Palindrome_linked_list Ll = new Palindrome_linked_list();
        Ll.addFirst(2);
        Ll.addFirst(1);
        Ll.addLast(3);
        Ll.addLast(2);
        Ll.addLast(1);
        Ll.Print();
        System.out.println(Ll.checkPalindrome());       
    

    }
}