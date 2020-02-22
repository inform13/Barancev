package ru.stqua.baran.sandbox;


import org.testng.annotations.Test;
import org.testng.Assert;
import ru.stqa.baran.sandbox.Square;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
