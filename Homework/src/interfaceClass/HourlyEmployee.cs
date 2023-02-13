package interfaceClass;

public class HourlyEmployee extends Employee {
	
	private float m_hours;
	private int m_wage;

	public HourlyEmployee(String fName, String lName, String id, float hours, int wage) {
		super(fName, lName, id);
		// TODO 自動產生的建構子 Stub
	
		if (hours<=0.0||hours>720) {
			throw new IllegalArgumentException("");
		}
		if (wage<=0.0) {
			throw new IllegalArgumentException("");
		}
		
		this.m_hours = hours;
		this.m_wage = wage;
	}
	
	
	public float getHours() {return m_hours;}
	
	public void setHours(float hours) {
		this.m_hours = hours;
	}

	
	public int getWage() {return m_wage;}
	
	public void setWage(int wage) {
		this.m_wage = wage;
	}



	public double getPaymentAmount() {
		if(m_hours>40) {
			return (  ( (getHours()-40)*getWage() ) + (40*getWage())   );
		}
		else {
			return( getHours()*getWage() );				
		}
	}
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n"
				, "領時薪的員工-姓名", getlName(), getfName()
				, "身分證字號",getId()
				, "工時",this.getHours()
				, "時薪",this.getWage()
				, "薪資", this.getPaymentAmount());
	}

}
