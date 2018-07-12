
public class Dog extends Cat {
//extends means that Dog class can use Cat methods
	int dogsAge;

	// This is a class constructor
	public Dog(int age) {
		dogsAge = age;
	}
	public void kissMe() {
		System.out.println("french kiss mowah");
	}
	public void rubMe(int numRubs) {
		System.out.println("giv meh: " + numRubs + " rubs ples");
	}
	public int catLives(){
		return 9;
	}
	
	
	// Built in main method
	public static void main(String[] args) {
		Dog zipper = new Dog(3);
		System.out.println("WOOOF, world");
		zipper.kissMe();
		zipper.rubMe(4);
		int enemyLives = zipper.catLives();
		System.out.println(enemyLives);
		zipper.incognitoSpy();
	}
}
