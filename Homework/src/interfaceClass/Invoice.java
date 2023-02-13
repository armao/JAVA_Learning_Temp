package interfaceClass;

public class Invoice implements Payable {
	
	private String partNumber;
	private String partDescription;
	private double pricePerItem;
	private int quantity;
	
	public Invoice (String partNumber,String partDescription,double pricePerItem,int quantity) {
		super();
		
		if (partNumber.equals("")) {
			throw new IllegalArgumentException("partNumber 不可空白");
		}

		if (partDescription.equals("")) {
			throw new IllegalArgumentException("partDescription 不可空白");
		}
		
		if (pricePerItem <= 0.0) {
			throw new IllegalArgumentException("pricePewItem 必須 > 0");
		}
		if (quantity <= 0) {
			throw new IllegalArgumentException("quantity 必須 > 0");
		}
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.pricePerItem = pricePerItem;
		this.quantity = quantity;
		
	}
	//---------------------------------------------------
	public String getPartNumber() {return partNumber;}

	public void setPartNumber(String partNumber) {
		if (partNumber.equals("")) {
			throw new IllegalArgumentException("partNumber 不可空白");
		}
		this.partNumber = partNumber;
	}
	//---------------------------------------------------
	public String getPartDescription() {return partDescription;}

	public void setPartDescription(String partDescription) {
		if (partDescription.equals("")) {
			throw new IllegalArgumentException("partDescription 不可空白");
		}
		this.partDescription = partDescription;
	}
	//---------------------------------------------------
	public double getPricePewItem() {return pricePerItem;}

	public void setPricePewItem(double pricePewItem) {
		if (pricePerItem <= 0.0) {
			throw new IllegalArgumentException("pricePewItem 必須 > 0");
		}
		this.pricePerItem = pricePewItem;
	}
	//---------------------------------------------------
	public int getQuantity() {return quantity;}

	public void setQuantity(int quantity) {
		if (quantity <= 0) {
			throw new IllegalArgumentException("quantity 必須 > 0");
		}
		this.quantity = quantity;
	}

	@Override
	public double getPaymentAmount() {
		// TODO 自動產生的方法 Stub
		return quantity*pricePerItem;
	}
	@Override
	public String toString() {
		return String.format
				("%s %s %s %n",
				"供應商應付款-貨品: ",this.getPartNumber(),this.getPartDescription()
				);
	}
	
	
	
}
