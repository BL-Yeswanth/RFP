import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {

    @Test
    public void givenWrongFileType_WhenLoaded_ShouldThrowException() {

        StateCensusAnalyser analyser =
                new StateCensusAnalyser();

        try {

            analyser.loadStateCensusData(
                    "src/main/resources/IndiaStateCensusData.txt"
            );

        } catch (
                StateCensusAnalyserException e) {

            Assert.assertEquals(
                    StateCensusAnalyserException
                            .ExceptionType
                            .INVALID_FILE_TYPE,
                    e.type
            );
        }
    }
}