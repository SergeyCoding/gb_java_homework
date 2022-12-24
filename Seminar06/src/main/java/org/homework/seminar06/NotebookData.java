package org.homework.seminar06;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NotebookData {

    private final String fileName;

    public NotebookData(String fileName) {
        this.fileName = fileName;
    }

    public List<Notebook> loadNotebooks() {

        var p = System.getProperty("user.dir");

        Path filePath = Paths.get(p, fileName);
        Charset charset = StandardCharsets.UTF_8;

        List<Notebook> result = new LinkedList<>();

        try {
            String[] data = Files.lines(filePath, charset).toArray(String[]::new);

            int k = 0;

            while (k < data.length) {
                Notebook nb = new Notebook(getNotebookName(data[k]));

                var features = getFeatures(data[k + 1].split("\\|"));

                nb.setOs(features.get("Процессор"));
                nb.setRam(features.get("Оперативная память"));
                result.add(nb);

                k = k + 3;
            }

        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }

        return result;
    }

    private Map<String, String> getFeatures(String[] features) {

        HashMap<String, String> result = new HashMap<>();

        for (var f : features) {
            String[] ff = f.split(":");
            if (ff.length == 2) {
                result.put(ff[0].trim(), ff[1].trim());
            }
        }

        return result;
    }

    private static String getNotebookName(String data) {
        return data.split("\\.")[1].split("\\(")[0].trim();
    }
}
