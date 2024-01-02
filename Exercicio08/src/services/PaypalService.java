package services;

public class PaypalService implements OnlinePaymentService{
	 @Override
	    public double paymentFree(Double amount) {
		     double imposto;
	         imposto = (amount/100) * 2;

	         return imposto;
	    }

	    @Override
	    public double interest(Double amount, Integer months) {
	        Double interest = ((amount/100) * months);

	        return interest;

	    }
}
