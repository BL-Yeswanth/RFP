import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.Iterator;

public class StateCensusAnalyser {

    public int loadStateCensusData(
            String csvFilePath)
            throws StateCensusAnalyserException {

        try {

            FileReader reader =
                    new FileReader(csvFilePath);

            CsvToBean<CSVStateCensus> csvToBean =
                    new CsvToBeanBuilder<CSVStateCensus>(
                            reader)
                            .withType(
                                    CSVStateCensus.class
                            )
                            .build();

            Iterator<CSVStateCensus> iterator =
                    csvToBean.iterator();

            int count = 0;

            while (iterator.hasNext()) {

                iterator.next();
                count++;
            }

            return count;

        } catch (Exception e) {

            throw new StateCensusAnalyserException(
                    "CSV File Not Found",
                    StateCensusAnalyserException
                            .ExceptionType
                            .FILE_NOT_FOUND
            );
        }
    }
}