package misterx.model.gameitems;

import java.io.Serializable;

import misterx.model.game.Game;
import misterx.model.observers.GameItemObservable;


public interface GameItem extends Serializable, GameItemObservable {

	public Game getGame();
	
	public void printMessage(String message);
}
