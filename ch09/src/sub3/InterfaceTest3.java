package sub3;

/*
 * 날짜 : 2020/11/12
 * 이름 : 정유락
 * 내용 : 인터페이스 실습하기 교제 p228
 */
public class InterfaceTest3 {
	
	public static void main(String[] args) {
		//인터페이스 - 객체간의 결합도를 완화
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
	}

}
