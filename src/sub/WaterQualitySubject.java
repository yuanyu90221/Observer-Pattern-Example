package sub;

import java.util.ArrayList;
import java.util.List;
import inf.WatcherObserver;

public abstract class WaterQualitySubject {
  /**
   * 用來儲存註冊的觀察者物件
   */
  protected List<WatcherObserver> observers = new ArrayList<WatcherObserver>();

  /**
   * 註冊觀察者物件
   * @param observer 觀察者物件
   */
  public void attach(WatcherObserver observer) {
    observers.add(observer);
  }
  /**
   * 刪除觀察者物件
   * @param observer 觀察者物件
   */
  public void detach(WatcherObserver observer) {
    observers.remove(observer);
  }
  /**
   * 通知對應的觀察者物件
   */
  public abstract void notifyWatchers();
  /**
   * 取得水質汙染的級別
   * @return 水質汙染的級別
   */
  public abstract int getPollutedLevel();
}
