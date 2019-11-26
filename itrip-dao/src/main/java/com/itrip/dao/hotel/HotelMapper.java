package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;

import java.util.List;

/**
 * 酒店数据访问接口
 */
public interface HotelMapper {
    /**
     * 查询所有酒店
     *
     * @return
     */
    List<Hotel> getHotels();
}
