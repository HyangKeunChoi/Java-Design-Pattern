package designpattern.chapter16.part1.Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	
	protected List<Colleague> colleagues;
	
	public Mediator() {
		colleagues = new ArrayList<>();
	}
	
	// ���ϱ�
	public boolean addColleague(Colleague colleague) {
		
		if(colleagues != null)
			return colleagues.add(colleague);
		else
						
			return false; // ���԰��
			
	}
	
	// �����ϱ�
	public abstract void mediate(String data);
	
}
