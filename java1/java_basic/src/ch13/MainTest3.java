package ch13;

public class MainTest3 {
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("이춘식");		
		customerLee.setCustomerID(100);
		
		// 구매
		customerLee.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer vipCustomerKim = new VIPCustomer();
		vipCustomerKim.setCustomerName("김춘식");
		vipCustomerKim.setCustomerID(100);
		
		// 구매
		vipCustomerKim.calcPrice(10000);
		System.out.println(vipCustomerKim.showCustomerInfo());
		
		
		
	}

}
