package zoo;
// 비어 있는 인터페이스는 아래와 같이 animal의 상속과 추상 메소드만이 정의하고 있다.
public class Avialae extends Animal implements Bird{

	@Override
	void makeSomeNoise() {
		System.out.println("시져시져");
	}
}
