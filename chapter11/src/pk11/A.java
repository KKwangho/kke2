package pk11;

public class A {

	//protected
	//같은 패키지에서는 protected-> public과 동일
	//다른 패키지에서는 상속받은 자식클래스-public
	//				상속받지 않은 일반 클래스는 private					
	protected String field; // protected는 같은패키지 사용
	
	public A() {
	}
	
	protected void method() {
		System.out.println("A class");
		System.out.println("field");
	}

	
}
