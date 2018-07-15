package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		s.toLowerCase();
		s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			if(i%2!=0) {
				
			}
		}
	}

}
