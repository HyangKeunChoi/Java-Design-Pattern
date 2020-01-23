package designpattern.chapter16.part6.Command;

public class StringPrintCommand implements Command2{

	private String string;
	
	public StringPrintCommand(String string) {
		this.string = string;
	}
	
	@Override
	public int compareTo(Command2 o) {
		
		StringPrintCommand other = (StringPrintCommand)o;
		
		return this.string.length() - other.string.length();
	}

	@Override
	public void execute() {
		
		System.out.println(this.string);
		
	}

	

}
