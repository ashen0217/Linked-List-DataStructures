package AverageLinklist;

import AverageLinklist.Link;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Link Nipuna = new Link("Nipuna",53.5);
        Link Aravinda = new Link("Aravinda",78.0);
        Link Prashani = new Link("Prashani",69.5);

        Nipuna.next = Aravinda; //Nipuna.next.next=Prashani
        Aravinda.next = Prashani;
        Prashani.next = null;

        Nipuna.displayDetails();
        Aravinda.displayDetails();
        Prashani.displayDetails();

    }
}