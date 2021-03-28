package sub;

import inf.WatcherObserver;

public class WaterQuality extends WaterQualitySubject{
  /**
   * 汙染的級別  0:正常 1: 輕度 2: 中度 3: 高度
   */
  private int pollutedLevel = 0;
  /**
   * 設定汙染的級別
   * @param pollutedLevel 汙染的級別
   */
  public void setPollutedLevel(int pollutedLevel) {
    this.pollutedLevel = pollutedLevel;
    // 通知對應的觀察者
    this.notifyWatchers();
  }

  @Override
  public void notifyWatchers() {
    // loop 所有的觀察者
    for (WatcherObserver watcher : observers) {
      if (this.pollutedLevel >= 0) {
        // 通知監測人員
        if ("監測人員".equals(watcher.getJob())) {
          watcher.update(this);
        }
      }
      if (this.pollutedLevel >= 1) {
        // 通知預警人員
        if ("預警人員".equals(watcher.getJob())) {
          watcher.update(this);
        }
      }
      if (this.pollutedLevel >= 2) {
        // 通知監測部門領導
        if ("監測部門領導".equals(watcher.getJob())) {
          watcher.update(this);
        }
      }
    }
  }

  @Override
  public int getPollutedLevel() {
    return pollutedLevel;
  }
  
}
