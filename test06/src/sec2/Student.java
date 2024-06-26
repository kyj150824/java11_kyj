package sec2;

public class Student {
	private String name;
	private int grade;
	private int money;
	public Student() {
		
		this("아무개");
	}
	
	public Student(String name) {
		this(name, 1);
		
	}
	
	public Student(String name, int grade) {
		this(name, grade, 100);
		
	}
	
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 클래스 타입도 매개변수로 받을 수 있음. 학생이 버스를 타면 생기는 현상.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// 학생이 지하철을 타면 생기는 현상.
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	public void print() {
		System.out.println("Student [name=" + name + ", grade=" + grade + ", money=" + money + "]");
	}
	
	
}
