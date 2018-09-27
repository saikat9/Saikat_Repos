package SampleEmployee;

public class SampleEmp {
	int EmpId;
	String EmpName;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = (empId>0)?empId:1;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public float CalSalary() {
		float salary;
		switch (EmpId)
		{
		case 1:
			salary= 1000;
			break;
		case 2:
			salary= 2000;
			break;
		case 3:
			salary= 3000;
			break;
		case 4:
			salary= 4000;
			break;
		case 5:
			salary= 5000;
			break;
		default:
			salary= 100;
			
		
	}
		return salary;

}
}
