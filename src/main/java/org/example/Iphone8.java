package org.example;

import java.util.ArrayList;
import java.util.UUID;

public class Iphone8 extends Apple implements Phone {
   private final int batteryLife;
   public String color;
   public String material;
   public ArrayList<String> contacts = new ArrayList<String>();
   public ArrayList<String> history = new ArrayList<>();


   public Iphone8 (int batteryLife, String color, String material, UUID uuid, ArrayList<String> contacts, ArrayList<String> history) {
      this.batteryLife = batteryLife;
      this.color = color;
      this.material = material;
      UUID uuid1 = UUID.randomUUID();
      this.contacts = contacts;
      this.history = history;
   }


   @Override
   public void addContact (Contact contact) {
      contacts.add(contact.toString());

   }


   @Override
   public void displayContact (Contact contact) {
      System.out.println(contact.index);
      System.out.println(contact.phoneNumber);
      System.out.println(contact.FirstName);
      System.out.println(contact.LastName);

   }

   @Override
   public void displayContacts (Phone phone) {
      System.out.println(contacts);

   }

   @Override
   public void sendMessage (Message message) {
      int i = batteryLife - 1;
      System.out.println(batteryLife);
      if (message.toString().length() < 500) {
         System.out.println("was sent");
      } else {
         System.out.println("was NOT sent");
      }
   }

   @Override
   public void displayMessage (Message message) {
      System.out.println(message.toString());
   }

   @Override
   public void makeCall (Contact contact) {
      int i = batteryLife - 2;
      System.out.println(contact.phoneNumber.toString());
      history.add(contact.phoneNumber);
   }

   @Override
   public void viewHistory () {
      history.toString();

   }
}