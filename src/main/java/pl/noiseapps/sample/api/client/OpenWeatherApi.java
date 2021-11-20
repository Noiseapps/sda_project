package pl.noiseapps.sample.api.client;

import pl.noiseapps.sample.api.model.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

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
