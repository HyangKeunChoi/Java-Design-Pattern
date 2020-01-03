package designpattern.chapter3.dp;

public abstract class AbstGameConnectHelper {

	//����
	protected abstract String doSecurity(String string);
	
	// ����
	protected abstract boolean authentication(String id, String password);
	
	// ����
	protected abstract int authorization(String userName);
	
	// ����
	protected abstract String connection(String info);
	
	// ���ø� �޼ҵ�
	public String requestConnection(String encodedInfo) {
		
		// ���� �۾� -> ��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encodedInfo);
		
		String id = "aaa";
		String password = "bbb";
		
		// ��ȯ�� ���� ������ ���̵�, ��ȣ�� �Ҵ��Ѵ�.
		
		if (!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}
		
		
		
		String userName = "";
		int i = authorization(userName);
		
		switch (i) {
		
		case -1 :
			throw new Error("10�� ���� �˴ٿ�");
		
		case 0 :
			System.out.println("���Ӹ޴���");
			break;
		
		case 1 : // ���� ȸ��
			
			break;
		case 2 : // ���� ȸ��
			break;
		
		
		case 3 : //���� ����
			break;
			
			default : // ��Ÿ����
				break;
		
		}
		
		
		return connection(decodedInfo);
	}
}
