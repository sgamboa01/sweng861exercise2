public class HelloWorld {

	public static void main(String[] args) {
		String greeting = "hello world!";
		int greetingLen = greeting.length();
		for (int i=0; i<greetingLen; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println(greeting.charAt(i));
		}

	}

}
