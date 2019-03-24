// TO DO: add your implementation and JavaDoc

public class SmartArray<T>{

	private static final int DEFAULT_CAPACITY = 2;	//default initial capacity / minimum capacity
	private T[] data;	//underlying array

	// ADD MORE PRIVATE MEMBERS HERE IF NEEDED!
	
	@SuppressWarnings("unchecked")
	public SmartArray(){
		//constructor
		//initial capacity of the array should be DEFAULT_CAPACITY
	}

	@SuppressWarnings("unchecked")
	public SmartArray(int initialCapacity){
		// constructor
		// set the initial capacity of the smart array as initialCapacity

		// throw IllegalArgumentException if initialCapacity is smaller than 1
	}
	

	public int size() {	  
		//report number of elements in the smart array
		// O(1)
		
		return 0;
	}
		
	public int capacity() { 
		//report max number of elements before the next expansion
		// O(1)

		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public void add(int index, T value){
		// insert value at index, shift elements if needed  
		// double the capacity if no space is available
		// throw IndexOutOfBoundsException for invalid index
		// O(N) where N is the number of elements in the array
		
		// Note: this method may be used to append items as
		// well as insert items
	}

	public T get(int index){
		// return the item at index
		// throw IndexOutOfBoundsException for invalid index
		// O(1)

		return null;
	}


	public T replace(int index, T value){
		// change item at index to be value	
		// return old item at index
		// throw IndexOutOfBoundsException for invalid index
		// O(1)
		
		// Note: you cannot add new items with this method

		return null;
	}


	@SuppressWarnings("unchecked")
	public T delete(int index){
		// remove and return element at position index
		// shift elements to remove any gap in the array
		// throw IndexOutOfBoundsException for invalid index
		
		// halve capacity if the number of elements falls below 1/4 of the capacity
		// capacity should NOT go below DEFAULT_CAPACITY
		
		// O(N) where N is the number of elements in the list

		return null;
	}  

	@SuppressWarnings("unchecked")
	public boolean ensureCapacity(int newCapacity){
		// change the max number of items allowed before next expansion to newCapacity
		
		// capacity should not be changed if:
		//   - newCapacity is below DEFAULT_CAPACITY; or 
		//   - newCapacity is not large enough to accommodate current number of items
		
		// return true if newCapacity gets applied; false otherwise
		// O(N) where N is the number of elements in the array
		
		return false;	
	}


	// --------------------------------------------------------
	// example testing code... edit this as much as you want!
	// --------------------------------------------------------

	// Not required, update for your own testing
	public String toString(){
		// return string representation of DynamicArray
		// update if you want to include more information 
		return "SmartArray";
	}

	// Not required, update for your own testing
	public static void main (String args[]){

		//create a smart array of integers
		SmartArray<Integer> nums = new SmartArray<>();
		if ((nums.size() == 0) && (nums.capacity() == 2)){
			System.out.println("Yay 1");
		}

		//append some numbers 
		for (int i=0; i<3;i++)
			nums.add(i,i*2);
		
		if (nums.size()==3 && nums.get(2) == 4 && nums.capacity() == 4 ){
			System.out.println("Yay 2");
		}
		
		//create a smart array of strings
		SmartArray<String> msg = new SmartArray<>();
		
		//insert some strings
		msg.add(0,"world");
		msg.add(0,"hello");
		msg.add(1,"new");
		msg.add(3,"!");
		
		//replace and checking
		if (msg.get(0).equals("hello") && msg.replace(1,"beautiful").equals("new") 
			&& msg.size() == 4 && msg.capacity() == 4 ){
			//System.out.println(msg);
			System.out.println("Yay 3");
		}
		
		//change capacity
		if (!msg.ensureCapacity(0) && !msg.ensureCapacity(3) && msg.ensureCapacity(20)
			&& msg.capacity() == 20){
			System.out.println("Yay 4");
		}	 

		//delete and shrinking
		if (msg.delete(1).equals("beautiful") && msg.get(1).equals("world")  
			&& msg.size() == 3 && msg.capacity() == 10 ){
			System.out.println("Yay 5");
		}
	}
}