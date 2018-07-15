package interfaces;
import interfaces.SpecialString;
public class BackwardsString extends SpecialString{	
	public String funkifyText(String s){
		for(int i = s.length()-1; i>0; i--) {
			char c = s.charAt(i);
			s = s+=Character.toString(c);
			System.out.println(s);
		}
		char c = s.charAt(0);
		s = s+=Character.toString(c);
		s = s.substring(s.length()/2);
		System.out.println(s);
		return s;
	}
	public BackwardsString(String s2) {
		super(s2);
		s = funkifyText(s);
	}

}
