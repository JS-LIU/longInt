package longInt;

public class Test {
	
	calculate c = new calculate();
	turn t = new turn();
	
	public void multy_2_3(){
		System.out.println(c.multiply("2","3") + "--" + "6".equals(c.multiply("2","3")));
	}
	
	public void multy_3_4(){
		System.out.println(c.multiply("3","4") + "--" + "12".equals(c.multiply("3","4")));
	}
	
	public void multy_12_4(){
		System.out.println(c.multiply("12","4") + "--" + "48".equals(c.multiply("12","4")));
	}
	
	public void multy_99_2(){
		System.out.println(c.multiply("99","2") + "--" + "198".equals(c.multiply("99","2")));
	}
	
	public void multy_99_99(){
		System.out.println(c.multiply("99","99") + "--" + "9801".equals(c.multiply("99","99")));
	}
	
	public void com_9_2(){
		System.out.println(c.compareString("9", "2") + "--" + "9".equals(c.compareString("9", "2")));
	}
	
	public void add_1_2(){
		System.out.println(c.add("1", "2") + "--" + "3".equals(c.add("1", "2")));
	}
	
	public void add_7_6(){
		System.out.println(c.add("7", "6") + "--" + "13".equals(c.add("7", "6")));
	}
	
	public void add_22_33(){
		System.out.println(c.add("22", "33") + "--" + "55".equals(c.add("22", "33")));
	}
	
	public void add_99_88(){
		System.out.println(c.add("99", "88") + "--" + "187".equals(c.add("99", "88")));
	}
	
	public void add_999_988(){
		System.out.println(c.add("999", "988") + "--" + "1987".equals(c.add("999", "988")));
	}
	
	public void add_111_1(){
		System.out.println(c.add("111", "1") + "--" + "112".equals(c.add("111", "1")));
	}
	
	public void add_1_111(){
		System.out.println(c.add("1", "111") + "--" + "112".equals(c.add("1", "111")));
	}
	
	public void padding_zero(){
		System.out.println(c.padding_0(1,"啊嘞") + "--" + "啊嘞0".equals(c.padding_0(1,"啊嘞")));
	}
	
	public void multy_9999_99(){
		System.out.println(c.multiply("9999","99") + "--" + "989901".equals(c.multiply("9999","99")));
	}
	
	public void multy_99_9999(){
		System.out.println(c.multiply("99","9999") + "--" + "989901".equals(c.multiply("99","9999")));
	}
	
//	public void string_int(){
//		System.out.println(t.strToInt("123445",1) + "--" + (2 == t.strToInt("123445",1)));
//	}
}
