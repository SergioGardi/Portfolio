
public class Employee {

	//Attributes
	int eId;
	String eName;
	String eAdress;
	
	//Methods
	public Employee() {
		
	}
	
	public Employee(int eId, String eName, String eAdress) {
		this.eId = eId;
		this.eName = eName;
		this.eAdress = eAdress;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAdress() {
		return eAdress;
	}

	public void seteAdress(String eAdress) {
		this.eAdress = eAdress;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAdress=" + eAdress + ", geteId()=" + geteId()
				+ ", geteName()=" + geteName() + ", geteAdress()=" + geteAdress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
