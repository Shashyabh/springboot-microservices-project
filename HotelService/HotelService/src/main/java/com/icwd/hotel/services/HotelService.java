package com.icwd.hotel.services;

import com.icwd.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);
    List<Hotel>getAll();
    Hotel get(String id);
}