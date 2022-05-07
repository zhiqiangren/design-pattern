package com.exercise.pattern.strategypatern.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyContext {

    public static final Map<String, Strategy> registerMap = new HashMap<>();

    public static void registerStrategy(String simpleName, Strategy strategy) {
        registerMap.putIfAbsent(simpleName, strategy);
    }

    public static Strategy getStrategy(String rewardType) {
        return registerMap.get(rewardType);
    }


}
