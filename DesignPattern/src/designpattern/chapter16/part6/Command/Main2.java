package designpattern.chapter16.part6.Command;

import java.util.PriorityQueue;

//���� 2
public class Main2 {
	public static void main(String[] args) {
		
		// Ŀ�ǵ尡 ����� ��üȭ��ٴ� ���� �߿� 
		
		PriorityQueue<Command2> queue = new PriorityQueue<>();
		
		queue.add(new StringPrintCommand("ABCD"));
		queue.add(new StringPrintCommand("ABC"));
		queue.add(new StringPrintCommand("AB"));
		queue.add(new StringPrintCommand("A"));
		

		
		
		for (Command2 command2 : queue) {
			command2.execute();
		}
	}
}
