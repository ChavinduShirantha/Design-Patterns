package lk.ijse.design_patterns.behavioural.strategy_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:20 PM
 **/

public class OperationSubtract implements Strategy {
    @Override
    public int doOperate(int num1, int num2) {
        return num1 - num2;
    }
}
