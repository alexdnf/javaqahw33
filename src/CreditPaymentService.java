public class CreditPaymentService {

    public int calculate(int amount, double rate, int months) {

        double monthsRate = (rate / 100) / 12;
        double payment = (amount * monthsRate) / (1 - Math.pow(1 + monthsRate, -months));
        return (int) payment;
    }
}
