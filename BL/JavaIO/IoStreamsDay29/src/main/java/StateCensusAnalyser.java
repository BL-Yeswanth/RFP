import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.Iterator;

public class StateCensusAnalyser {

    public int loadStateCensusData(
            String csvFilePath) {

        try {

            FileReader reader =
                    new FileReader(csvFilePath);

            CsvToBean<CSVStateCensus> csvToBean =
                    new CsvToBeanBuilder<CSVStateCensus>(
                            reader)
                            .withType(
                                    CSVStateCensus.class
                            )
                            .withIgnoreLeadingWhiteSpace(
                                    true
                            )
                            .build();

            Iterator<CSVStateCensus> iterator =
                    csvToBean.iterator();

            int recordCount = 0;

            while (iterator.hasNext()) {

                iterator.next();
                recordCount++;
            }

            return recordCount;

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );

            return 0;
        }
    }
}