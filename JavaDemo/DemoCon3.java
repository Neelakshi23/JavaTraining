import java.util.Scanner;

class TrainDetails
{
    String tName, fStation, tStation, sTime, eTime; int fare,tNo;
	TrainDetails(int tNo,String tName,String fStation,String tStation,String sTime,String eTime,int fare)
	{
		this.tNo = tNo;
		this.tName = tName;
		this.fStation = fStation;
		this.tStation = tStation;
		this.sTime = sTime;
		this.eTime = eTime;
		this.fare = fare;

	}

	void gettrainDetails()
	{
      System.out.println(" train No:"+tNo);
	  System.out.println(" train Name:"+tName);
	  System.out.println(" train From Station:"+fStation);
	  System.out.println(" train To Station:"+tStation);
	  System.out.println(" train StartTime:"+sTime);
	  System.out.println(" train EndTime:"+eTime);
	  System.out.println(" train fare:"+fare);
	}
}

class DemoCon3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter train No:");
		int tNo = Integer.parseInt(sc.nextLine());
		System.out.println("Enter train Name:");
		String tName = sc.nextLine();
		System.out.println("Enter From Station :");
		String fStation = sc.nextLine();
		System.out.println("Enter To Station :");
		String tStation = sc.nextLine();
		System.out.println("Enter train Start Time:");
		String sTime = sc.nextLine();
		System.out.println("Enter train End Time:");
		String eTime = sc.nextLine();
		System.out.println("Enter train TicketCoset:");
		int fare = sc.nextInt();
		TrainDetails t = new TrainDetails(tNo,tName,fStation,tStation,sTime,eTime,fare);
		t.gettrainDetails();
	}
}
