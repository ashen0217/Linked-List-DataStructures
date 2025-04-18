package AverageLinklist;

public class LinkList {

    private Link first;

    public LinkList(){
        first = null;
    }

    //isEmpty() method
    public boolean isEmpty(){
        return (first == null);
    }

    //insert method
    public void insertFirst(String name , double avg){
        Link newlink = new Link(name,avg);
        newlink.next = first;
        first = newlink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        Link current = first; //in order to start from the begining
        while(current != null){
            current.displayDetails(); //print links
            current = current.next; //move to next link
        }
    }
}
