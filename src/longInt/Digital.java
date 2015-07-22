package longInt;

public class Digital {
	turn t = new turn();
	
	String s="0";
	Digital(String s){
		this.s = s;
	}
	public int get(int i){
		char chr_s = s.charAt(i);
		int int_s = t.charToInt(chr_s);
		return int_s;
	}
}
