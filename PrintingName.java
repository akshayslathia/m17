
public class PrintingName 
{
	static int row;
	static int delay;
	public static void space()
	{
		for(int i=1;i<=3;i++)
		{
			
			System.err.print(" ");
		}
	}
	public static void A(int i) throws InterruptedException
	{
		int mid = row/2+1;
		for(int j=1;j<=row;j++)
		{
			if(j==1 || j==row || i==1 || i==mid)
			{
				Thread.sleep(delay);
				System.err.print("*");
			}
			else
				System.err.print(" ");
		}
	}
	
	public static void B(int i)
	{
		int mid = row/2+1;
		for(int j=1;j<=row;j++)
		{
			if(j==1 || i==1&&j!=row || i==mid&&j!=row || i==row || j==row&&i!=mid&&i!=1&&i!=row)
				System.out.print("*");
			else
				System.out.print(" ");
		}
	}
	
	public static void K(int i) throws InterruptedException
	{
		int mid = row/2+1;
		for(int j=1;j<=mid;j++)
		{
			if(j==1 || i+j==mid+1 || i-j==mid-1)
			{
				Thread.sleep(delay);
				System.err.print("*");
			}
			else
			{
				System.err.print(" ");
			}
		}
	}
	
	public static void S(int i) throws InterruptedException
	{
		int mid = row/2+1;
		for(int j=1;j<=row;j++)
		{
			if(i==1 || i==mid || (j==1&&i<=mid) || (j==row&&i>=mid) ||i==row)
			{
				Thread.sleep(delay);
				System.err.print("*");
			}
			else
			{
				System.err.print(" ");
			}
		}
	}
	
	public static void Y(int i) throws InterruptedException
	{
		int mid = row/2+1;
		for(int j=1;j<=row;j++)
		{
			if((i+j==row+1 && i<=mid) || (i==j&&i<=mid) || (j==mid&&i>=mid) )
			{
				Thread.sleep(delay);
				System.err.print("*");
			}
			else
			{
				System.err.print(" ");
			}
		}
	}
	public static void H(int i) throws InterruptedException
	{
		int mid = row/2+1;
		for(int j=1;j<=row;j++)
		{
			if(j==1 || i==mid || j==row)
			{
				Thread.sleep(delay);
				System.err.print("*");
			}
			else
				System.err.print(" ");
		}
	}

	public static void main(String[] args)throws InterruptedException
	{
		row = 11;
		if(row%2==0)
			row+=1;
		
		delay = 20;
		
		for(int i=1;i<=row;i++)
		{
			A(i);
			space();
			K(i);
			space();
			S(i);
			space();
			H(i);
			space();
			A(i);
			space();
			Y(i);
			System.err.println();
			
		}

	}
}