package chap02;
//배열 복제하기
public class CloneArray {

	public static void main(String[] args) {
		int[]a = {1,2,3,4,5};
		int[]b = a.clone(); //b는 a의 복제를 참고한다

		b[3] = 0; //한 요소에만 0을 대입한다

		System.out.print("a = ");
		for(int i = 0; i<a.length;i++) {
			System.out.print(" " + a[i]);
		}

		System.out.print("\nb = ");
		for(int i=0; i<b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}
}
