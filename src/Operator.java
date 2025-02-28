public enum Operator {
    PLUS('+'),
    MINUS('-'),
    MULTIPL('*'),
    DIVIDE('/');

    private Character operator;

    Operator(Character operator) {
        this.operator = operator;
    }

    public static double operatorProcess(int number, int secondNumber, Operator simvol) {
        if (Operator.PLUS.equals(simvol))
            return plus(number, secondNumber);
        else if (Operator.MINUS.equals(simvol))
            return minus(number, secondNumber);
        else if (Operator.DIVIDE.equals(simvol))
            return divide(number, secondNumber);
        else return multipl(number, secondNumber);
    }

    private static double plus(int number, int secondNumber) {
        return number + secondNumber;
    }

    private static double minus(int number, int secondNumber) {
        if (number > secondNumber)
            return number - secondNumber;
        else return secondNumber - number;
    }

    private static double divide(int number, int secondNumber) {
        if (number > secondNumber) return (double) number / secondNumber;
        else return (double) secondNumber / number;
    }

    private static double multipl(int number, int secondNumber) {
        return secondNumber * number;
    }

}
