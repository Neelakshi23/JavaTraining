class Demo 
{

static int a= 10;
static int b=20;
int c=30;

static void add(){
int sum = a+b;
System.out.println("From add method.." +sum);
}

void mul(){
int mul = a*b*c;
System.out.println("From Mul method.." +mul);
}
}
class Arithmetic
{
	public static void main(String[] args) 
	{
		Demo.add();
		Demo ar = new Demo();
		ar.mul();
	}
}
