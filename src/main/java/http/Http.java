package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Http {
    public String chamaUrl(String url) throws IOException {
        URL auxUrl = new URL(url);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(auxUrl.openStream()));

        String retornoJson;

        StringBuilder builder = new StringBuilder();
        while ((retornoJson = bufferedReader.readLine()) != null) {
            builder.append(retornoJson);
        }

        bufferedReader.close();
        return builder.toString();
    }
}
