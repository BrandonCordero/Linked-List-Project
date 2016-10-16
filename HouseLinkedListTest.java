public class HouseLinkedListTest
{
public static void main(String[] args) {
          HouseLinkedList lList = new HouseLinkedList();



        // add elements to LinkedList
        lList.add("Brandon");
        lList.add("Irene");
        lList.add("Martin");
        lList.add("Emily");
        lList.add("Alec");

        System.out.println("lList - print houselinkedlist: " + lList);
        System.out.println("lList.remove(2) - remove 2nd element: " + lList.remove(2));
        System.out.println("lList - print houselinkedlist: " + lList);
       
    }



}
class HouseLinkedList {
    // reference to the head node.
    private Node head;
    private int listCount;

    // LinkedList constructor
    public HouseLinkedList() {
        head = new Node(null);
        listCount = 0;
    }
    
     public void add(Object data)
    // appends the specified element to the end of this list.
    {
        Node houseTemp = new Node(data);
        Node houseCurrent = head;
        // starting at the head node, crawl to the end of the list
        while (houseCurrent.getNext() != null) {
            houseCurrent = houseCurrent.getNext();
        }
        // the last node's "next" reference set to our new node
        houseCurrent.setNext(houseTemp);
        listCount++;// increment the number of elements variable
    }

   public boolean remove(int index)
    // removes the element at the specified position in this list.
    {
        
        if (index < 1 || index > size())
            return false;

        Node houseCurrent = head;
        for (int i = 1; i < index; i++) {
            if (houseCurrent.getNext() == null)
                return false;

            houseCurrent = houseCurrent.getNext();
        }
        houseCurrent.setNext(houseCurrent.getNext().getNext());
        listCount--; // decrement the number of elements variable
        return true;
    }
     public int size()
    // returns the number of elements in this list.
    {
        return listCount;
    }

    public String toString() {
        Node houseCurrent = head.getNext();
        String output = "";
        while (houseCurrent != null) {
            output += "[" + houseCurrent.getData().toString() + "]";
            houseCurrent = houseCurrent.getNext();
        }
        return output;
    }
    
    
    