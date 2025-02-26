public class Student implements Comparable
{
	
	private int age;
	private String name;
	private int rollNo;
	private long phone;
	
	public Student(int age, String name, int rollNo, long phone) 
	{
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public long getPhone() {
		return phone;
	}

//	@Override // sorting on the basis of rollNO
//	public int compareTo(Object o) 
//	{
//		Student s = (Student)o;
//		
//		return s.rollNo - this.rollNo;
//	}
	
	
	
	
	

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", rollNo=" + rollNo + ", phone=" + phone + "]";
	}

	@Override // based on name
	public int compareTo(Object o) 
	{
		Student s = (Student)o;
		return s.name.compareTo(this.name);
			
		
	}
	
	
}


public class StudentMain {
	
	public static void sortBasedOnAge(Student[] stu)
	{
		Arrays.sort(stu,new SortBasedOnAge());
		
		for(Student s : stu)
		{
			System.out.println(s);
		}
	}
	
	public static void sortBasedOnRollNumber(Student[] stu)
	{
		Arrays.sort(stu,new SortBasedOnRollNumber());
		
		for(Student s : stu)
		{
			System.out.println(s);
		}
		
	}
	
	public static void sortBasedOnName(Student[] stu)
	{
		Arrays.sort(stu,new SortBasedOnName());
		
		for(Student s : stu)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) 
	{
		Student[] stu = {new Student(20, "Mohan", 56, 4265346346l ),
							new Student(12,"Rohan",14, 769769679769l),
							new Student(67, "Sohan",67, 8976754562l),
							new Student(7,"Munna",55, 57467648646l),
							new Student(30, "Munni",35, 74574574542l) };
		
		
		for(int i=0;i<stu.length;i++)
		{
			System.out.println(stu[i]);
		}
		
		System.out.println("------------");
		sortBasedOnAge(stu);
		System.out.println("------------");
		sortBasedOnRollNumber(stu);
		System.out.println("----------");
		sortBasedOnName(stu);

		

	}

}

public class SortBasedOnAge implements Comparator
{
	@Override
	public int compare(Object o1,Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		if(s1.getAge()<s2.getAge())
			return -235235;
		else if(s1.getAge()==s2.getAge())
			return 0;
		else 
			return 2352;
	}
}

class SortBasedOnRollNumber implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		return s1.getRollNo()-s2.getRollNo();
		
	}
}

class SortBasedOnName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		return s1.getName().compareTo(s2.getName());
	}
}

