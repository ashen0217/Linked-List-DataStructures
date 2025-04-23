# Linked List DataStructures
 Linked list data structure

Package Declaration
java
Copy
Edit
package AverageLinklist;
This declares that the class is part of the AverageLinklist package — a namespace for organizing classes.

🧱 Class Declaration
java
Copy
Edit
public class Link {
Defines a public class called Link, which will represent a node in a linked list. Each node will hold:

A name (e.g., of a student)

An avg (average, like grade average)

A next pointer to the next Link in the list

🧩 Class Fields
java
Copy
Edit
public String name;
public double avg;
public Link next;
These are the data members of each node:

name: the person's name

avg: their average (like score or grade)

next: reference to the next node (used in the linked list)

🧱 Constructor
java
Copy
Edit
public Link(String name,double avg){
    this.name = name;
    this.avg = avg;
    this.next = null;
}
This is the constructor. It initializes a new Link object:

Sets name and avg from the passed arguments

Sets next to null (it doesn’t point to any other node yet)

🔍 Method to Display Node Info
java
Copy
Edit
public void displayDetails(){
    System.out.println("Name: \t"+name+ "\tAverage:\t"+avg);
}
This method just prints out the details of the node in a readable format.

🧠 Summary
This class represents a single node in a singly linked list, where:

Each node contains a name, avg, and a pointer to the next node.

You can create a list by chaining multiple Link objects via their next reference.

The displayDetails() method is used to print the contents of a node.




Package Declaration
java
Copy
Edit
package AverageLinklist;
This declares that the class is part of the AverageLinklist package — a namespace for organizing classes.

🧱 Class Declaration
java
Copy
Edit
public class Link {
Defines a public class called Link, which will represent a node in a linked list. Each node will hold:

A name (e.g., of a student)

An avg (average, like grade average)

A next pointer to the next Link in the list

🧩 Class Fields
java
Copy
Edit
public String name;
public double avg;
public Link next;
These are the data members of each node:

name: the person's name

avg: their average (like score or grade)

next: reference to the next node (used in the linked list)

🧱 Constructor
java
Copy
Edit
public Link(String name,double avg){
    this.name = name;
    this.avg = avg;
    this.next = null;
}
This is the constructor. It initializes a new Link object:

Sets name and avg from the passed arguments

Sets next to null (it doesn’t point to any other node yet)

🔍 Method to Display Node Info
java
Copy
Edit
public void displayDetails(){
    System.out.println("Name: \t"+name+ "\tAverage:\t"+avg);
}
This method just prints out the details of the node in a readable format.

🧠 Summary
This class represents a single node in a singly linked list, where:

Each node contains a name, avg, and a pointer to the next node.

You can create a list by chaining multiple Link objects via their next reference.

The displayDetails() method is used to print the contents of a node.

