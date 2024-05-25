class StudentPercentage
{
    float cal(float s1, float s2, float s3, float s4, float s5, float s6){
	
	float percentage = (s1+s2+s3+s4+s5+s6)/6;

	return percentage;


   }

}



class DemoStudent
{
	public static void main(String[] args) 
	{
		float f1 = 78.98f;
		float f2 = 87.98f;
		float f3 = 93.89f;
		float f4 = 88.00f;
		float f5 = 79.78f;
		float f6 = 99.99f;
		StudentPercentage sp = new StudentPercentage();
	  float result = sp.cal(f1, f2, f3, f4, f5, f6);
		System.out.println("Percentage of a student is " +result );
    

	}
}
