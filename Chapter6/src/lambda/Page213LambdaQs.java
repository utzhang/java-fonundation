package lambda;

interface Eatable {
	void taste();
}

interface Flyable{
	void fly(String weather);
}

interface Addable {
	int add(int a, int b);
}

public class Page213LambdaQs {
	public void eat(Eatable e){
		System.out.println(e);
		e.taste();
	}

	public void drive(Flyable f){
		System.out.println("我正在驾驶：" + f);
		f.fly("晴天");
	}

	public void test(Addable a){
		System.out.println("5+3的和为：" + a.add(5, 3));

	}

	public static void main(String[] args) {
		Page213LambdaQs qs = new Page213LambdaQs();


		//interface Eatable {
		// 	void taste();
		// }
		qs.eat(()-> System.out.println("苹果的味道不错"));

		qs.drive(weather -> {
			System.out.println("今天的天气是：" + weather);
			System.out.println("直升机飞行平稳");
		});

		qs.test((a, b) -> a + b);

	}

}
