package com.example.Restaurantmodel.controller;

import com.example.Restaurantmodel.model.Restaurant;

import com.example.Restaurantmodel.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantServices;
    @GetMapping(value = "/getAllRestaurant")
    public List<Restaurant> getAllRestaurant(){
        return restaurantServices.getAllList();
    }
    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable int id){
        Restaurant restaurant = restaurantServices.getRestaurantById(id);
        return restaurant;
    }
    @PostMapping(value = "/addRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantServices.addRestaurant(restaurant);

    }

    @PutMapping("/{id}/{speciality}")
    public String updateSpeciality(@PathVariable int id ,@PathVariable String speciality){
        return restaurantServices.updateSpecialityById(id,speciality);
    }

    @DeleteMapping("/{id}")
    public String deleteRestaurantById(@PathVariable int id){
        return restaurantServices.deleteRestaurantById(id);
    }
}
