package zoo;
// cat�� animal�� ��� �����鼭 mammal�� �������̽��� �޴´�.
public class Cat extends Animal implements Mammal{
//	final�� �����ǰ� �ȵǴ� ���� �� �� �ִ�.
	
//	@Override
//	void intro() {
//		System.out.println("���� �Ĺ��Դϴ�.");
//	}
	@Override
	void makeSomeNoise() {
		System.out.println("����");
	}
// �������̽��� �߻�޼ҵ嵵 �����ǰ� �ʿ��ϴ�.
	@Override
	public void eungAe() {
		System.out.println("������ �� �״ټ����� ���� ���´�.");
	}

}
