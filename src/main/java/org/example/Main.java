package org.example;

import java.util.ArrayList;
import java.util.UUID;

public class Main {

   public static void main (String[] args) {

      ArrayList<String> contacts = new ArrayList<>();
      ArrayList<String> history = new ArrayList<>();

      Phone p = new Iphone8(10, "green", "aluminium", UUID.randomUUID(), contacts, history);

      Contact a = new Contact(1, "0000000000", "Ana", "Red");

      Message m = new Message("Sa inceapa joaca!");

      p.addContact(a);
      p.displayContact(a);
      p.displayContacts(p);
      p.sendMessage(m);
      p.makeCall(a);
      p.viewHistory();
      p.displayMessage(m);
   }
}
