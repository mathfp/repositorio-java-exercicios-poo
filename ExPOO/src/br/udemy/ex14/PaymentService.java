package br.udemy.ex14;

import java.util.Calendar;

public class PaymentService {

	private int countInstallments;
	private Contract contract;

	IPaymentService paymentService;
	Calendar cal = Calendar.getInstance();

	public PaymentService(int countInstallments, Contract contract, IPaymentService paymentService) {
		this.countInstallments = countInstallments;
		this.contract = contract;
		this.paymentService = paymentService;
	}

	public void paymentProcess() {
		cal.setTime(contract.getDate());
		for (int i = 0; i < countInstallments; i++) {
			cal.add(Calendar.MONTH, 1);
			contract.getListInstallments().add(new Installment(cal.getTime(),
					paymentService.paymentValue(contract.getTotalValue(), countInstallments, (i + 1))));
		}
	}

	public int getCountInstallments() {
		return countInstallments;
	}

	public void setCountInstallments(int countInstallments) {
		this.countInstallments = countInstallments;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
}
