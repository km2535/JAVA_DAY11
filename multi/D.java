package multi;

public class D implements A, B{
//	같은 이름의 메소드를 받아오면 모호성으로 인하여 아래와 같이 재정의를 해야 한다.
	@Override
	public void f() {
		System.out.println("D 클래스의 f()");
	}
	void doSomething() {
		A.super.f();
		B.super.f();
		f();
	}
}
