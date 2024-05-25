package p2;
import p1.*;
public class DemoMain 
{
	public static void main(String[] args) throws InterruptedException
	{
		DayScholar d = new DayScholar();
		Hosteller h = new Hosteller();
		d.displayDetails(67577,"Akhil",143,87656);
		h.displayDetails(12345, "Neelakshi",123, 76652);
		Thread.sleep(10);
      
	}

}

