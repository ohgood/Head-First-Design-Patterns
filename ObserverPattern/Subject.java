package ObserverPattern;

public interface Subject {
	/*注册观察者*/
	public void registerObserver(Observer o);
	/*删除观察者*/
	public void removeObserver(Observer o);
	/*当主题状态改变时，通知所有的观察者*/
	public void notifyObservers();
}
