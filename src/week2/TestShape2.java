package week2;
import week2.GenLib;

public class TestShape2 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[GenLib.getInt(5, 10)];
		
		
		for (int i=0; i< shapes.length; i++) {
			if(i%2==0){
				shapes[i]=new Circle(GenLib.getInt(10, 100),GenLib.getInt(10, 100),GenLib.getInt(10, 100));
				System.out.print(shapes[i].getName()+": "+shapes[i].toString());
				System.out.println("; Area= "+shapes[i].getArea());
			}else{
				shapes[i]=new Rectangle(GenLib.getInt(10, 100),GenLib.getInt(10, 100),GenLib.getInt(10, 100),GenLib.getInt(10, 100));
				System.out.print(shapes[i].getName()+": "+shapes[i].toString());
				System.out.println("; Area= "+shapes[i].getArea());
			}
			
			
		}

	}

}
