package interfaces;

public class MixedCapsString extends SpecialString {

	public String funkifyText(String s) {
		s = s.toLowerCase();
		System.out.println(s);
		int n = s.length();
		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if(i%2!=0) {
			s += Character.toString(c).toUpperCase();
			} else {
				s+=c;
			}
			System.out.println(s);
		}
		s = s.substring(s.length()/2);
		System.out.println(s);
		return s;
	}
	
	public MixedCapsString(String s2) {
		super(s2);
		s = funkifyText(s);
	}

}
