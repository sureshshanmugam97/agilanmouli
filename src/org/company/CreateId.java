package org.company;

public class CreateId {
	
	public CreateId() {
		this(2);
		System.out.println("default constructor");// TODO Auto-generated constructor stub
	}
	
	public CreateId(String name) {
		System.out.println("employee name is"+ name);
	}
		
		public CreateId(int count) {
			this("default");
			System.out.println("id is"+ count);
			
		}
		public static void main(String[] args) {
			CreateId a = new CreateId();
			
		}
	
	
	
	

}
