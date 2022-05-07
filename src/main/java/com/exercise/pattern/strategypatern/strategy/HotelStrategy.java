package com.exercise.pattern.strategypatern.strategy;

import com.exercise.pattern.strategypatern.service.HotelService;

/**
 *
 *
 * @author nnfan
 * @date 2022/5/7 10:33 下午
 */
public class HotelStrategy extends AbstractStrategy implements Strategy{

    private static final HotelStrategy instance = new HotelStrategy();

    private HotelStrategy() {
        register();
    }

    public static Strategy getInstance() {
        return instance;
    }

    private HotelService hotelService = new HotelService();

    @Override
    public void issue(String[] params) {
        hotelService.issueHotel();
    }
}
