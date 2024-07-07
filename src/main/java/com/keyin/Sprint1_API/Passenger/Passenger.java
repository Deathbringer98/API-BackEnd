package com.keyin.Sprint1_API.Passenger;

import com.keyin.Sprint1_API.City.City;
import com.keyin.Sprint1_API.City.CityService;

import java.util.List;

public class Passenger {

    private int passenger_id;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private City city;

    public Passenger(int passenger_id, String firstName, String lastName, String phoneNum, City city) {
        this.passenger_id = passenger_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.city = city;
    }


    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id){
        this.passenger_id = passenger_id;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getPhoneNum () {
        return phoneNum;
    }

    public void setPhoneNum (String phoneNum){
        this.phoneNum = phoneNum;
    }

    public City getCity () {
        return city;
    }

    public void setCity (City city){
        this.city = city;
    }

}

