import java.util.Scanner;

class Details
{
	String name;
	float price;
	void setName(String name)
	{
       this.name = name;
	}
	String getName()
	{
		return name;
	}
	void setPrice(float price)
	{
		this.price = price;
	}
	float getPrice()
	{
		return price;
	}
}

class  DemoCon4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        Details d = new Details();
		System.out.println("Enter Product Name :");
		d.setName(sc.nextLine());
		System.out.println("Enter Product price :");
		d.setPrice(sc.nextFloat());
		System.out.println("---Details--:");
		System.out.println("Product name is "+d.getName());
		System.out.println("Product name is "+d.getPrice());
	}
}
