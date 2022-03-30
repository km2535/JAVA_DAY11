"# JAVA_DAY11"

# JAVA-11

## 접근 권한 제어자

- 다른 패키지 혹은 다른 클래스에서 해당 필드에 접근할 수 있는 권한을 설정해주는 키워드들
  - default
    - 다른패키지에서 접근 불가(귀찮을 때)
  - public
    - 모든 곳에서 접근 가능 - 다른 곳에서 사용이 될 때
  - private
    - 다른 클래스에서 접근 불가 - 데이터 감추기
    - private 필드느 직접 접근할 방법이 하나도 없기때문에 public 메소드를 통해서 간접적으로 접근한다.(값을 사용 - getter / 값을 수정 - setter)
  - protected
    - 다른패키지에서 접근 불가(단, 상속받은 자식 클래스 내부에서는 자신의 필드처럼 접근이 가능이다. / 자식에게만 건네줄 데이터)

```java
package access1;

public class AccessTest {
	int data1 = 10;
	public int data2 = 20;
	private int data3 = 30;
	protected int data4 = 40;

//	Alt + shift + s > R : getter, setter 사용하기

	public int getData3() {
		return data3;
	}
//	세터는 리턴 값을 반환하지 않고 아래와 같이 값을 수정한다.
	public void setData3(int data3) {
		this.data3 = data3;
	}
}

```

## 추상 클래스

- 추상적인 내용만 정의하고 있는 클래스, 구체적인 내용은 상속받아 하위 클래스에서 구현되도록 설계된 클래스이다.
- 추상 클래스(부모)는 클래스들(자식)의 공통 요소들을 가상화 시켬놓기 때문에 객체화 시 구현(재정의)을 꼭 해야한다.
- 부모 추상클래스의 역할은 단지 자식 클래스들을 만들 때 도와주는 역할을 수행한다.
- 즉, 클래스들의 틀 역할을 한다.
- 그렇기 때문에 자식 클래스에서 생성되어야 할 메소드의 이름과 형태만 가지고 있다.
  즉, 메소드 바디가 없다. 이런 메소드를 추상 메소라고 하며 리턴 타입 앞에 abstract라는 키워드를 붙여준다. 추상 메소드가 하나라도 포함되어 있다면 추상 클래스로 만들어야 한다.

### 추상 클래스 선언

```
abstract class 클래스명{
	abstract 리턴타입 추상멕소드명();
}
```

```java
package zoo;
// animal은 추상 클래스이다.
public abstract class Animal {
	String name;
	String gender;
	int age;

	//	final 메소드는 자식 클래스에서 재정의가 불가능하다.
	 final void intro() {
		 System.out.println("나는 동물입니다.");
	 }
//	추상 메소드를 만든다.
	abstract void makeSomeNoise();
//	일반 메소드도 선언 가능하다.
	void eat() {
		System.out.println(name + "이(가) 냠냠 먹는중..");
	}
}
```

```java
package zoo;

public class Snake extends Animal{
// 추상 클래스를 상속 받으면 추상 클래스 내부의 추상 메소드를 반드시 재정의한다.
	@Override
	void makeSomeNoise() {
		System.out.println("슬리데린");
	}

}
```

- 추상 메소드는 자식 클래스에서 강제적으로 반드시 재정의 해야한다.
- 일반 메소드도 추상 클래스 내부에 존재할 수 있다.

## 인터페이스

- 추상 클래스를 고도화 시킨 문법이며, 반드시 추상메소드와 상수만 선언해야 한다.
  다른 클래스에서 인터페이스를 상속 받을 때에는 implements를 사용한다ㅣ.
- 상속 받은 클래스는 인터페이스가 가지고 있던 추상 메소드를 반드시 재정의 해야 한다.
- jdk 8 버전 이후부터는 인터페이스에 default 메소드를 선언할 수 있다.
  따라서 사실상의 다중상속을 지원하게 된다.

```java
package zoo;
// 인터페이스 선언, 마찬가지로 추상 메소드를 만들 수 있다.
public interface Mammal {
	abstract void eungAe();
}
```

```java
package zoo;
// cat은 animal를 상속 받으면서 mammal를 인터페이스로 받는다.
public class Cat extends Animal implements Mammal{
//	final은 재정의가 안되는 것을 알 수 있다.

//	@Override
//	void intro() {
//		System.out.println("나는 식물입니다.");
//	}
	@Override
	void makeSomeNoise() {
		System.out.println("음멩");
	}
// 인터페이스의 추상메소드도 재정의가 필요하다.
	@Override
	public void eungAe() {
		System.out.println("새끼를 한 네다섯마리 정도 낳는다.");
	}

}
```

---

```java
package zoo;
// 비어있는 인터페이스를 만들 수 있다.
public interface Bird {

}
```

```java
package zoo;
// 비어 있는 인터페이스는 아래와 같이 animal의 상속과 추상 메소드만이 정의하고 있다.
public class Avialae extends Animal implements Bird{

	@Override
	void makeSomeNoise() {
		System.out.println("시져시져");
	}
}
```

```java
package zoo;

public class Ground {
	public static void main(String[] args) {
		Animal [] arr= {
				new Cat(),
				new Snake(),
				new Whale(),
				new Avialae(),
				new Kangaroo()
		};

		for (int i = 0; i < arr.length; i++) {
			arr[i].makeSomeNoise();
		}
//		인터페이스를 이용하여 Bird라는 다른 클래스와의 구분점으로 사용할 수있다.
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Bird) {
				System.out.println(i + "번 방은 새가 있어ㅏ요");
			}
		}
	}
}
```

### 메소드의 모호성 해결하기

- 인터페이스끼리 메소드 모호성이 발생한다면 상속 받고 있는 클래스에서 명시적으로 재정의 통해 모호성을 해결해 주어야 한다. 만약 클래스와 인터페이스끼리 모호성이 발생한다면 클래스의 메소들가 우선 시 되어 모호성이 자동으로 해결된다.

```
interface A
```

```java
package multi;

public interface A {
//	인터페이스는 추상메소드만 선언 가능하기 때문에 그냥 선언해도 추상 메소드, 상수로 선언된다.
	//void f();
//	하지만 default를 사용하면 아래와 같이 선언이 가능하다.
	default void f() {
		System.out.println("A 인터페이스의 f()");
	}
}
```

```
interface B
```

```java
package multi;

public interface B {
//	jdk8에 추가된 문법으로 메소드를 추상메소드가 아닌 아래처럼 메소드를 정의 할 수 있다.
	default void f() {
		System.out.println("B 인터페이스의 f()");
	}
}
```

```
class C
```

```java
package multi;

public class C {
	public void f() {
		System.out.println("C 클래스의 f()");
	}
}
```

```
인터페이스A, B를 상속받은 class D
```

```java
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
```

```
인터페이스A, B를 상속받고 C를 상속받은 E
```

```java
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
```

```
main method 사용 class
```

```java
package multi;

public class MultiTest {
	public static void main(String[] args) {
//		D d = new D();
//		d.doSomething();
		E obj2 = new E();
//		obj2.f();
		obj2.dosomthing();
	}
}
```

위 코드의 핵심은

1. 인터페이스는 다중상속이 가능하고
2. 기존 인터페이스는 추상 메소드와 상수만 가능했지만
3. default로 메소드 정의도 가능하다.
4. 인터페이스를 상속 받으면 무조건 재정의를 해야되고
5. 함수 이름이 동일해도 재정의를 하기 때문에 메소드의 모호성이 해결된다.
6. 기존 부모의 메소드를 사용하고 싶으면 메소드를 정의하면서 super객체로 접근한다.
7. ex. A인터페이스의 메소드 접근 A.super.f() 또는 C클래스의 메소드 접근 super.f()
