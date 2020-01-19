package designpattern.chapter11.Decorator;

/**
 * <h2><b>Role : </b>Component</h2>
 * <p>
 * ������Ʈ�� ������ �������� ������Ʈ���� �ٷ��, ��Ʈ���ϴ� ������ �մϴ�.
 * </p>
 * <h2><b>Coffee Hoses Menu</b></h2>
 * </br>
 * <ul>
 * <li>���������� : Ŀ���� �⺻</li>
 * <li>�Ƹ޸�ī�� : ���������� + ��</li>
 * <li>ī��� : ���������� + ������ũ</li>
 * <li>������� : �Ƹ޸�ī�� + ������� �÷�</li>
 * <li>ī���ī : ���������� + ������ũ + ���ݸ�</li>
 * <li>ļ��� �����ƶ� : ī��� + ļ��� �÷�</li>
 * </ul>
 * 
 * @author hyangkeun choi
 */
public interface IBeverage {
	
	/**
	 * �� ����
	 */
	int getTotalPrice();
}
