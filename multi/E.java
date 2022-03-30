package multi;

public class E extends C implements A,B{
//	C클래스와 A,B 인터페이스에도 f함수가 존재하며 어떤 함수를 사용할지 모르기 때문에
//	재정의를 통한 모호성을 해결해야 사용이 가능하다.
	@Override
	public void f() {
		System.out.println("E 클래스의 f()");
	}
	void dosomthing() {
//		A개체로 접근하여 
		A.super.f();
		B.super.f();
//		super는 상속받은 C클래스의 주소를 가지고 있다.
		super.f();
		f();
	}
}
