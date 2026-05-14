import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    // TC 1.1
    @Test
    public void givenSadMoodMessage_ShouldReturnSAD() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser(
                        "I am in Sad Mood"
                );

        String mood =
                moodAnalyser.analyseMood();

        Assert.assertEquals(
                "SAD",
                mood
        );
    }

    // TC 1.2
    @Test
    public void givenHappyMoodMessage_ShouldReturnHAPPY() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser(
                        "I am in Happy Mood"
                );

        String mood =
                moodAnalyser.analyseMood();

        Assert.assertEquals(
                "HAPPY",
                mood
        );
    }

    // TC 2.1
    @Test
    public void givenNullMood_ShouldReturnHAPPY() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser(null);

        String mood =
                moodAnalyser.analyseMood();

        Assert.assertEquals(
                "HAPPY",
                mood
        );
    }
}