package launcher;

import org.testng.annotations.Test;

public class MainTest {

  /** Tests default launch of the service without any CLI parameters. No exceptions expected. */
  @Test
  public void defaultLaunchTest() {
    Main.main(new String[]{});
  }

}
