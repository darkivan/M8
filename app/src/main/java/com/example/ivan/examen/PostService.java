package com.example.ivan.examen;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {

    String API_ROUTE = "https://jdarestaurantapi.firebaseio.com/menu.json";

    @GET(API_ROUTE)
    Call< List<Post> > getPost();

}
