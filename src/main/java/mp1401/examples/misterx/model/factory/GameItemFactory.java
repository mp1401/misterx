package mp1401.examples.misterx.model.factory;

import java.awt.Point;

import mp1401.examples.misterx.model.gameitems.Character;
import mp1401.examples.misterx.model.gameitems.City;
import mp1401.examples.misterx.model.gameitems.Connection;
import mp1401.examples.misterx.model.gameitems.Detective;
import mp1401.examples.misterx.model.gameitems.Map;
import mp1401.examples.misterx.model.gameitems.MisterX;
import mp1401.examples.misterx.model.gameitems.enums.ConnectionType;
import mp1401.examples.misterx.model.gameitems.enums.DetectiveType;

public interface GameItemFactory {

  Map createMap();

  City createCity(String name, Point position);

  City createUnknownCity();

  Connection createConnection(City cityA, City cityB, ConnectionType type);

  MisterX createMisterX();

  Detective createDetective(DetectiveType type);

  Character createUnknownCharacter();

}
