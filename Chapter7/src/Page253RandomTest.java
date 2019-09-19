import java.util.Arrays;
import java.util.Random;

public class Page253RandomTest {
	public static void main(String[] args) {

		Random ran = new Random(50);
		Random ran2 = new Random(50);


		System.out.println("ran.nextBoolean(): " + ran.nextBoolean());
		System.out.println("ran1.nextBoolean(): " + ran.nextBoolean());
		System.out.println("ran2.nextBoolean(): " + ran2.nextBoolean());


		byte[] buffer = new byte[16];
		ran.nextBytes(buffer);
		System.out.println("buffer1:  "+ Arrays.toString(buffer));

		ran2.nextBytes(buffer);
		System.out.println("buffer2:  "+ Arrays.toString(buffer));

		System.out.println("ran1.nextDouble(): " + ran.nextDouble());
		System.out.println("ran11.nextDouble(): " + ran.nextDouble());
		System.out.println("ran2.nextDouble(): " + ran2.nextDouble());

		System.out.println("ran.nextFloat(): " + ran.nextFloat());
		System.out.println("ran2.nextFloat(): " + ran2.nextFloat());


		System.out.println("ran.nextGaussian():" + ran.nextGaussian());
		System.out.println("ran2.nextGaussian():" + ran2.nextGaussian());


		System.out.println("ran.nextInt(): " + ran.nextInt());
		System.out.println("ran2.nextInt(): " + ran2.nextInt());

		System.out.println("ran.nextInt(): " + ran.nextInt(26));
		System.out.println("ran2.nextInt(): " + ran2.nextInt(26));

		System.out.println("ran.nextLong():" + ran.nextLong());
		System.out.println("ran2.nextLong():" + ran2.nextLong());


	}
}
