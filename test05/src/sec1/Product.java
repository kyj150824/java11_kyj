package sec1;

public class Product {
	private String pname;
	private int pcode;
	private int price;
	private int size;
	private int amount;
	private String remark;
	
	/* 오버라이드 - 특정 메소드를 상속받아서 평균을 내서 사용하는 방법 
	 * 메소드 오버로딩(Method Overload) - 매개변수의 갯수나 타입에 따라서 메소드를 여러개 인출 할 수 있는 것 */
	public void print() {
		System.out.println("제품이름");
	}
	
	public void print(String pname) {
		System.out.println("제품이름 :" + pname);
	}
	
	public void print(int amount) {
		System.out.println("제품수량 :" + amount);
	}
	
	public void print(String pname, int amount) {
		System.out.println("제품이름 :" + pname);
		System.out.println("제품수량 :" + amount);
	}
	
	public void print(int amount, String pname) {
		System.out.println("제품이름 :" + pname);
		System.out.println("제품수량 :" + amount);
	}
	
	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public int getPcode() {
		return pcode;
	}



	public void setPcode(int pcode) {
		this.pcode = pcode;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pcode=" + pcode + ", price=" + price + ", size=" + size + ", amount="
				+ amount + ", remark=" + remark + "]";
	}

	
	
}
