package com.devitis.retrofittest_080419.data.model.remote;

import com.devitis.retrofittest_080419.data.model.service.APIService;

/**
 * Created by Diana on 08.04.2019.
 */

public class ApiUtils {

    private ApiUtils() {
    }

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
