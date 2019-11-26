package com.itrip.beans.pojo;

import java.io.Serializable;

/**
 * 酒店
 */
public class Hotel implements Serializable {
    private Integer id;
    private String hotelName;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
