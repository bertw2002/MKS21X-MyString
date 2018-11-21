public class MyString implements CharSequence,Comparable<CharSequence>{
 	private char[] data;
 	public MyString(CharSequence s){
		data = s;
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
			throw new IndexOutofBoundsException();
		}
		return data(index);
	}
	//Returns the length of this character sequence.
	public int length(){
		return data.length;
	}
	//Returns a CharSequence that is a subsequence of this sequence.
	public CharSequence subsequence(int start, int end){
		if (start < 0 || end < 0 || end > data.length){
			throw new IndexOutofBoundsException();
		}
		int length = end - start;
		CharSequence newarr = new CharSequence[length];
	}
}
