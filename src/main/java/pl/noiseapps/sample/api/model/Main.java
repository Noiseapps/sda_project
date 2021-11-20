package pl.noiseapps.sample.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Main {

    public double temp;
    @SerializedName("feels_like")
    public double feelsLike;
    public double humidity;
}
