// TO DO: add your implementation and JavaDoc

public class SortableNumber implements Sortable{

	// ADD PRIVATE MEMBERS HERE IF NEEDED!

	public SortableNumber(int base, String digits){
		// constructor
		// set the base and digits of the number

		// Note: you can assume that 
		//		 - the incoming base is an integer from 2 to 16 inclusively
		// 		 - the incoming digits has no leading/trailing spaces
		//       - the incoming digits is not an empty string
		
	}
	
	public String digits(){
		// return the non-padded digits
		
		return "";
	}

	public String paddedDigits(){
		// return the padded digits
		
		return "";
	}
	
	public int maxNum(){
		// return the max possible numeric value of a single digit as a decimal
		
		return -1;
	}
	
	public int posToNum(int pos){
		// return the value at location pos of the padded digits as a decimal
		// rightmost position (least significant digit position) is 0
		// return -1 if position is invalid or any exception occurs 
		
		return 0;		
	}
	
	public void padDigits(int minLength){
		// pad to ensure the length of padded string is 
		// at least minLength
		
	}

	// --------------------------------------------------------
	// example testing code... edit this as much as you want!
	// --------------------------------------------------------
	
	public static void main(String[] args){
	
		// create a decimal
		SortableNumber num = new SortableNumber(10,"123");
		
		// check features
		if ((num.maxNum() == 10) && (num.digits().equals("123"))
			&& (num.posToNum(0)==3)){
			System.out.println("Yay 1");
		}
		
		// pad
		num.padDigits(5);
		if ( num.paddedDigits().length()==5 && num.posToNum(2)==1
			&& num.posToNum(4)==0){
			System.out.println("Yay 2");
		}
		
		// create a hex
		SortableNumber hex = new SortableNumber(16,"AB");
		
		// check features
		if ( hex.maxNum()==16 && hex.posToNum(0)==11
			&& hex.posToNum(1)==10  && hex.posToNum(10)==-1){
			System.out.println("Yay 3");
		}
		
	}
}