package multi;

public interface A {
//	�������̽��� �߻�޼ҵ常 ���� �����ϱ� ������ �׳� �����ص� �߻� �޼ҵ�, ����� ����ȴ�.
	//void f();
//	������ default�� ����ϸ� �Ʒ��� ���� ������ �����ϴ�.
	default void f() {
		System.out.println("A �������̽��� f()");
	}
	
}
