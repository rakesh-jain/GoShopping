package com.tns.inner;

public class ShopAcc {
	//fields
	protected static int accNo;
	public static String accNm;
	private float charges;
	
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		ShopAcc.accNm = accNm;
	}
	
	//Constructor
	public ShopAcc(int accNo, String accNm, float charges) 
	{

		ShopAcc.accNo = accNo;
		this.setAccNm(accNm);
		this.charges = charges;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Product booked and charges are:"+charges);
	}
	public void items(float charges)
	{
		System.out.println("Items are delivered with charges :"+charges);
	}
	@Override
	public String toString() {
		return "ShopAccount Details:-\nAcount Number-" + accNo + "\nAcount Name-" + getAccNm() + " charges-" + charges ;
	}
	
	
}
