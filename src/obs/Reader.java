package obs;
import inf.Observer;

public class Reader implements Observer{
  /**
   * 讀者的姓名
   */
  private String name;
  @Override
  public void update(String content) {
    // 這是採用推的方法
    System.out.println(name + " 收到報紙了，閱讀它 內容是===" + content);
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
