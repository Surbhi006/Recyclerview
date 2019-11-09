package com.example.recyclerview;

public class ContactList {
    private String name;
    private int photo;
    private String Phone;

    public ContactList() {
    }

    public ContactList(String name, int photo, String phone) {
        this.name = name;
        this.photo = photo;
        Phone = phone;
    }

    public ContactList(String name, String phone) {
        this.name = name;
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    public String getPhone() {
        return Phone;
    }
}
