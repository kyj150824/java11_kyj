package sec1;
// ClassCastException : �� ��ȯ�� �߻��ϴ� ����
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
public class ExceptionExam5 {

	public static void main(String[] args) {
		Animal ani1 = new Dog();
		Animal ani2 = new Cat();
		changAnimal(ani2);
		
		Cat ani3 = new Cat();
		changAnimal(ani3);
	}
	
	public static void changAnimal(Animal animal) {
		try {
			Dog dog = (Dog) animal;
		} catch(ClassCastException e) {
			System.out.println("������ �ٸ� ��Ű���� �ִ� Ŭ������ �� ��ȯ �Ұ�");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("�� �� ���� ����");
			e.getMessage();
		} finally {
			System.out.println("�۾� ����");
		}
	}

}