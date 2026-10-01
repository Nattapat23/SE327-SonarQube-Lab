package se331;

public class AdvancedCalculator extends Calculator {
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(int a)throws IllegalAccessException{
        if (a<0){
            throw new IllegalAccessException("cannot calculate sqrt root of a negative number.");
        }
        return Math.sqrt(a);
    }

}
