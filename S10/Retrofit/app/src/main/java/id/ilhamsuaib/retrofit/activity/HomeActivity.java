package id.ilhamsuaib.retrofit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import id.ilhamsuaib.retrofit.BaseApp;
import id.ilhamsuaib.retrofit.R;
import id.ilhamsuaib.retrofit.model.ArtikelResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getArticle();
    }

    private void getArticle() {
        BaseApp.service.getArtikel().enqueue(new Callback<ArtikelResponse>() {
            @Override
            public void onResponse(Call<ArtikelResponse> call, Response<ArtikelResponse> response) {
                Log.d(TAG, "onResponse: "+new Gson().toJsonTree(response));
            }

            @Override
            public void onFailure(Call<ArtikelResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: "+t.getMessage());
                t.printStackTrace();
            }
        });
    }
}
