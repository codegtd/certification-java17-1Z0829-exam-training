package interfaces;

interface Confusable {
  String confuse();
}

abstract class Confused {
  // FAIL: abstract Integer confuse();

  // OK: because Object "shelts"/"is" everything, it includes String
  abstract Object confuse();
}

public class AppDriverTest extends Confused implements Confusable{
  public static void main(String[] args) {
    AppDriverTest driver = new AppDriverTest();
    System.out.println(driver.getClass().getName());
  }

  @Override
  public String confuse() {
    return null;
  }

// CANNOT REPEAT METHOD NAME
//  @Override
//  public Integer confuse() {
//
//    return null;
//  }

}