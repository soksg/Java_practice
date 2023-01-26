package classMethod.human;

public class ClassMethod02 {
	public static void main(String[] args) {
		human02 yamada=new human02();
		System.out.println("名前は"+yamada.name+"で年齢は"+yamada.age+"です");

		human02 sato=new human02("佐藤", 28);
		System.out.println("名前は"+sato.name+"で年齢は"+sato.age+"です");
	}
}
