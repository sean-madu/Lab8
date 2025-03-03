package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }
    /**
     * Check to see if has city works
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assert(list.hasCity(city));
    }
    /**
     * Test delete city
     *
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        int count = list.getCount();
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(count, list.getCount());
    }

    /**
     * test count cities
     */
    @Test
    public void countCitytest(){
        list = MockCityList();
        assertEquals(0, list.getCount());
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(1, list.getCount());
    }
    }
