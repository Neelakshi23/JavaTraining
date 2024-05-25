package p1;

public class ProductDetails {
	String name,code;
	int qty;
	float price;
	public ProductDetails(String name,String code,int qty,float price)
	{
		this.name=name;
		this.code=code;
		this.qty=qty;
		this.price=price;
	}
	@Override
	public String toString() {
		return "ProductDetails [name=" + name + ", code=" + code + ", qty=" + qty + ", price=" + price + "]";
	}
	

}
