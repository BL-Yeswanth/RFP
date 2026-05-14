import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    // TC 1.1
    @Test
    public void givenSadMood_ShouldReturnSAD()
            throws MoodAnalyserException {

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
    public void givenHappyMood_ShouldReturnHAPPY()
            throws MoodAnalyserException {

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

    // UC3 Null Test
    @Test
    public void givenNullMood_ShouldThrowException() {

        try {

            MoodAnalyser moodAnalyser =
                    new MoodAnalyser(null);

            moodAnalyser.analyseMood();

        } catch (MoodAnalyserException e) {

            Assert.assertEquals(
                    MoodAnalyserException.ExceptionType.ENTERED_NULL,
                    e.type
            );
        }
    }

    // UC3 Empty Test
    @Test
    public void givenEmptyMood_ShouldThrowException() {

        try {

            MoodAnalyser moodAnalyser =
                    new MoodAnalyser("");

            moodAnalyser.analyseMood();

        } catch (MoodAnalyserException e) {

            Assert.assertEquals(
                    MoodAnalyserException.ExceptionType.ENTERED_EMPTY,
                    e.type
            );
        }
    }
}