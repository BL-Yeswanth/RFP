import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadMoodMessage_ShouldReturnSAD() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser();

        String mood =
                moodAnalyser.analyseMood();

        Assert.assertEquals(
                "SAD",
                mood
        );
    }
}