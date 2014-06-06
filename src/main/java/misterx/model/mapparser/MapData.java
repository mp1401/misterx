package misterx.model.mapparser;

import java.util.List;

import misterx.model.gameitems.City;
import misterx.model.gameitems.Connection;


public class MapData {
	
	public List<City> cities;
	public List<Connection> connections;

	public MapData() {
	}
	
	public MapData(List<City> cities, List<Connection> connections) {
		this.cities = cities;
		this.connections = connections;
	}
}
