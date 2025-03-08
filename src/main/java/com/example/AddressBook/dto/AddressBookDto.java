package com.example.AddressBook.dto;

public class AddressBookDto {
    private Long id;
    private String name;
    private String email;
    private String phone;

    public AddressBookDto() {}

    public AddressBookDto(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPassword(String phone) {
        this.phone = phone;
    }
}
