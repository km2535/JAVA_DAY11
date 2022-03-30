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
