package p154;


public class ParamEx2 {

	public static void main(String[] args) {
		Param p =new Param();
		
		p.add((int)10.5, (int)5.5);
	}
	
}
class Param{
	void add(int x, int y) {
		int z = x+y;
		System.out.println(z);
	}
	
	void add2(double x, double y) {
		double z = x+y;
		System.out.println(z);
	}
}
