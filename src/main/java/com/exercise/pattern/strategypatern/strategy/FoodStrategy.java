package com.exercise.pattern.strategypatern.strategy;

import com.exercise.pattern.strategypatern.service.FoodService;

/**
 *
 *
 * @author nnfan
 * @date 2022/5/7 10:24 下午
 */
public class FoodStrategy extends AbstractStrategy implements Strategy {

    private static FoodStrategy instance = new FoodStrategy();

    private FoodStrategy() {
        // 注册自己
        register();
    }

    public static Strategy getInstance() {
        return instance;
    }

    private FoodService foodService = new FoodService();

    @Override
    public void issue(String[] params) {
        foodService.issueFood();
    }
}
