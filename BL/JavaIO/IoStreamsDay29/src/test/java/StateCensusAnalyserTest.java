import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {

    @Test
    public void givenCSVFileWithWrongDelimiter_WhenLoaded_ShouldThrowException() {

        StateCensusAnalyser analyser =
                new StateCensusAnalyser();

        try {

            analyser.loadStateCensusData(
                    "src/main/resources/IndiaStateCensusWrongDelimiter.csv"
            );

        } catch (StateCensusAnalyserException e) {

            Assert.assertEquals(
                    StateCensusAnalyserException.ExceptionType.INVALID_DELIMITER,
                    e.type
            );
        }
    }
}