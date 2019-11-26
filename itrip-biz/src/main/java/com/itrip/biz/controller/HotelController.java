package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.hotel.HotelService;
import com.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 酒店控制器
 */
@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    private HotelService service;

    @RequestMapping(value = "/hotel/queryhotels", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Dto queryHotels() {
        List<Hotel> hotels = service.getHotels();
        return DtoUtil.returnSuccess("查询酒店成功", hotels);
    }
}
