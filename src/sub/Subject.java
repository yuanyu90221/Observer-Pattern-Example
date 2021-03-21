package sub;

import java.util.ArrayList;
import java.util.List;

import inf.Observer;

public class Subject {
	/**
	 * 用來儲存註冊的觀察者物件
	 */
	private List<Observer> readers = new ArrayList<Observer>();
	/**
	 * 報紙的讀者需要向報社訂閱
	 * @param reader
	 */
	public void attach(Observer reader) {
		readers.add(reader);
	}
	/**
	 * 報紙的讀者可以取消訂閱
	 * @param reader
	 */
	public void detatch(Observer reader) {
		readers.remove(reader);
	}
	
	protected void notifyObserveres() {
		for (Observer reader : readers ) {
			reader.update(this);
		}
	}
}
