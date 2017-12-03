package gitem;
/*Public - allows all classes to use
* Static - only a class can call
* void - states that a function doesn't return any values after it's done executing
* main - name of function
* final - constant 
* 
* double - basically a float and is a number with decimals
* boolean, int
* It's possible to declare multiple variables (ex. integerOne, integerTwo; )
* 
* Primitive Types - what values they can hold
* byte - biggest = 127 and smallest = -128
* short - biggest = 32767 and smallest = -32768
* integer - biggest = 2.1 billion
* long - biggest = 9220000000000000000L (you need to put L at the end)
* float - biggest = 3.14F (you need to put F at the end)
* double - biggest = 3.14823794872734972347923748
*/

public class HelloWorld1{
	
	static String randomString = "A string to print";
	
	static final double PIN_NUMBER = 3.141529;
	
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println(randomString);
		System.out.println(PIN_NUMBER);
		
		int integerOne = 22;
		int integerTwo = integerOne + 1;
		System.out.println(integerTwo);
		
		//Biggest float value
		System.out.println(Float.MAX_VALUE);
		//Biggest double value
		System.out.println(Double.MAX_VALUE);
		
		
		boolean oneAndOnlyTruth = true;
		
		/*char randomChar = 65;
		*NO DOUBLE QUOTES
		*char anotherChar = 'A';
		*System.out.println(anotherChar); will print out an A*/
		
		String anotherString = "stuff";
		String andAnotherString = randomString + ' ' + anotherString;
		System.out.println(andAnotherString);
		
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt= 2100000000;
		long bigLong = 9220000000000000000L;
		float bigFloat= 3.14F;
		double bigDouble= 3.14823794872734972347923748;
		
		//Convert all to strings
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigLong);
		String floatString = Float.toString(bigFloat);
		String doubleString = Double.toString(bigDouble);
		String booleanString = Boolean.toString(oneAndOnlyTruth);
		
		//Double to integer
		double aDoubleValue = 3.14;
		int doubleToInt = (int) aDoubleValue;
		System.out.println(doubleToInt);
		
		//Just like JavaScript. parseInt turns numbers into strings
		int stringToInt = Integer.parseInt(intString);
		System.out.println(stringToInt);
		
	}
}