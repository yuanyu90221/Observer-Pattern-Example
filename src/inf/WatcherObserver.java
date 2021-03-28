package inf;

import sub.WaterQualitySubject;

public interface WatcherObserver {
  /**
   * 被通知的方法
   * @param subject 傳入被觀察的目標物件
   */
  public void update(WaterQualitySubject subject);
  /**
   * 設定觀察人員的職務
   * @param job 觀察人員的職務
   */
  public void setJob(String job);
  /**
   * 獲得觀察人員的職務
   * @return 觀察人員的職務
   */
  public String getJob();
}
