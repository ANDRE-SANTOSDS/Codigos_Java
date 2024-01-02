package services;

public interface OnlinePaymentService {

    public abstract double paymentFree(Double amount);
    public abstract double interest(Double amount, Integer months);
}
