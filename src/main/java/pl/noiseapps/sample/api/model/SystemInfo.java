package pl.noiseapps.sample.api.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SystemInfo {

    String country;
    ZonedDateTime sunrise;
    ZonedDateTime sunset;
}
