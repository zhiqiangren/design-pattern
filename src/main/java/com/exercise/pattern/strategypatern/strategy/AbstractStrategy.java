package com.exercise.pattern.strategypatern.strategy;

/**
 * @author nnfan
 * @date 2022/5/7 10:27 下午
 */
abstract class AbstractStrategy implements Strategy {

    public void register() {
        System.out.println("register class : " + getClass().getSimpleName());
        StrategyContext.registerStrategy(getClass().getSimpleName(), this);
    }

}
