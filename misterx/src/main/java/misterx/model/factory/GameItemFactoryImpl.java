package misterx.model.factory;

import java.awt.Point;

import misterx.model.gameitems.Character;
import misterx.model.gameitems.City;
import misterx.model.gameitems.Connection;
import misterx.model.gameitems.Detective;
import misterx.model.gameitems.Map;
import misterx.model.gameitems.MisterX;
import misterx.model.gameitems.decorators.CachedCity;
import misterx.model.gameitems.enums.ConnectionType;
import misterx.model.gameitems.enums.DetectiveType;
import misterx.model.gameitems.impl.CityImpl;
import misterx.model.gameitems.impl.ConnectionImpl;
import misterx.model.gameitems.impl.DetectiveImpl;
import misterx.model.gameitems.impl.MapImpl;
import misterx.model.gameitems.impl.MisterXImpl;
import misterx.model.gameitems.impl.UnknownCharacterImpl;
import misterx.model.gameitems.impl.UnknownCityImpl;


public class GameItemFactoryImpl implements GameItemFactory {
	
	private static GameItemFactory instance;
	
	private GameItemFactoryImpl() {
	}
	
	public static GameItemFactory getInstance() {
		if(instance == null) {
			instance = new GameItemFactoryImpl();
		}
		return instance;
	}

	@Override
	public Map createMap() {
		return new MapImpl();
	}

	@Override
	public City createCity(String name, Point position) {
		return new CachedCity(new CityImpl(name, position));
	}

	@Override
	public City createUnknownCity() {
		return new UnknownCityImpl();
	}

	@Override
	public Connection createConnection(City cityA, City cityB, ConnectionType type) {
		return new ConnectionImpl(cityA, cityB, type);
	}

	@Override
	public MisterX createMisterX() {
		return new MisterXImpl();
	}

	@Override
	public Detective createDetective(DetectiveType type) {
		return new DetectiveImpl(type);
	}

	@Override
	public Character createUnknownCharacter() {
		return new UnknownCharacterImpl();
	}

}
