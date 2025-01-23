interface Person
{
	int getAge();
	String getName();
}

interface Payable
{
	double calculateSalary();
	void processPayment();
}

class Employee implements Person,Payable
{
	private String name;
	private int age;
	private double perHrAmount;
	private int noOfHrsWorked;

	Employee(){}
	Employee(String name,int age,double perHrAmount,int noOfHrsWorked)
	{
		this.name = name;
		this.age = age;
		this.perHrAmount = perHrAmount;
		this.noOfHrsWorked = noOfHrsWorked;
	}

	@Override
	public double calculateSalary()
	{
		return (perHrAmount*noOfHrsWorked);
	}

	@Override
	public void processPayment()
	{
		System.out.print("Payment is getting processed with amount "+calculateSalary()+" for name "+getName());

	}

	@Override
	public String getName(){ return name; }

	@Override
	public int getAge(){ return age; }


}

class MainDriver
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Amit",32,4000,120);
		emp.processPayment();	
	}
}