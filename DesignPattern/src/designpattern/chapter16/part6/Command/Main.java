package designpattern.chapter16.part6.Command;

import java.util.LinkedList;
import java.util.List;

public class Main {
	
	// ���� 1
	
	public static void main(String[] args) {
		
		List<Command> list = new LinkedList<>();
		
		list.add(new Command() {

			@Override
			public void execute() {
				
				System.out.println("�۾� 1 ");
			
			}
			
			
			
		});
		
		list.add(new Command() {

			@Override
			public void execute() {
				
				System.out.println("�۾� 2 ");
			}
			
			
			
		});
		
		list.add(new Command() {

			@Override
			public void execute() {
				
				System.out.println("�۾� 3 ");
			}
			
			
			
		});
		
		for (Command command : list) {
			command.execute();
		}
		
		
	}
}
