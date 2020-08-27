package main;

import agenda.Agenda;
import http.Http;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final String HTTPS_URL = "https://ics.multieditoras.com.br/ics/agenda/1/2017/12?chave=TFACSJ48BRYHHRWJD9UZ&parceiro=IQs27SAP&compacto=0&formato=json";

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, JSONException {

        JSONObject object = retornaJson(HTTPS_URL);
        JSONArray arrayAgenda = (JSONArray) object.get("agenda");
        List<Agenda> agenda = new ArrayList<Agenda>();

        for (int i=0; i < arrayAgenda.length(); i++) {
            JSONObject f = arrayAgenda.getJSONObject(i);
            Agenda auxAgenda = new Agenda();
            auxAgenda.setId(f.getInt("@id"));
            auxAgenda.setNome(f.getString("nome"));
            auxAgenda.setHash(f.getString("@hash"));
            auxAgenda.setEsfera(f.getString("esfera"));
            agenda.add(auxAgenda);
        }

        System.out.println(agenda);
    }

    private static JSONObject retornaJson(String url) throws IOException, JSONException {
        Http http = new Http();
        String retornoJson = http.chamaUrl(url);
        JSONObject objetoJson = new JSONObject(retornoJson);
        return objetoJson;
    }
}
