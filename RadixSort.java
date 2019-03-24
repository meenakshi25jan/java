// TO DO: add your implementation and JavaDoc

//These are all the imports you are allowed, don't add any more!
import java.util.Scanner;
import java.io.IOException;

public class RadixSort{

	// DO NOT MODIFY INSTANCE VARIABLES PROVIDED BELOW
	// EXCEPT TO ADD JAVADOCS
	
	//an array of buckets to be used in each round
	private SmartArray<SmartArray<Sortable>> buckets;	
	
	//A SmartArray to store values to be sorted.
	//It is also used to store intermediate results after 
	//each round and the final group of sorted values.
	//The values should always be sorted in ascending order.	
	private SmartArray<Sortable> values; 

	// ADD MORE PRIVATE MEMBERS HERE IF NEEDED!

	// constructor
	public RadixSort(){

	}
	
	// return true if the numbers are guaranteed to be sorted,
	// i.e. all digit locations have been inspected
	// return false otherwise
	public boolean isSorted() { 
		
		return false;
	}

	// return which round is about to be performed
	// round number starts with 0 after a new group of value
	// gets initialized
	public int getRound() {
	
		return -1;
	}
	
	
	// return the number of buckets to be used in each round
	public int getNumBuckets() {
	
		return -1;
	
	}

	// return the group of values to be sorted
	public SmartArray<Sortable> getValues() {
		
		return null;
	}

	// return the array of values corresponding to bucketNum
	// return null for invalid bucketNum
	public SmartArray<Sortable> getBucket(int bucketNum) {
		

		return null;
	}

	// return the max number of digits of the values
	public int getMaxLength() {

		return -1;
	}
	

	// read values from the provided scanner
	// get ready to sort the new group of values
		
	// first specify the base:
	// "a" - alphabetic string with CAPITAL LETTERS only;
	// otherwise it would be an integer base in [2,16]
	// (10 for decimal, 2 for binary, 16 for hexdecimal, etc.)
	
	// Note: you can assume the type input is always valid	
	public void initValuesFromScanner(Scanner s) throws IOException {
		
		//--------------------------------------------------------
		// The following lines are provided to you as a starting point.
		// Use it as is or make changes as you want
		String type = s.next();
		int base;
		if (!type.equals("a"))
			base = Integer.parseInt(type);		
		else
			base = SortableString.BASE;
		// end of provided code
		//--------------------------------------------------------
		
		// your code can start from here to finish 
		// reading from the scanner and initialization of values

	
	}
	
	// check the list of values and remove the ones with invalid digits
	// return the number of invalid values removed
	public int sanitizeValues(){
		
		return -1;
	}

	// make sure all values are of the same length
	// use padding if needed
	// return the number of values padded
	public int setSameLength(){

		return -1;
	}
	
	// perform one round of radix sort
	//  - round number should be incremented by 1
	//  - instance variables buckets and values should be updated 
	//    based on LSD radix sort algorithm
	public void oneRound(){
		
		

				
	}

	// --------------------------------------------------------
	// example testing code... edit this as much as you want!
	// --------------------------------------------------------
	public static void main(String[] args){
	
		// create a RadixSort object and read in from a String
		RadixSort rs = new RadixSort();
		try{
			Scanner s = new Scanner("a BOB TOM AMY TIM");
			rs.initValuesFromScanner(s);
		}
		catch (IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		
		// check features after initialization
		SmartArray<Sortable> vs = rs.getValues();
		if (vs.size() == 4 && vs.get(0).digits().equals("BOB")
			&& vs.get(2).digits().equals("AMY")){
			System.out.println("Yay 1");
		}

		// get ready to sort
		if (rs.sanitizeValues() == 0 && rs.setSameLength() == 0
			&& rs.getMaxLength() == 3 && rs.getRound()==0){
			System.out.println("Yay 2");			
		}

		// one round of radix sort		
		rs.oneRound();
		vs = rs.getValues(); //should be "BOB","TOM","TIM","AMY"
		if (!rs.isSorted() && rs.getRound()==1 
			&& vs.get(0).digits().equals("BOB") 
			&& vs.get(2).digits().equals("TIM")){
			System.out.println("Yay 3");			
		}
		
		// bucket for "M": should contains "TOM" and "TIM"
		SmartArray<Sortable> bucket = rs.getBucket(13);
		if (bucket.size() == 2 
			&& bucket.get(0).digits().equals("TOM")
			&& bucket.get(1).digits().equals("TIM")){
			System.out.println("Yay 4");			
		}
		
		// Note: use provided RadixSortASCII class 
		//       for debug printing can be helpful
		
					
	}

}

