package interfaces;

public abstract class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = s;
	}
	
	private String funkifyText(String s2) {
		s  = s2;
		return s2;
	}

	public String toString() {
		return s;
	}
}
