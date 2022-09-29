package bowlinggame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import carehome.bowling.Game;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author piksel
 */
@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @InjectMocks
    private Game game;

    @Test
    public void canScoreGutterGame() {
        roll(20, 0);
        int score = game.getScore();
        assertThat(score, is(0));
    }

    @Test
    public void canScoreGameOfOnes() {
        roll(20, 1);
        int score = game.getScore();
        assertThat(score, is(20));
    }

    @Test
    public void canScoreSpareFollowedByThree(){
        game.roll(5);
        game.roll(5);
        game.roll(3);
        roll(17, 0);
        int score = game.getScore();
        assertThat(score, is(16));

    }

    private void roll(int rolls, int pinsDown) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pinsDown);
        }
    }


}