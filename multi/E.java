package multi;

public class E extends C implements A,B{
//	CŬ������ A,B �������̽����� f�Լ��� �����ϸ� � �Լ��� ������� �𸣱� ������
//	�����Ǹ� ���� ��ȣ���� �ذ��ؾ� ����� �����ϴ�.
	@Override
	public void f() {
		System.out.println("E Ŭ������ f()");
	}
	void dosomthing() {
//		A��ü�� �����Ͽ� 
		A.super.f();
		B.super.f();
//		super�� ��ӹ��� CŬ������ �ּҸ� ������ �ִ�.
		super.f();
		f();
	}
}
