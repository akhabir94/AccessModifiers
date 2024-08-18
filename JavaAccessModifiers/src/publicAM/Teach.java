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

public class Teach {
	
	
	public void Game() 
	{
		String player_name = "Triple H";
		System.out.println(player_name);
	}
	
	public static void main(String [] args)
	{
		Lesson lst = new Lesson();
		lst.Bank1();
	}

}
