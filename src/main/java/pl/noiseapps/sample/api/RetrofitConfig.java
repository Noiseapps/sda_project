package pl.noiseapps.sample.api;

import pl.noiseapps.sample.api.client.OpenWeatherApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static pl.noiseapps.sample.api.GsonConfig.buildCustomGson;

public class RetrofitConfig {

    // podstawowy adres URL, od którego zaczynają się wszystkie pozostałe metody
    public static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    public static final String API_KEY = "<your_token_here>";


    public static OpenWeatherApi getApi() {
        /*
        tworzymy 'base-object' dla Retrofita, który potem możemy reużywać do obsługi wielu API
        współdzielących konfigurację (BASE_URL, autoryzacja, przetwarzanie nagłówków itp)
         */
        Retrofit build = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(buildCustomGson()))
                .build();
        // tworzymy 'implementację' interfejsu opisującego API
        return build
                .create(OpenWeatherApi.class);
    }

}
