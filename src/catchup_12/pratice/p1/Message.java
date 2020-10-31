package catchup_12.pratice.p1;

public class Message {
	String orderno;
	String MilkteaType;
	int cup;
	public Message() {
	}
	public Message(String orderno, String MilkteaType, int cup) {
		this.orderno = orderno;
		this.MilkteaType = MilkteaType;
		this.cup = cup;
	}

	public String getMessage() {
		String message;
		message = "订单号：" + orderno + "  " + MilkteaType + "奶茶" + "  " + cup
				+ "杯";
		return message;
	}
	@Override
	public String toString() {
		return "Message [orderno=" + orderno + ", MilkteaType=" + MilkteaType
				+ ", cup=" + cup + "]";
	}
	
	

}
