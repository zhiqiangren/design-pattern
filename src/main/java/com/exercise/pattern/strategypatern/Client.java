package com.exercise.pattern.strategypatern;


import com.exercise.pattern.strategypatern.strategy.Strategy;
import com.exercise.pattern.strategypatern.strategy.StrategyContext;

public class Client {

    /**
     * 手动加载FoodStrategy...等，
     * 触发service注册
     */

    static {
        try {
            System.out.println("start load strategy...");
            Class.forName("com.exercise.pattern.strategypatern.strategy.FoodStrategy");
            Class.forName("com.exercise.pattern.strategypatern.strategy.HotelStrategy");
            Class.forName("com.exercise.pattern.strategypatern.strategy.WaimaiStrategy");
            System.out.println("end load.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        // 注册机制 
        System.out.println("");
        Strategy waimaiStrategy = StrategyContext.getStrategy("WaimaiStrategy");
        waimaiStrategy.issue(new String[0]);
        Strategy foodStrategy = StrategyContext.getStrategy("FoodStrategy");
        foodStrategy.issue(new String[0]);
        Strategy hotelStrategy = StrategyContext.getStrategy("HotelStrategy");
        hotelStrategy.issue(new String[0]);

    }
}