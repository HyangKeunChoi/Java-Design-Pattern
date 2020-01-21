package designpattern.chapter15.Observer.part1;

public class Button {
	
	public void onClick() {
		// 이벤트 처리
		
		if(onClickListener != null)
		onClickListener.onClick(this); // 자기 자신을 인자로 넘김
		
		
	}
	
	// 옵저버 패턴은 인터페이스가 내부에서 선언이 많이됨 
	public interface OnClickListener{
		public void onClick(Button button);
	}
	private OnClickListener  onClickListener;
	
	public void setClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
}
