class Division
{

static int x = 10;
static int y = 20;

void div(){
	
    int div = x/y;
	System.out.println("Subtraction of two x and y numbers is " + div);
	
}
}

class Subtraction
{

int a = 30;
int b = 40;

void sub(){
int sub = a-b;
System.out.println("Subtraction of two a and b numbers is " + sub);
}

}

class DemoMain 
{
	public static void main(String[] args) 
	{
		Division d = new Division();
		d.div();
		Subtraction s = new Subtraction();
		s.sub();
	}
}
