package misterx.model.factory;

import java.awt.Point;

import misterx.model.gameitems.Character;
import misterx.model.gameitems.City;
import misterx.model.gameitems.Connection;
import misterx.model.gameitems.Detective;
import misterx.model.gameitems.Map;
import misterx.model.gameitems.MisterX;
import misterx.model.gameitems.enums.ConnectionType;
import misterx.model.gameitems.enums.DetectiveType;


public interface GameItemFactory {
	
	public Map createMap();
	
	public City createCity(String name, Point position);
	
	public City createUnknownCity();

	public Connection createConnection(City cityA, City cityB, ConnectionType type);

	public MisterX createMisterX();

	public Detective createDetective(DetectiveType type);
	
	public Character createUnknownCharacter();

}
