package com.example.sampramudana.igngames.Network;

import com.example.sampramudana.igngames.Model.ResponseIGN;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("top-headlines?sources=ign&apiKey=0a3624cc60104378b8ac6bb15d4dcd78")
    Call<ResponseIGN> readNewsApi();

}
