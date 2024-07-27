package calculator;

public class ArithmeticCalculator extends Calculator {
    private double result;
    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;

    ModOperator modOperator;

    public ArithmeticCalculator () {
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
        this.modOperator = new ModOperator();
    }
    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void calculate(int num1, int num2, char operator) {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        switch (operatorType) {
            case ADD:
                this.result = addOperator.operate(num1, num2);
                break;
            case SUB:
                this.result = subtractOperator.operate(num1, num2);
                break;
            case MUL:
                this.result = multiplyOperator.operate(num1, num2);
                break;
            case DIV:
                this.result = divideOperator.operate(num1, num2);
                break;
            case MOD:
                this.result = modOperator.operate(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }

        this.results.add(this.result);
    }
}
