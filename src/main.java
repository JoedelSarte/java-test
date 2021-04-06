
public class main {

	public static void main(String[] args) {
		String text = "programming";
		String[] text_array = text.split(""); /*split will return an array object based on the delimiter used*/
		for (int x=0; x<text_array.length; x++) { /*basic structure of for loop first is your control variable 
													then the condition hence x<test_array.length the loop will 
													continue to perform the operations inside the for loop until 
													it no longer satisfies the condition third is your control so 
													that the loop will not loop endlessly here it will increment 
													your control variable until the condition no longer satisfies or hit false*/
			System.out.println(text_array[x]);	/* In order to access every element in array you need to access it by providing the index
			 									   hence test_array[x], every array the initial index always starts at 0 that's why you can 
			 									   see in our control variable in the for loop we set the x to be 0*/
		}

	}

}
