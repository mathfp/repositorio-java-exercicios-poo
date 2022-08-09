package br.udemy.ex14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		String dateString = sc.next();
		Date date = sdf.parse(dateString);
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Enter number of Installments: ");
		int countInstallments = sc.nextInt();
		
		PaymentService service = new PaymentService(countInstallments, new Contract(number, date, totalValue), new PayPalService());
		
		service.paymentProcess();
		
		System.out.println("Installments:");
		
		for(Installment installment : service.getContract().getListInstallments()) {
			System.out.println(installment.toString());
		}
		sc.close();
	}
}
