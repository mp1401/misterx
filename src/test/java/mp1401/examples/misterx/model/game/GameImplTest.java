package mp1401.examples.misterx.model.game;

import static org.fest.assertions.Assertions.assertThat;
import mp1401.examples.misterx.demo.util.DemoMapDataParser;
import mp1401.examples.misterx.model.factory.GameItemFactory;
import mp1401.examples.misterx.model.factory.GameItemFactoryImpl;
import mp1401.examples.misterx.model.game.states.SetStartPositionsGameState;
import mp1401.examples.misterx.model.game.states.StartGameState;
import mp1401.examples.misterx.model.gameitems.Detective;
import mp1401.examples.misterx.model.gameitems.MisterX;
import mp1401.examples.misterx.model.gameitems.enums.DetectiveType;

import org.junit.BeforeClass;
import org.junit.Test;

public class GameImplTest {

  private static final GameItemFactory FACTORY = GameItemFactoryImpl.getInstance();
  private static final MisterX MISTER_X = FACTORY.createMisterX();
  private static final Detective DETECTIVE_BLUE = FACTORY.createDetective(DetectiveType.BLUE);
  private static final Detective DETECTIVE_GREEN = FACTORY.createDetective(DetectiveType.GREEN);

  private static Game game;

  @BeforeClass
  public static void setup() {
    game = GameImpl.getInstance();
    game.init();
    game.fillMap(new DemoMapDataParser());
    game.addMisterX(MISTER_X);
    game.addDetective(DETECTIVE_BLUE);
    game.addDetective(DETECTIVE_GREEN);
  }

  @Test
  public void testInitGame() {
    game.init();
    assertThat(game.getCurrentGameState().getClass()).isEqualTo(StartGameState.class);
  }

  @Test
  public void testStartGame() {
    game.startGame();
    assertThat(game.getCurrentGameState().getClass()).isEqualTo(SetStartPositionsGameState.class);
  }
}
