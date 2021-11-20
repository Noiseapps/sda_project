package pl.noiseapps.sample.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDetails {

    public String id;
    public String main;
    public String description;
    public String icon;
}
