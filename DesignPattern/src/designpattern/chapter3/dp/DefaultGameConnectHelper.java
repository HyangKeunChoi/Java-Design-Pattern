package designpattern.chapter3.dp;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

	@Override
	protected String doSecurity(String string) {
		// System.out.println("���ڵ�");
		
		// �߰� �䱸����
		System.out.println("��ȭ�� �˰����� �̿��� ���ڵ�");
		
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵� / ��ȣ Ȯ�� db����");
		
		return true; //�ϴ� ������ �´ٰ� �ѱ�
	}

	@Override
	protected int authorization(String userName) {
		
		System.out.println("���� Ȯ��");
		
		// �������� �����̸� ������ ���̸� �� �� �ִ�.
		// ���̸� Ȯ���ϰ� ���� �ð� Ȯ���ؼ� �� �� => ������ �ƴϰ� 10�ð� �����ٸ� if���� ����
		// ������ ���� ������ �Ѵ�.
		
		return 0;
	}

	@Override
	protected String connection(String info) {
		
		System.out.println("������ ���Ӵܰ�!");
		
		return info;
	}

}
