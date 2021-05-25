/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author Agung Rivalzo
 */
class Contact {
    private String nama;
    private String email;
    private String phoneNumber;

    public Contact(String nama, String email, String phoneNumber) {
        this.nama = nama;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNama() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
