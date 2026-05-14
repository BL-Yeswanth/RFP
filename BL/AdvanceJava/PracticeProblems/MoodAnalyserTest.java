import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    // Test Case for Sad Mood
    @Test
    public void givenSadMessage_ShouldReturnSadMood() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser();

        String mood =
                moodAnalyser.analyseMood(
                        "I am in Sad Mood"
                );

        Assert.assertEquals(
                "Sad Mood",
                mood
        );
    }

    // Test Case for Happy Mood
    @Test
    public void givenHappyMessage_ShouldReturnHappyMood() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser();

        String mood =
                moodAnalyser.analyseMood(
                        "I am in Any Mood"
                );

        Assert.assertEquals(
                "Happy Mood",
                mood
        );
    }
}