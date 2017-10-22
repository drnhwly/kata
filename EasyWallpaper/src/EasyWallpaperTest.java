import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EasyWallpaperTest {
  private EasyWallpaper easyWallpaper;
  
  @Before
  public void setUp() {
    easyWallpaper = new EasyWallpaper();
  }
  
  @After
  public void tearDown() {
    easyWallpaper = null;
  }
  
  @Test
  public void test1() {
    assertEquals("ten", easyWallpaper.wallpaper(4, 3.5, 3));
  }
  
  @Test
  public void test2() {
    assertEquals("sixteen", easyWallpaper.wallpaper(6.3, 4.5, 3.29));
  }
  
  @Test
  public void test3() {
    assertEquals("seventeen", easyWallpaper.wallpaper(6.3, 5.8, 3.13));
  }
  
  @Test
  public void test4() {
    assertEquals("zero", easyWallpaper.wallpaper(6.3, 5.8, 0));
  }

  @Test
  public void test5() {
    assertEquals("zero", easyWallpaper.wallpaper(6.3, 0, 3.13));
  }
  
  
}