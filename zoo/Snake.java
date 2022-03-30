package zoo;

public class Snake extends Animal{
// 추상 클래스를 상속 받으면 추상 클래스 내부의 추상 메소드를 반드시 재정의한다.
	@Override
	void makeSomeNoise() {
		System.out.println("슬리데린");
	}
	
}
