package ru.netology;

public class CreditPaymentService {
    public String calculate(double sum, double percent, int term) {
//        double r = Math.pow(1 + percent / 100, 1.0 / 12.0);
//        double q = Math.pow(r, 12.0 * term);
//        double a = (sum * q * (r - 1)) / (q - 1);
//        String monthlyPayment = String.format("%.0f", a);
//        return monthlyPayment;

        double r = percent / (100 * 12);
        double q = Math.pow(1 + r, -12 * term);
        double a = sum * (r / (1 - q));
        String monthlyPayment = String.format("%.0f", a);
        return monthlyPayment;
    }
}
