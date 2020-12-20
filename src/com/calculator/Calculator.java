package com.calculator;

public class Calculator {

    static int instanceCount;

    public Calculator() {
        instanceCount+=1;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    /**
     * Вычитание из start всех остальных values
     * @param start
     * @param values
     * @return
     */
    public static double subsAll(double start, double... values) {
        double result = start;

        for (double a:values) {
            result -=a;
        }

        return result;
    }

    /**
     * Сложение всех values
     * @param values
     * @return
     */
    public static double sumAll(double... values) {
        double result = 0;

        for (double a:values)
            result += a;

        return result;
    }

    /**
     * Умножение всех values
     * @param values
     * @return
     */
    public static double multAll(double... values) {
        double result = 1;

        for (double a:values)
            result *= a;

        return result;
    }

    /**
     * Деление start на все остальные values
     * @param start
     * @param values
     * @return
     */
    public static double divAll(double start, double... values) {
        double result = start;

        for (double a:values) {
            if(a != 0 && result != 0) {
                result = result / a;
            }
        }

        return result;
    }

    /**
     * Получение процента от числа
     * Процент может быть только в дипазоне от 0 до 100
     * @param number
     * @param percent
     * @return
     */
    public static double percent(double number, double percent) {

        if (percent<0 || percent >100) return number;

        return number*percent/100;

    }

}
