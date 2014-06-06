package mp1401.examples.misterx.model.gameitems.impl;

import java.awt.Point;

import mp1401.examples.misterx.model.factory.GameItemFactoryImpl;
import mp1401.examples.misterx.model.gameitems.City;

import org.junit.Assert;
import org.junit.Test;

public class CityImplTest {

  @Test
  public void testEquals() {
    final City city1 = GameItemFactoryImpl.getInstance().createCity("Zuerich", new Point(1, 1));
    final City city2 = GameItemFactoryImpl.getInstance().createCity("Zuerich", new Point(2, 1));
    Assert.assertEquals("Expected cities to be equal", city1.equals(city2), true);
  }

}
