package com.example.kavya.rottentomatoes.Network;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by Kavya on 9/13/14.
 */
public class RottenTomatoesClient {
    private final String API_KEY = "tsncdr3mmjhmx2gpgc9khruj";
    private final String API_BASE_URL = "http://api.rottentomatoes.com/api/public/v1.0/";
    private AsyncHttpClient client;

    public RottenTomatoesClient() {

        this.client = new AsyncHttpClient();
    }

    private String getApiUrl(String relativeUrl) {

        return API_BASE_URL + relativeUrl;
    }

    public void getBoxOfficeMovies(JsonHttpResponseHandler handler) {
        String url = getApiUrl("lists/movies/box_office.json");
        RequestParams params = new RequestParams("apikey", API_KEY);
        client.get(url, params, handler);
    }
}
