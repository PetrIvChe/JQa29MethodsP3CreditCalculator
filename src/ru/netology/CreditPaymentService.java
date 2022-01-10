package ru.netology;

public class CreditPaymentService {
    public String calculate(double sum, double percent, int term) {
//// формула расчета аннуитентого кредита А=К*(P+(P/(1+P)*M-1)), где i -месячная ставка по кредиту
////К -сумма кредита- sum
////P - процентная ставка - percent
////M- срок кредита - term
//        int q = (int) Math.pow(1+percent/12,term-1);//(1+percent)*term-1)
//        int monthlyPayment = (int) (sum * (percent + (percent / q)));
//        return monthlyPayment;
//    }

        // https://ru.wikipedia.org/wiki/%D0%90%D0%BD%D0%BD%D1%83%D0%B8%D1%82%D0%B5%D1%82
        // (1+r/12)^12n n- срок кредита - term
        //              r- годовая ставка -percent
        double r = Math.pow(1 + percent / 100, 1.0 / 12.0);

        double q = Math.pow(r, 12.0 * term);
        double a = (sum * q * (r - 1)) / (q - 1);
        String monthlyPayment = String.format("%.0f", a);
        return monthlyPayment;

    }
}
