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
