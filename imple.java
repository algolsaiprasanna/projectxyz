package inheritance;

public class imple implements inter2 {

	@Override
	public void m12() {
		System.out.println("s1-swathi");
		
	}

	@Override
	public void m13() {
		System.out.println("s2-sai");
		
		
	}

	@Override
	public void m14() {
		System.out.println("s3-latha");
		
	}

	@Override
	public void m15() {
		System.out.println("s4-mahi");
	
		
	}
	public static void main(String[] args) {
		imple d=new imple();
		d.m12();
		d.m13();
		d.m14();
		d.m15();
	}
	

}
