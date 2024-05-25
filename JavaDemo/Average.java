class AverageDemo
{
  float add(int x, int y){
	
	 float z = (float)(x+y)/2;
     return z;
  }
}
class Average
{

	public static void main(String[] args) 
	{
		int v1 = 6;
		int v2 =8;

	AverageDemo ob = new AverageDemo();

    float res = ob.add(v1,v2);
	System.out.println("Average of two numbers is " + res);
	}
}
