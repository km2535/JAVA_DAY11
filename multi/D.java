package multi;

public class D implements A, B{
//	���� �̸��� �޼ҵ带 �޾ƿ��� ��ȣ������ ���Ͽ� �Ʒ��� ���� �����Ǹ� �ؾ� �Ѵ�.
	@Override
	public void f() {
		System.out.println("D Ŭ������ f()");
	}
	void doSomething() {
		A.super.f();
		B.super.f();
		f();
	}
}
