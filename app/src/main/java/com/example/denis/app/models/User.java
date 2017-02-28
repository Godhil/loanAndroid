package com.example.denis.app.models;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String login;
    private Role role;
    private Office office;
    private Status status;
    private String password;

    private enum Role { Administrator, Accountant, Cashier, RiskManager }

    private enum Status { Active, Banned }
}