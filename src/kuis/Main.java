/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.Scanner;

/**
 *
 * @author Agung Rivalzo
 */
public class Main {
    public static void main(String[] args){
        String nama, email, phoneNumber, cari, ulang;
        
        do {
            ContactsManager Manager = new ContactsManager();

            nama = "AGUNG";
            email = "agungrivalzo7@gmail.com";
            phoneNumber = "081272264186";
            Contact kontak1 = new Contact(nama, email, phoneNumber);
            Manager.addContact(kontak1);

            nama = "FRISKA";
            email = "Friska10@gmail.com";
            phoneNumber = "023429083";
            Contact kontak2 = new Contact(nama, email, phoneNumber);
            Manager.addContact(kontak2);

            nama = "IVAN";
            email = "Rivanka12@gmail.com";
            phoneNumber = "08124548478";
            Contact kontak3 = new Contact(nama, email, phoneNumber);
            Manager.addContact(kontak3);

            nama = "RIRIS";
            email = "Riris00@gmail.com";
            phoneNumber = "08987663243";
            Contact kontak4 = new Contact(nama, email, phoneNumber);
            Manager.addContact(kontak4);
            
            nama = "ADRIAN";
            email = "Adrian29@gmail.com";
            phoneNumber = "081286788634";
            Contact kontak5 = new Contact(nama, email, phoneNumber);
            Manager.addContact(kontak5);

            Scanner input = new Scanner(System.in);
            System.out.print("search name : "); cari = input.nextLine();
            System.out.println("Looking for " + cari + "'s contact . .");
            
            Contact result = Manager.searchContact(cari.toLowerCase());
            
            if(result != null){
                System.out.println("Name         : " + result.getNama());
                System.out.println("Phone Number : " + result.getPhoneNumber());
                System.out.println("E-mail       : " + result.getEmail());
            }else{
                System.out.println("Data Tidak Ditemukan Ya, Mohon Coba Lagi");
            }
            
            System.out.print("\nAgain? (y/n) : "); ulang = input.nextLine();
            System.out.println("");
            if("n".equals(ulang)){
                System.exit(0);
            }
        } while (true);                     
        
    }
    
}
