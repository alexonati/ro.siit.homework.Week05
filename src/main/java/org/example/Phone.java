package org.example;

public interface Phone {
   void addContact (Contact contact);

   void displayContact (Contact contact);

   void displayContacts (Phone phone);

   void sendMessage (Message message);

   void displayMessage (Message message);

   void makeCall (Contact contact);

   void viewHistory ();
}