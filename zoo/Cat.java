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
