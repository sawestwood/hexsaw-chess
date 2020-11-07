package uk.org.hexsaw.chess;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameTest {

    @Test
    public void canInstantiateGame() {
        Game game = Game.getInstance();
        assertNotNull(game);
    }

    @Test
    public void gameIsASingleton() {
        Game gameA = Game.getInstance();
        Game gameB = Game.getInstance();
        assertEquals(gameA, gameB);
    }
}
