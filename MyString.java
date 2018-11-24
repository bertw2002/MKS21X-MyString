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
}
