
public class Chapter08 {
	public static void main(String[] args) {
//		問題１
		int i=1;
		while (i<5) {
			System.out.println(i*i);
		i++;
		}
//		問題２
		int array[]= {1,2,3,4,5};
		for (i=0; i<array.length; i++) {
			System.out.println(i);
		}
//		問題３
		for (int val : array) {
			if (val%2==0) {
				continue;
			}else {
				System.out.println(val);
			}
		}
	}
}
