class SeachFlight
{
	static int id = 40001;
	static String flightName = "Indigo";
	static String departurePoint = "nayapatti";
	static String arrivalPoint = "kestopur";

	public static void serach(int id)
	{
		if(SeachFlight.id==id)
			System.out.println("Flight found with id :"+id);
		else 
			System.out.println("Not found");
	}

	public static void serach(String flightName)
	{
		if(SeachFlight.flightName.equals(flightName))
			System.out.println("Flight found with name :"+flightName);
		else 
			System.out.println("Not found");
	}

	public static void serach(int id,String flightName)
	{
		if(SeachFlight.id==id && SeachFlight.flightName.equals(flightName))
			System.out.println("Flight found with id "+id+" flight name "+flightName);
		else 
			System.out.println("Flight not found");
	}

	public static void serach(int id,String flightName,String departurePoint)
	{
		if(SeachFlight.id==id && SeachFlight.flightName.equals(flightName) && SeachFlight.departurePoint.equals(departurePoint))
			System.out.println("Fligth found");
		else
			System.out.println("Flight not found!!");
	}


}

class Main
{
	public static void main(String[] args) 
	{
		SeachFlight.serach(40001);
		SeachFlight.serach("Indigo");
		SeachFlight.serach(300012,"Uskii vali flight");
		SeachFlight.serach(5464564,"Kiski vali flight","Pakistan");
	}
}