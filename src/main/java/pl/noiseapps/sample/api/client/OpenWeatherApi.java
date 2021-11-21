package pl.noiseapps.sample.api.client;

import pl.noiseapps.sample.api.model.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Interfejs opisujący strukturę API usługi zewnętrznej - metody wraz z ich typem (GET, POST...),
 * Parametry ścieżki {@link retrofit2.http.Path}, Parametry zapytania {@link Query},
 * nagłówki HTTP {@link retrofit2.http.Header}, czy zawartość requestu {@link retrofit2.http.Body}
 * <p>
 * Każdy "endpoint" API to osobna metoda w interfejsie.
 */
public interface OpenWeatherApi {

    @GET("weather")
    Call<Weather> getWeatherDataByName(@Query("q") String city,
                                       @Query("units") String units,
                                       @Query("appid") String apiKey);

    @GET("weather")
    Call<Weather> getWeatherDataById(@Query("id") String city,
                                     @Query("units") String units,
                                     @Query("appid") String apiKey);

}
