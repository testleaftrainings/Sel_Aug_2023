package week4.day1;

public class LearnConstructor {
	
	int empId;
	String empName;
	boolean empStatus;
	
	public LearnConstructor() {
		//this(300, "Subraja", true);
		System.out.println("Default Constructor");
	}
	
	public LearnConstructor(int empId,String empName,boolean empStatus) {
		
		this.empId=empId;
		this.empName=empName;
		this.empStatus= empStatus;
		System.out.println("Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		LearnConstructor lc = new LearnConstructor(200,"S",false);
		System.out.println(lc.empId+" "+lc.empName+ " "+lc.empStatus);
		
		
		
	}

}
