import java.util.*;
class LinkedList 
{
 Node head;
 
   class Node {
     String data;
     Node next;
     Node (String d) {
            data = d; 
            next = null;
        }
    }
   void printReverse(Node head)
    {
        if (head == null) return;
 
        // print list of head node
        printReverse(head.next);
 
        // After everything else is printed
        System.out.print(head.data+" ");
    }
   void printMiddle()
   {
    Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null)
        {
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                                slow_ptr.data + "] \n");
        }
        
    }
 
   
  