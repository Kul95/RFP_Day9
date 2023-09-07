package com.practice.AddressBook;

import java.util.HashSet;
import java.util.Scanner;

public class ContactServices {
    HashSet<Contact> hs = new HashSet<>();
    Contact c1 = new Contact("Kuldeep", "Sharma", "IMT", "Gurgoan", "Hariyana", 789645, 98348578, "kul123@gmail.com");
    Contact c2 = new Contact("John", "Denial", "XYZ", "California", "LossAngles", 589746, 893948578, "john678@gmail.com");
    Contact c3 = new Contact("Mina", "Sindhi", "Punch", "Jalandhar", "Punjab", 569874, 655348578, "meena193@gmail.com");

    Scanner sc = new Scanner(System.in);
    boolean found = false;
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    int phoneNumber;
    String email;

    public ContactServices() {
        hs.add(c1);
        hs.add(c2);
        hs.add(c3);
    }

    public void add() {
        System.out.println("Enter the first name: ");
        firstName = sc.next();
        System.out.println("Enter the last name: ");
        lastName = sc.next();
        System.out.println("Enter the address: ");
        address = sc.next();
        System.out.println("Enter the city: ");
        city = sc.next();
        System.out.println("Enter the state: ");
        state = sc.next();
        System.out.println("Enter the zip: ");
        zip = sc.nextInt();
        System.out.println("Enter the phone number: ");
        phoneNumber = sc.nextInt();
        System.out.println("Enter the email: ");
        email = sc.next();
        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        hs.add(contact);
        System.out.println(contact);
        System.out.println("Contact details added successfully..");
    }

    public void display() {
        for (Contact info : hs) {
            System.out.println(info);
        }
    }

    public void update() {
        System.out.println("Enter the phone number: ");
        phoneNumber = sc.nextInt();
        boolean found = false;
        for (Contact info : hs) {
            if (info.getPhoneNumber() == phoneNumber) {
                System.out.println("Enter the first name: ");
                firstName = sc.next();
                System.out.println("Enter the last name: ");
                lastName = sc.next();
                System.out.println("Enter the address: ");
                address = sc.next();
                System.out.println("Enter the city: ");
                city = sc.next();
                System.out.println("Enter the state: ");
                state = sc.next();
                System.out.println("Enter the zip: ");
                zip = sc.nextInt();
                System.out.println("Enter the phone number: ");
                phoneNumber = sc.nextInt();
                System.out.println("Enter the email: ");
                email = sc.next();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact details is not present.");
        } else {
            System.out.println("Contact details updated successfully");
        }
    }

    public void delete() {
        System.out.println("Enter the id:");
        phoneNumber = sc.nextInt();
        boolean found = false;
        Contact missing = null;
        for (Contact info : hs) {
            if (info.getPhoneNumber() == phoneNumber) {
                missing = info;
                found = true;
            }
            if (!found) {
                System.out.println("Contact details is not present");
            } else {
                hs.remove(missing);
                System.out.println("Contact details deleted successfully");
            }
        }
    }
}
