class Ball
{
	private String colour;

	public String getColour(){ return colour ;}

	public void setColour(String colour){ this.colour = colour ;}

	Ball(){}

	Ball(String colour){ this.colour = colour ;}
}

class TennisBall extends Ball 
{
	double radius;

	TennisBall(String colour,double radius)
	{
		super(colour);
		this.radius = radius;
	}

	public void displayDetails()
	{
		System.out.println("You can play with Tennis Ball whose colour is "+
							getColour()+" and radius is "+radius);
	}
}

class BasketBall extends Ball 
{
	double radius;

	BasketBall(String colour,double radius)
	{
		super(colour);
		this.radius = radius;
	}

	public void displayDetails()
	{
		System.out.println("You can play with Basket Ball whose colour is "+
							getColour()+" and radius is "+radius);
	}
}

class Bag
{
	Ball ball;

	public boolean checkBagEmpty()
	{
		// if(ball==null)
		// 	return true;
		// else 
		// 	return false;

		return (ball==null);
	}

	public void addBall(Ball ball)
	{
		if(checkBagEmpty())
		{
			this.ball = ball;
			System.out.println("Ball added successfully!!!");
		}
		else 
		{
			System.out.println("Ball already added");
		}
	}

	public void removeBall()
	{
		if(checkBagEmpty())
		{
			System.out.println("Ball not present");
		}
		else 
		{
			this.ball = null;
			System.out.println("Ball removed successfully!!");
		}
	}

	public void checkGame()
	{
		if(checkBagEmpty())
		{
			System.out.println("You cannot play with any game");
		}
		else 
		{
			if(ball instanceof TennisBall)
			{
				TennisBall tb = (TennisBall)ball;
				tb.displayDetails();
			}
			else 
			{
				BasketBall bb = (BasketBall)ball;
				bb.displayDetails();
			}
		}
	}
}


class UserInterface
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Bag bag = new Bag();
		System.out.println("----------------------------------------------------------");
		System.out.println("Welcome to play game !!!! with basketball and tennis ball");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		boolean flag = true;
		while(flag)
		{
			
			System.out.println("1.Add Ball");
			System.out.println("2.Remove Ball");
			System.out.println("3.Check Bag Empty?");
			System.out.println("4.Check Game");
			System.out.println("5.Exit\n");
			System.out.println("Choose from above options!!!.....");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: 
				{
					System.out.println("\t 1.Tennis Ball");
					System.out.println("\t 2.Basket Ball");
					System.out.println("----please choose----");
					int ch = sc.nextInt();
					switch(ch)
					{
					   case 1: bag.addBall(new TennisBall("Green",54.23d)); break; 
					   case 2: bag.addBall(new BasketBall("Red",155.23d)); break;
					   default : System.out.println("Invalid options for ball");
					}

					break;
				}

				case 2:
				{
					bag.removeBall();

					break;
				}

				case 3:
				{
					System.out.println(bag.checkBagEmpty());

					break;
				}

				case 4:
				{
					bag.checkGame();
					break;
				}
				case 5:
				{
					flag = false;
					break;
				}

				default :
				{
					System.out.println("Invalid option please select from 1-4 only");
				}
			}

		}

		System.out.println("Thank you for your valuable time ,now shut your mouth and please study for your mock!!!!!");
	}
}
