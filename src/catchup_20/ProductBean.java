package catchup_20;

import java.sql.Date;

public class ProductBean {

	private int id;
	private String product_name;
	private double price;
	private Date onboard_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getOnboard_date() {
		return onboard_date;
	}
	public void setOnboard_date(Date onboard_date) {
		this.onboard_date = onboard_date;
	}
	
	
	
}
