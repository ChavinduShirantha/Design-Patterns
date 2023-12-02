package lk.ijse.design_patterns.behavioural.strategy_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:19 PM
 **/

public class OperationAdd implements Strategy{
    @Override
    public int doOperate(int num1, int num2) {
        return num1+num2;
    }
}
