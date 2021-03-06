package longInt;

public class calculate {
	
	turn t = new turn();
	//	多位数*个位数
	public String multiply_as_a(String digA, char digB){
		
		int int_remainder = 0;								//	余数
		int int_carry = 0;									//	进位
		String str_carry = "";
		StringBuffer str_result = new StringBuffer();
		
		//	digA的每一位与digB相乘
		for(int i = digA.length() - 1; i>=0; i--){
			//str_mult_a = digA.charAt(i);
		
			int int_a_a_result;
			
			Digital str_mult_a = new Digital(digA);
			int int_mult_a = str_mult_a.get(i);
			
			int int_mult_b = t.charToInt(digB);
			
			//	单位相乘；
			int_a_a_result = int_mult_a * int_mult_b;
			
			
			int_remainder = int_a_a_result % 10;	//	余数
			int_remainder += int_carry;				//	余数+进位
			int_carry = int_a_a_result / 10;		//	进位
			
			str_carry = String.valueOf(int_carry);
			
			str_result.append(int_remainder);
			
		}
		//	字符串比较使用equal();
		if(int_carry != 0){
			str_result.append(str_carry);
		}
		str_result.reverse();
		String result = str_result.toString();
		
		return  result;
	}
	
	public String padding_0(int how_zero,String str){
		for(int i = 0; i < how_zero ; i++){
			str += "0";
		}
		return str;
	}
	//	加法
	public String add(String addA,String addB){
		Digital str_add_long = new Digital(compareString(addA,addB));
		String str_add_short_zj="";
		if(str_add_long.s.equals(addA)){
			str_add_short_zj = addB;
		}else{
			str_add_short_zj = addA;
		}
		Digital str_add_short = new Digital(str_add_short_zj);
		
		StringBuffer str_add_result = new StringBuffer();
		int j = str_add_long.s.length() - str_add_short.s.length();

		int int_carry = 0;
		int int_remainder = 0;
		String str_carry = "";
		
		//	 实现加法逻辑
		for(int i = str_add_long.s.length() - 1;i >= 0; i --){
				
			int int_add_long = str_add_long.get(i);
			int int_add_short_zj = 0;
			if(i-j > -1){
				int_add_short_zj = str_add_short.get(i-j);
			}
			int int_add_short = int_add_short_zj;

			/*
			 * 1.相加
			 * 2.求余数
			 * 3.余数与进位相加
			 * 4.求进位
			 */
			int int_result = int_add_long + int_add_short;
			int_remainder = int_result % 10;				//	余数
			int_remainder += int_carry;
			int_carry = int_result / 10;					//	进位
			str_carry = String.valueOf(int_carry);
			str_add_result.append(int_remainder);
		}
		
		
		if(int_carry != 0){
			str_add_result.append(str_carry);
		}
		str_add_result.reverse();
		String result = str_add_result.toString();
		return result;
	}
	
	//	长整数比较大小
	public String compareString(String a, String b){
		char str_a;
		char str_b;
		int a_len = a.length();
		int b_len = b.length();
		String str_max = a;
		if( a_len > b_len){
			str_max = a;
		}else if(a_len < b_len){
			str_max = b;
		}else{
			for(int i = 0;i < a_len;i++){
				str_a = a.charAt(i);
				str_b = b.charAt(i);
				int int_a = t.charToInt(str_a);
				int int_b = t.charToInt(str_b);
				if(int_a > int_b){
					str_max = a;
				}else{
					str_max = b;
				}
			}
			
		}
		return str_max;
	}
	//	乘法
	public String multiply(String digA,String digB){
		
		String str_dig_long = compareString(digA,digB);
		String str_dig_short = "";
		if(str_dig_long.equals(digA)){
			str_dig_short = digB;
		}else{
			str_dig_short = digA;
		}
		
		char str_mult_b;	
		
		String str_result_last = "0";
		String str_result_this = "0";
		//	遍历digB，digB中的每一位 与 digA中的每一位相乘
		for(int i = str_dig_short.length() - 1; i >= 0; i --){
			int j = str_dig_short.length() - 1 - i;
			str_mult_b = str_dig_short.charAt(i);
			
			str_result_this = padding_0(j,str_result_last);
			str_result_last = multiply_as_a(str_dig_long, str_mult_b);
			str_result_last = add(str_result_this,str_result_last);
			
		}
		return str_result_last;
	}
}


