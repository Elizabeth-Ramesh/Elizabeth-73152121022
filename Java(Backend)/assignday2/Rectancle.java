package assignday2;

public class Rectancle {
	int width;
	int height;
	double area;
	double perimeter;
	
	void calculateArea(int width,int height){
		System.out.println(width*height);
	}
	void calculatePerimeter(int width,int height){
		System.out.println(2*(width+height));
	}
	
	public static void main(String[] args) {
		Rectancle obj=new Rectancle();
		obj.calculateArea(20, 15);
		obj.calculatePerimeter(20, 15);
	}

}
