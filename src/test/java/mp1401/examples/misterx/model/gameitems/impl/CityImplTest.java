package mp1401.examples.misterx.model.gameitems.impl;

import static org.fest.assertions.Assertions.assertThat;

import java.awt.Point;

import mp1401.examples.misterx.model.factory.GameItemFactory;
import mp1401.examples.misterx.model.factory.GameItemFactoryImpl;
import mp1401.examples.misterx.model.gameitems.City;
import mp1401.examples.misterx.model.gameitems.Connection;
import mp1401.examples.misterx.model.gameitems.enums.ConnectionType;

import org.junit.Assert;
import org.junit.Test;

public class CityImplTest {

  private static final GameItemFactory FACTORY = GameItemFactoryImpl.getInstance();

  @Test
  public void testEquals() {
    final City city1 = FACTORY.createCity("Zuerich", new Point(1, 1));
    final City city2 = FACTORY.createCity("Zuerich", new Point(2, 1));
    Assert.assertEquals("Expected cities to be equal", city1.equals(city2), true);
  }

  @Test
  public void testGetConnections() {
    final City city1 = FACTORY.createCity("City 1", new Point(1, 1));
    final City city2 = FACTORY.createCity("City 2", new Point(2, 1));
    final Connection connection1 = FACTORY.createConnection(city1, city2, ConnectionType.CAR);
    final Connection connection2 = FACTORY.createConnection(city1, city2, ConnectionType.TRAIN);
    assertThat(city1.getConnections()).containsExactly(connection1, connection2);
  }

  @Test
  public void testGetName() {
    final String cityName = "City 1";
    final City city = FACTORY.createCity(cityName, new Point(1, 1));
    assertThat(city.getName()).isEqualTo(cityName);
  }
}
