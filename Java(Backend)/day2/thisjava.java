package day2;
//this keyword in java
public class thisjava {
	String name;
    thisjava(String name){
    	this(10,20);
    	this.name=name;
    	this.greeting();
    }
    
    thisjava(int a,int b){
    	System.out.println("Addition : "+(a+b));
    }
    void greeting() {
    	System.out.println("Welcom " + name);
    }
    public static void main(String[] args) {
    	thisjava obj = new thisjava("Eliza");
    }

}
