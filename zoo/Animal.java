package zoo;
// animal�� �߻� Ŭ�����̴�.
public abstract class Animal {
	String name;
	String gender;
	int age;

	//	final �޼ҵ�� �ڽ� Ŭ�������� �����ǰ� �Ұ����ϴ�.
	 final void intro() {
		 System.out.println("���� �����Դϴ�.");
	 }
//	�߻� �޼ҵ带 �����.
	abstract void makeSomeNoise();
//	�Ϲ� �޼ҵ嵵 ���� �����ϴ�.
	void eat() {
		System.out.println(name + "��(��) �ȳ� �Դ���..");
	}
}
