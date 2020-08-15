package catchup_4;

public enum TelephoneEnum
{
 // 在第一行列出9个枚举实例
  Nokia("WindosPhone",4000),Samsung("Android",5000),iPone("iOS",6000),MI("Android",1999),Vivo("Android",3000),BlackBerry("Android",2500),
    HuaWei("Android",2500),HTC("Windows",3800),OPPP("Android",2200);

	private final String name;
	private final int price;
	
	private TelephoneEnum(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	

}