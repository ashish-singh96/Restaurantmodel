package com.example.Restaurantmodel.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //Getter Setter
@NoArgsConstructor //Default Constructor
@AllArgsConstructor //Argument all Constructor

public class Restaurant {
    private int id;
    private String name;
    private String address;
    private String number;
    private String specialty;
    private String totalStaff;
    private String ratings;


}
