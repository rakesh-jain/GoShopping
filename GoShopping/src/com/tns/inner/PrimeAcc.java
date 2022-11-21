package com.tns.inner;

public class PrimeAcc extends ShopAcc{
public static boolean isPrime;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}
	public void bookProduct(float charges)
	{
		System.out.println("Charges are: "+charges);
	}
	@Override
	public String toString() {
		return "PrimeAcount Details:-\nAcount Number-\t" + getAccNo() + "\nAccount Name-\t"+getAccNm()+"\ncharges-\t" + getCharges();
	
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		PrimeAcc.isPrime = isPrime;
	}
	
}
