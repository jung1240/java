package sub2;

/*
 * 날짜 : 2020/11/16
 * 이름 : 정유락
 * 내용 : 다양한 예외종류 실습하기 교제 p265
 */
public class VarietyOfExceptionTest {

	public static void main(String[] args) {

		// 배열의 인덱스번호 참조 에러
		int arr[] = new int[3];

		for (int i = 0; i <= 3; i++) {
			try {
				arr[i] = i + 1;

			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		for (int num : arr) {
			System.out.println("arr 값:" + num);
		}

		// NullPoint 에러
		Tiger tiger = null;

		try {
			
			tiger.move();
			tiger.hunt();
		
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// Casting 에러
		try {
			Animal a1 = new Eagle();//업캐스팅(다형성)
			Animal a2 = new Shark();//업캐스팅(다형성)
			
			Eagle eagle = (Eagle)a2;//다운캐스팅
			
		} catch (ClassCastException e) {
			e.printStackTrace();

		}
		
		
		
		
		
		System.out.println("프로그램 종료...");
	}
}
