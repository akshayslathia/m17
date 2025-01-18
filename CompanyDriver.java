class Company
{
	private String companyName;
	private String companyLocation;
	private double baseSalary;

	public String getCompanyName(){ return companyName; }
	public String getCompanyLocation(){ return companyLocation; }
	public double getBaseSalary(){ return baseSalary ;}
	public void setBaseSalary(double baseSalary){ this.baseSalary = baseSalary; }

	Company(){}

	Company(String companyName,String companyLocation,double baseSalary)
	{
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.baseSalary = baseSalary;
	}

	double calculateSalary(){ return baseSalary; }

}
class Employee extends Company
{
	String employeeName;
	int noOfHrsWorked;

	Employee(String companyName,String companyLocation,double baseSalary,
				String employeeName,int noOfHrsWorked)
	{
		super(companyName,companyLocation,baseSalary);
		this.employeeName = employeeName;
		this.noOfHrsWorked = noOfHrsWorked;
	}

	@Override
	public double calculateSalary()
	{
		double baseSalary = super.calculateSalary();
		double perDaySalary = baseSalary/28;
		double totalSalary = (perDaySalary/9) * noOfHrsWorked;

		return totalSalary;
	}

	public void displayDetails()
	{
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Company working :"+getCompanyName());
		System.out.println("Company Location :"+getCompanyLocation());
		System.out.println("Salary received :"+calculateSalary());
	}
}

class Manager extends Company
{
	String managerName;
	double bonus;

	Manager(String companyName,String companyLocation,double baseSalary,
				String managerName,double bonus)
	{
		super(companyName,companyLocation,baseSalary);
		this.managerName = managerName;
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary()
	{
		double totalSalary = super.calculateSalary() + bonus;

		return totalSalary;
	}

	public void displayDetails()
	{
		System.out.println("Manager Name :"+managerName);
		System.out.println("Company working :"+getCompanyName());
		System.out.println("Company Location :"+getCompanyLocation());
		System.out.println("Salary received :"+calculateSalary());
	}
}

class CompanyDriver
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Company company;

		System.out.print("Enter base salary :"); double baseSalary1 = sc.nextDouble();
		System.out.print("Enter no of hrs worked :"); int noOfHrsWorked = sc.nextInt();
		company = new Employee("Jspiders and Qspiders","Sector 5",baseSalary1,"Armaan",noOfHrsWorked);


		Employee emp = (Employee)company;
		emp.displayDetails();

		System.out.println("----------------------------------------------");
		System.out.print("Enter base salary :"); double baseSalary2 = sc.nextDouble();
		System.out.print("Enter bonus :"); double bonus = sc.nextDouble();

		company = new Manager("TCS","Biswa bangla gate",baseSalary2,"Sheela",bonus);


		Manager man = (Manager)company;
		man.displayDetails();

	}
}