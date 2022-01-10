package ru.netology;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        String monthlyPayment1year = service.calculate(1_000_000, 9.99, 1);
        System.out.println("Ежемесячный платеж составит: " + monthlyPayment1year + " при сроке кредита на 1 год");
        String monthlyPayment2year = service.calculate(1_000_000, 9.99, 2);
        System.out.println("Ежемесячный платеж составит: " +  monthlyPayment2year + " при сроке кредита  на 2 года");
        String monthlyPayment3year = service.calculate(1_000_000, 9.99, 3);
        System.out.println("Ежемесячный платеж составит: " + monthlyPayment3year + " при сроке кредита  на 3 года");
    }
}
