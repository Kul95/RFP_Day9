package com.practice.AddressBook;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program. ");
        ContactServices details = new ContactServices();
        Scanner sc1 = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println(" 1 Add ");
            System.out.println(" 2 Display ");
            System.out.println(" 3 Delete ");
            System.out.println("4 Update ");
            System.out.println("Enter your choice:");
            choice = sc1.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Contact details ");
                    details.add();
                    break;
                case 2:
                    System.out.println("Display Contact details ");
                    details.display();
                    break;
                case 3:
                    System.out.println("Delete details ");
                    details.delete();
                    break;
                case 4:
                    System.out.println("Update details ");
                    details.update();
                    break;
            }

        } while (choice != 0);

    }
}
