package mk.ukim.finki.aud3.calculator;

public class Multiplication implements Strategy {
    @Override
    public double doOperation(double num1, double num2) {
        return num1 * num2;
    }
}
