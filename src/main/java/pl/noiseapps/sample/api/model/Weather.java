package pl.noiseapps.sample.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;


/**
 * Główna klasa odpowiedzi serwera - "root" hierarchii.
 * Zawiera pola, które są potrzebne w aplikacji. Możemy pominąć te, których nie potrzebujemy.
 *
 * Dla rozbudowanych obiektów JSON tworzymy osobne klasy/modele, np. {@link Main}
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Weather {

    Main main;
    int id;
    String name;
    // SerializedName pozwala zmienić mapowanie pola
    // (z weather w odpowiedzi JSON, na details używane w kodzie aplikacji)
    @SerializedName("weather")
    List<WeatherDetails> details;
    SystemInfo sys;
}
