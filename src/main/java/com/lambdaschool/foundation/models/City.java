package com.lambdaschool.foundation.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "city")
public class City extends Auditable
{
    @Id
    private long city_id;


//    @Column(unique = true)
    private String cityName;


//    @Column(unique = true)
    private String state;


//    @Column(unique = true)
    private double lat;


//    @Column(unique = true)
    private double lon;




    private long population;
    private double median_age;
    private long median_household_income;
    private long median_individual_income;
    private long median_home_cost;
    private long median_rent;
    private double Cost_of_Living_Index;


    public City()
    {
    }

    public City(long cityid, String cityName, String state, double lat, double lon, String city, long population, double median_age, long median_household_income, long median_individual_income, long median_home_cost, long median_rent, double cost_of_Living_Index)
    {
        this.city_id = cityid;
        this.cityName = cityName;
        this.state = state;
        this.lat = lat;
        this.lon = lon;
        this.population = population;
        this.median_age = median_age;
        this.median_household_income = median_household_income;
        this.median_individual_income = median_individual_income;
        this.median_home_cost = median_home_cost;
        this.median_rent = median_rent;
        this.Cost_of_Living_Index = cost_of_Living_Index;
    }

    public long getCityid()
    {
        return city_id;
    }

    public void setCityid(long cityid)
    {
        this.city_id = cityid;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }


    public double getLat()
    {
        return lat;
    }

    public void setLat(double lat)
    {
        this.lat = lat;
    }

    public double getLon()
    {
        return lon;
    }

    public void setLon(double lon)
    {
        this.lon = lon;
    }


    public long getPopulation()
    {
        return population;
    }

    public void setPopulation(long population)
    {
        this.population = population;
    }

    public double getMedian_age()
    {
        return median_age;
    }

    public void setMedian_age(double median_age)
    {
        this.median_age = median_age;
    }

    public long getMedian_household_income()
    {
        return median_household_income;
    }

    public void setMedian_household_income(long median_household_income)
    {
        this.median_household_income = median_household_income;
    }

    public long getMedian_individual_income()
    {
        return median_individual_income;
    }

    public void setMedian_individual_income(long median_individual_income)
    {
        this.median_individual_income = median_individual_income;
    }

    public long getMedian_home_cost()
    {
        return median_home_cost;
    }

    public void setMedian_home_cost(long median_home_cost)
    {
        this.median_home_cost = median_home_cost;
    }

    public long getMedian_rent()
    {
        return median_rent;
    }

    public void setMedian_rent(long median_rent)
    {
        this.median_rent = median_rent;
    }

    public double getCost_of_Living_Index()
    {
        return Cost_of_Living_Index;
    }

    public void setCost_of_Living_Index(double cost_of_Living_Index)
    {
        Cost_of_Living_Index = cost_of_Living_Index;
    }


}
