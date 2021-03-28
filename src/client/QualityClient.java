package client;

import inf.WatcherObserver;
import obs.Watcher;
import sub.WaterQuality;

public class QualityClient {
  public static void main(String[] args) {
    // 建立水質主題
    WaterQuality subject = new WaterQuality();
    // 建立觀察者
    WatcherObserver watcher1 = new Watcher();
    watcher1.setJob("監測人員");
    WatcherObserver watcher2 = new Watcher();
    watcher2.setJob("預警人員");
    WatcherObserver watcher3 = new Watcher();
    watcher3.setJob("監測部門領導");
    // 註冊觀察者
    subject.attach(watcher1);
    subject.attach(watcher2);
    subject.attach(watcher3);

    // 填寫水質報告
    System.out.println("當水質為正常的時候----------------");
    subject.setPollutedLevel(0);
    System.out.println("當水質為輕度汙染的時候----------------");
    subject.setPollutedLevel(1);
    System.out.println("當水質為中度汙染的時候----------------");
    subject.setPollutedLevel(2);
  }
}
