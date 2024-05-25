package p2;

public class DemoException3 
{
	public static void main(String[] args) {
		try {
			@SuppressWarnings("rawtypes")
			Class c = Class.forName("p1.Display");
			@SuppressWarnings({ "deprecation", "unused" })
			p1.Display d = (p1.Display)c.newInstance();
			d.dis(143);
		} 
		 catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
				System.out.println(e.toString());
			}catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
			System.out.println(cnf.toString());
		}
	}

}
