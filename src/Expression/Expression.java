package Expression;

import CspProblem.Variable;

import java.util.Map;

/**
 * Created by Monis on 4/19/15.
 */
interface Expression {
    public int interpret(Map<String, Variable> variables);
}