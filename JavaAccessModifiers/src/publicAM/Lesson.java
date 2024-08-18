package publicAM;

/*

1. Public
	- We can access Public from everywhere

2. Protected
	- Protected AM can be accessed within the package and outside the package but only through inheritance; 

3. Default
	- If there is no access modifier then it is Default by default
	- Default AM can be accessed only within the package

4. Private
	- Private can be accessed only from class

*/

public class Lesson {
	
	public Lesson() 
	{
		int age = 20;
		System.out.println(age);
		
	}
	
	public void Bank1() 
	{
		int num = 1;
		System.out.println(num);
	}
	
	
	public static void main (String [] args) 
	{
		Lesson ls = new Lesson();
		ls.Bank1();
		
		
		Teach thc = new Teach();
		thc.Game();
		
		
	}
	
	
	

}
