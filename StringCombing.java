
public class StringCombing {
		public static String mergeTwoStrings(String str1, String str2) {
			 
			StringBuilder sb = new StringBuilder();
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			int length;
			if(str1.length() > str2.length()){
				length = str1.length();
			}else{
				length = str2.length();
			}
			for(int i = 0; i < length; i++){
				if(i < str1.length())
					sb.append(string1[i]);
				if(i < str2.length())
					sb.append(string2[i]);
			}
	 
	 
			return sb.toString();
		}
		public static void main(String[] args) {
			String str1;
			String str2;
			String expect;
			
		/*	str1 = "abc";
			str2 = "xyz";
			expect = "axbycz";
			
			System.out.println("Excepted value: " + expect);*/
			
			str1 = "abcde";
			str2 = "xyz";
			expect = "axbyczde";
				 
			System.out.println("Excepted value: " + expect);

		}

	}


