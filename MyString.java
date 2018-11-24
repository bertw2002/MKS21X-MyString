public class MyString implements CharSequence, Comparable<CharSequence>{
 	private char[] data;
 	public MyString(CharSequence s){
    //makes charsequence into char cuz can't make data into charsequence
		char[] data = new char[s.length()];
    for (int x = 0;x < s.length();x++){
      data[x] = s.charAt(x);
    }
	}
	//Returns a string containing the characters in this sequence in the same order as this sequence.
	public String toString(){
		String var = "";
		for (int x = 0; x < data.length; x++){
			var += data[x];
		}
		return var;
	}
	//Returns the char value at the specified index.
	public char charAt(int index){
		if (index < 0 || index >= data.length){
			throw new IndexOutOfBoundsException("out of range");
		}
		return data[index];
	}
	//Returns the length of this character sequence.
	public int length(){
		return data.length;
	}
	//Returns a CharSequence that is a subsequence of this sequence.
	public CharSequence subSequence(int start, int end){
		if (start < 0 || end < 0 || end > data.length){
			throw new IndexOutOfBoundsException("out of range");
    }
    String val = "";
    for (int x = start; x < end; x++){
      val += data[x];
    }
    return val;
	}
  //Compares this object with the specified object for order. (Mystring with this charsequence)
  public int compareTo(CharSequence s){
    if (s == null){
      throw new NullPointerException("null value");
    }
    //check size first because data[x] or s.charat(x) may be index out of bounds
    int preventerror = 0;

    if (length() > s.length()) {
      preventerror = 1;
    }
    if (length() < s.length()){
      preventerror = -1;
    }
    //bigger or smaller
    if (preventerror == -1){
      //if s is smaller, make it not go further cuz it will throw error
      for (int x = 0; x < s.length(); x++){
        if (data[x] > s.charAt(x)) {
          return 1;
        }
        if (data[x] > s.charAt(x)){
          return -1;
        }
      }
    }
    //vice versa
    if(preventerror == 1){
      for (int x = 0; x < data.length; x++){
        if (data[x] > s.charAt(x)) {
          return 1;
        }
        if (data[x] > s.charAt(x)){
          return -1;
        }
      }
    }
    return preventerror;
  }
}
