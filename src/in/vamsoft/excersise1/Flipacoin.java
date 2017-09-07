package in.vamsoft.excersise1;

/**
 * @author vignesh
 *
 */
public class Flipacoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flip;
for (flip=1;flip<=10;flip++) {
	if(Math.random()>=0.5) {
		System.out.println(flip+" Heads");
	}
	else {
		System.out.println(flip+" Tails");
	}
}
	}

}
