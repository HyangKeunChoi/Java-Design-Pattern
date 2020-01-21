package designpattern.chapter15.Observer.part1;

public class Button {
	
	public void onClick() {
		// �̺�Ʈ ó��
		
		if(onClickListener != null)
		onClickListener.onClick(this); // �ڱ� �ڽ��� ���ڷ� �ѱ�
		
		
	}
	
	// ������ ������ �������̽��� ���ο��� ������ ���̵� 
	public interface OnClickListener{
		public void onClick(Button button);
	}
	private OnClickListener  onClickListener;
	
	public void setClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
}
