package com.example.denis.app.models;

public class Office {

    private Long id;
    private String name;
    private String city;
    private String address;
    private Status status;

    private enum Status {
        Open,
        Close
    }
}
