package obs;

import inf.WatcherObserver;
import sub.WaterQualitySubject;

public class Watcher implements WatcherObserver {
  /**
   * 職務
   */
  private String job;
  @Override
  public void update(WaterQualitySubject subject) {
    // 這裡是採用拉的方式
    System.out.println(job + "獲得到通知 目前汙染級別為:"+ subject.getPollutedLevel());
  }

  @Override
  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public String getJob() {
    return job;
  }
  
}
