package zoo;

public class Kangaroo extends Animal implements Mammal{

	@Override
	void makeSomeNoise() {
		System.out.println("머엉ㅇ");
	}

	@Override
	public void eungAe() {
		System.out.println("한마리 잘 키우자");
	}
}
