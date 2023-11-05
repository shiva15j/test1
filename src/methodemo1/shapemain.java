package methodemo1;

public class shapemain {

	public static void main(String[] args) {

		Shapes.area();
		System.out.println("*************");
		Shapes.area(10);
		System.out.println("*************");
		Shapes.area(4.2f);
		System.out.println("*************");
		Shapes.area(10, 30);
	}

}
