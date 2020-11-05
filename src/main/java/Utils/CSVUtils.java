package Utils;

import Models.Produce;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtils {
    private static final char DEFAULT_SEPARATOR = ',';

    public CSVUtils() throws IOException {
    }

    public static void writeLine(Writer w, List<String> values) throws IOException {
        boolean first = true;
        StringBuilder sb = new StringBuilder();

        for (String value : values) {
            if (!first) {
                sb.append(DEFAULT_SEPARATOR);
            }
            sb.append(value);
            first = false;
        }
        sb.append("\n");

        w.append(sb.toString());


        String csvFile = "/Users/tom/Dev/try.csv";
        FileWriter writer = new FileWriter(csvFile); //(1)

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(count))));  // (2)

        for (Produce obj : inventory) {
            List<String> list = new ArrayList<>(); // (3)
            list.add(String.valueOf(obj.getIdNum()));
            list.add(obj.getType());
            list.add(String.valueOf(obj.getQuantity()));


            CSVUtils.writeLine(writer, list);  // (4)
        }

// (5)
        writer.flush();
        writer.close();

    }
}
