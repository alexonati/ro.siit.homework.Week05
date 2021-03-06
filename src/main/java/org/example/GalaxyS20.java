package org.example;

import java.util.ArrayList;
import java.util.UUID;

public class GalaxyS20 extends Samsung implements Phone {

   private final int batteryLife;
   private final String color;
   private final String material;
   private final UUID uuid;
   private Object Contact;
   private ArrayList contacts;
   private ArrayList messages;
   private ArrayList history;

   public GalaxyS20 (int batteryLife, String color, String material, UUID uuid) {
      this.batteryLife = batteryLife;
      this.color = color;
      this.material = material;
      this.uuid = UUID.randomUUID();
   }


   @Override
   public void addContact (Contact contact) {
      contacts.add(contact);

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
         System.out.println(message + "was sent");
      }
      System.out.println(message + "was NOT sent");
   }

   @Override
   public void displayMessage (Message message) {
      message.toString();

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
