package org.example;


public class Contact {
   public int index;
   public String phoneNumber;
   public String FirstName;
   public String LastName;

   public Contact (int index, String phoneNumber, String FirstName, String LastName) {
      this.index = index;
      this.phoneNumber = phoneNumber;
      this.FirstName = FirstName;
      this.LastName = LastName;
   }

   public String getContactDetails (Contact contact) {
      return index + phoneNumber + FirstName + LastName;
   }
}
