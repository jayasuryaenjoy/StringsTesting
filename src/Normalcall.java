
public class Normalcall {

	public static void main(String[] args) {
		int a=2 ;
		int b=4;
		int t=0;
		for(;a<10;++a) {
			++b;
			t+=b;
		}
		System.out.println(t);
	math m= new math();
	System.out.println(m.abc(10));
	
	char z='A';
	System.out.println("Z:"+z);
	}

}


class math{
	public static int abc(int a) {
		return -a;
	}
}
