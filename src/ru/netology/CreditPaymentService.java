package ru.netology;

public class CreditPaymentService {
    public String calculate(double sum, double percent, int term) {
        double r = percent / (100 * 12);
        double q = Math.pow(1 + r, -12 * term);
        double a = sum * (r / (1 - q));
        String monthlyPayment = String.format("%.0f", a);
        return monthlyPayment;
    }
}
