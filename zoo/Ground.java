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
//		�������̽��� �̿��Ͽ� Bird��� �ٸ� Ŭ�������� ���������� ����� ���ִ�.
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Bird) {
				System.out.println(i + "�� ���� ���� �־��");				
			}
		}
	}
}
