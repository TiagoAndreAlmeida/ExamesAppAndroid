package com.example.tiago.exames;

import android.content.Context;
import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by tiago on 25/04/18.
 */

public class HttpService extends AsyncTask<Void, Void, Exame> {

    private final String idExame;
    private StringBuilder responser;

    private Context context;

    public HttpService( String idExame, Context context){
        this.context = context;
        this.idExame = idExame;
    }

    @Override
    protected Exame doInBackground(Void... voids) {
        responser = new StringBuilder();
        if( this.idExame != null){
            try {
                URL url = new URL("http://192.168.1.4:3000/"+this.idExame);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Content-type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                connection.setDoOutput(true);
                connection.setConnectTimeout(5000);
                connection.connect();

                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    responser.append(scanner.nextLine());
                }
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        //NOME DAS PROPRIEDADES PRECISA SER EXATAMENTE IGUAL AS DO JSON RECEBIDOS
        return new Gson().fromJson(responser.toString(), Exame.class);
    }
}
