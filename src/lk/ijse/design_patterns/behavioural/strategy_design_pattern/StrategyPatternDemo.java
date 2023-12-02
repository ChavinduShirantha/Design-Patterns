package lk.ijse.design_patterns.behavioural.strategy_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:21 PM
 **/

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10,5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = "+context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+context.executeStrategy(10,5));
    }
}
