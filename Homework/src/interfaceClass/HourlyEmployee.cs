package interfaceClass;

public class HourlyEmployee extends Employee {
	
	private double hours;
	private double wage;

	public HourlyEmployee(String fName, String lName, String id, double hours, double wage) {
		super(fName, lName, id);
		// TODO 自動產生的建構子 Stub
	
		if (hours<=0.0||hours>720) {
			throw new IllegalArgumentException("");
		}
		if (wage<=0.0) {
			throw new IllegalArgumentException("");
		}
		
		this.hours = hours;
		this.wage = wage;
	}
	
	
	public double getHours() {return hours;}
	
	public void setHours(double hours) {
		this.hours = hours;
	}

	
	public double getWage() {return wage;}
	
	public void setWage(double wage) {
		this.wage = wage;
	}



	public double getPaymentAmount() {
		if(hours>40) {
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
