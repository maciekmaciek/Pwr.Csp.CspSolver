package Expression;

import CspProblem.Variable;

import java.util.Map;

/**
 * Created by Monis on 4/19/15.
 */
public class Lower implements Expression {
    Expression leftOperand;
    Expression rightOperand;
    public Lower(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(Map<String, Variable> variables)  {
        return leftOperand.interpret(variables) < rightOperand.interpret(variables) ? 1 : 0;
    }
}
