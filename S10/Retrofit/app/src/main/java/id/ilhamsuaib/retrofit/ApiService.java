package id.ilhamsuaib.retrofit;

import id.ilhamsuaib.retrofit.model.ArtikelResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("v2/top-headlines?country=id&category=business&apiKey=0c61d96064dd45638f943c609e25b485")
    Call<ArtikelResponse> getArtikel();
}
