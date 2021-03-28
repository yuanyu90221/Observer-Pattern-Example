package sub;

public class NewsPaper extends Subject{
  private String content;
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
    // 內容有了 就通知所有讀者
    notifyObserveres(content);
  }
}
