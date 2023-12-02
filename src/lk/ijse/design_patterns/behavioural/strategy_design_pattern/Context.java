package lk.ijse.design_patterns.behavioural.strategy_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:19 PM
 **/

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperate(num1,num2);
    }
}
