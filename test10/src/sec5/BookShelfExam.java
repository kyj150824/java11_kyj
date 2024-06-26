package sec5;
// Queue : FIFO(First in First out) 구조 = 태스크의 작업 순서
// Stack : LIFO(Last in First out) 구조 = 최근 작업 목록
public class BookShelfExam {

	public static void main(String[] args) {
		Queue que = new BookShelf();
		que.enQueue("관악산 등산 경로");	// 순서대로 입력
		que.enQueue("경복궁 안내");
		que.enQueue("숭례문 명동 둘러보기");
		
		System.out.println(que.deQueue()); // 입력한 순서대로 출력
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
	}

}
