package client;

import obs.Reader;
import sub.NewsPaper;

public class Client {
  public static void main(String[] args) {
    // 建立一個報紙 作為一個觀察者
    NewsPaper subject = new NewsPaper();
    // 建立閱讀者 也就是觀察者
    Reader reader1 = new Reader();
    reader1.setName("張三");
    Reader reader2 = new Reader();
    reader2.setName("李四");
    Reader reader3 = new Reader();
    reader3.setName("王五");
    // 註冊訂閱者
    subject.attach(reader1);
    subject.attach(reader2);
    subject.attach(reader3);
    //出報紙了
    subject.setContent("本期內容是觀察者模式");
  }
}
