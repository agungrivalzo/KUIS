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
public class ContactsManager{
    Contact [] myFriends;
    int friendsCount;
    
    ContactsManager(){
        myFriends = new Contact[500];
        friendsCount = 0;      
    }
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
        Contact searchContact(String searchNama){
            boolean ada;
        for(int i = 0; i < friendsCount; i++){
            if(myFriends[i].getNama().toLowerCase().equals(searchNama)){
                return myFriends[i];
            }
        }
        return null;
        }
}
