class Fruit
{
	
}

class Apple extends Fruit
{
	public void taste()
	{
		System.out.println("Taste of apple is sweet");
	}
}

class Mango extends Fruit
{
	public void taste()
	{
		System.out.println("Taste of mango is sour");
	}
}

class FruitMain
{
	public static void checkFruit(Fruit f)
	{
		if(f instanceof Mango)
		{
			Mango m = (Mango)f;
			m.taste();
		}
		else 
		{
			Apple a = (Apple)f;
			a.taste();
		}
	}

	public static void main(String[] args) 
	{
		Fruit f = new Apple();//upcasting

		checkFruit(f);
	}
}