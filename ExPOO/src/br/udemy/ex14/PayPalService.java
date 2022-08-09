package br.udemy.ex14;

public class PayPalService implements IPaymentService {
	
	final private double FEE = 0.01;
	final private double TAX_PAYMENT = 0.02;
	
	
	public double paymentValue(double amountValue, int contInstallments, int cont) {
		return (((amountValue/contInstallments) + (amountValue/contInstallments) * FEE * cont) + (TAX_PAYMENT * ((amountValue/contInstallments) + (amountValue/contInstallments) * FEE * cont)));
	}

}
