package multi;

public interface B {
//	jdk8�� �߰��� �������� �޼ҵ带 �߻�޼ҵ尡 �ƴ� �Ʒ�ó�� �޼ҵ带 ���� �� �� �ִ�.
	default void f() {
		System.out.println("B �������̽��� f()");
	}
}
