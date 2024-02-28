package week02;

class Employee 
{
	String empName;
	int empNo;
	byte expYrs;
	String gender;
	double basicSalary;
	double netSalary;
	void setEmployee(String Name,int no,String sex,byte ex,double basicSalary)
	{
	empName=Name;
	empNo=no;
	gender=sex;
	expYrs=ex;
	basicSalary=basicsalary;
	}
	void getEmployeeDetails()
	{
if(gender == "female")
    {
bonus = basicSalary*10/100;
			netSalary=basicSalary+bonus;
    }
  else
netSalary=basicSalary;
	System.out.println(empName+"\t"+empNO+"\t"+gender+"\t"+expYrs+"\t"+basicSalary+"\t"+bonus+"\t"+netSalary+"\n");
	}
}
public class EmployeeDetails{
	public static void main(String args[])
	{
		Employee Akanksha=new Akanksha();
		Akanksha.setEmployee("Anu", 123456, "female",(byte)25,2000000.0d);
		System.out.println("empName\tempNo\tgender\texpYrs\ttbasicSalary\tbonus\tnetSalary\n");
		Akanksha.getEmployeeDetails();
	Employee Thanu=newEmployee();
		Thanu.getEmployee("Thanu",5467392,"female"(byte)4567,86544.0d);
		Thanu.getEmployeeDetails();
		Employee Baby=newEmployee();
		Baby.setEmployee("Baby",437283,"female",(byte)434678,26.0d); 
		Baby.getEmployeeDetails();
	}
}



