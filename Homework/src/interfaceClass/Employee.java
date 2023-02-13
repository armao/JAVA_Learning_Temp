package interfaceClass;

public abstract class Employee extends Object implements Payable {
	
	private String fName;
	private String lName;
	private String id;
	
	
	public Employee(String fName, String lName, String id) {
		super();
		
		if (fName.equals("")) {
			throw new IllegalArgumentException("名字 不可空白");
		}

		if (lName.equals("")) {
			throw new IllegalArgumentException("姓氏 不可空白");
		}
		
		if (id.equals("")) {
			throw new IllegalArgumentException("ID 不可空白");
		}
		
		this.fName = fName;
		this.lName = lName;
		this.id = id;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		if (fName.equals("")) {
			throw new IllegalArgumentException("名字 不可空白");
		}
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		if (lName.equals("")) {
			throw new IllegalArgumentException("姓氏 不可空白");
		}
		this.lName = lName;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		if (id.equals("")) {
			throw new IllegalArgumentException("ID 不可空白");
		}
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format(
				"%s %s%s %n%s %s %n",
				"姓名:",this.getlName(),this.getfName(),
				"身分證字號:",this.getId()
				);
	}
	
}
