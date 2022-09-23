package OOP1;
public class Main {

	public static void main(String[] args) {
        //set
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(4);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(4);
		product2.setImageUrl("image2.jpg");
		
		
		Product product3 = new Product();
		product3.setName("Vestel Kahve Makinesi");
		product3.setDiscount(8);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(5);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		//get
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05555555555");
		individualCustomer.setPhone("1573592468");
		individualCustomer.setFirstName("Emre");
		individualCustomer.setLastName("Tamam");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("11111111");
		corporateCustomer.setCustomerNumber("35912548");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
	}

}
