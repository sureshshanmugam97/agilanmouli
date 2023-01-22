package org.company;

public class CompanyData implements DataInfo {
	private void companyName() {
		System.out.println("enter name");// TODO Auto-generated method stub

	}
	private void empId() {
		System.out.println("enter id");// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		CompanyData a = new CompanyData();
		a.companyName();
		a.empId();
		a.clientName();
		a.clientData();
		
	}
	@Override
	public void clientName() {
		System.out.println("enter client");// TODO Auto-generated method stub
		
	}
	@Override
	public void clientData() {
		System.out.println("enter data");// TODO Auto-generated method stub
		
	}
	

}
