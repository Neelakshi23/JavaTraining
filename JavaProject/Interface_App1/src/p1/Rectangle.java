package p1;

public class Rectangle implements Resizable
{
	 public void resizeWidth(int width)
	 {
		 System.out.println("Inside Rectangle class resizeWidth()");
		 System.out.println("width is "+width);
	 }
	 public void resizeHeight(int height)
	 {
		 System.out.println("Inside Rectangle class resizeHeight()");
		 System.out.println("Height is "+height);
	 }
	 public Rectangle()
	 {
		 System.out.println("Inside Rectangle Constructor");
	 }

}
