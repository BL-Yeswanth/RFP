import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {

    @Test
    public void givenStateCensusCSVFile_WhenLoaded_ShouldReturnRecordCount() {

        StateCensusAnalyser analyser =
                new StateCensusAnalyser();

        int numberOfRecords =
                analyser.loadStateCensusData(
                        "src/main/resources/IndiaStateCensusData.csv"
                );

        Assert.assertEquals(
                29,
                numberOfRecords
        );
    }
}