package obs;
import inf.Observer;
import sub.NewsPaper;
import sub.Subject;

public class Reader implements Observer{
  /**
   * 讀者的姓名
   */
  private String name;
  @Override
  public void update(Subject subject) {
    // 這是採用拉的方法
    System.out.println(name + " 收到報紙了，閱讀它 內容是===" + ((NewsPaper)subject).getContent());
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
