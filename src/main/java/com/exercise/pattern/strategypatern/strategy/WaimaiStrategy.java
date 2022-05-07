package com.exercise.pattern.strategypatern.strategy;

import com.exercise.pattern.strategypatern.service.WaimaiService;

/**
 * @author nnfan
 * @date 2022/5/7 10:35 下午
 */
public class WaimaiStrategy extends AbstractStrategy implements Strategy {

    private static final WaimaiStrategy instance = new WaimaiStrategy();
    private WaimaiService waimaiService = new WaimaiService();

    private WaimaiStrategy() {
        register();
    }

    public static Strategy getInstance() {
        return instance;
    }

    @Override
    public void issue(String[] params) {
        waimaiService.issueWaimai();
    }
}

