public class Page174Singleton {
	private static Page174Singleton instance;

	private Page174Singleton(){

	}

	public static Page174Singleton getInstance(){
		if (instance == null) {
			instance = new Page174Singleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		Page174Singleton s1 = Page174Singleton.getInstance();
		Page174Singleton s2 = Page174Singleton.getInstance();
		System.out.println(s1 == s2);
		
	}
}
