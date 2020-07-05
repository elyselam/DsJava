package LinkedList;


public class Node {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.append(1);
        l.append(2);
        l.append(3);
        System.out.println(l);
        l.deleteWithValue(2);
        System.out.println(l);
        l.prepend(5);
        System.out.println(l);
    }

    Node next;
    int data;
    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data + " " + next;
    }
}

//class wraps the head
class LinkedList {
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return; //done with function
        }
        //current node always at head
        Node current = head;
        //while not at the end of the linkedlist, keep moving
        while (current.next != null) {
            current = current.next;
        }
        //now at the end of linkedlist, create this new node
        current.next = new Node(data);
    }

    public void prepend(int data) {
        //
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead; //change head pointer
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        //if head is the one we want removed, just reassign to the next value
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        //as long as not at the end of list
        while (current.next != null) {
            //if next value is the one you want to delete
            if (current.next.data == data) {
                //just skip it
                current.next = current.next.next;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" + "head=" + head + '}';
    }

   public boolean hasCycle(Node head) {
        if (head == null) return false;
        Node fast = head.next;
        Node slow = head;
        //fast.next != null to make sure fast.next.next wont give nullPointerException
        while (fast != null && fast.next != null && slow != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
   }
}




