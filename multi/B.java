package multi;

public interface B {
//	jdk8에 추가된 문법으로 메소드를 추상메소드가 아닌 아래처럼 메소드를 정의 할 수 있다.
	default void f() {
		System.out.println("B 인터페이스의 f()");
	}
}
