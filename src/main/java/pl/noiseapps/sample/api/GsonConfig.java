package pl.noiseapps.sample.api;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GsonConfig {

    /**
     * Tworzymy własną konfigurację Gson (konwerter JSON<>Java)
     * @return
     */
    public static Gson buildCustomGson() {
        SunSerializer customAdapter = new SunSerializer();
        return new GsonBuilder()
                .registerTypeAdapter(ZonedDateTime.class, customAdapter)
                .create();
    }


    /**
        Własny adapter do (de)serializacji obiektu typu DateTime z/do wartości Long (UNIX timestamp)
     */
    private static class SunSerializer implements JsonSerializer<ZonedDateTime>,
            JsonDeserializer<ZonedDateTime> {

        @Override
        public JsonElement serialize(ZonedDateTime localDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
            // zwracamy long
            return new JsonPrimitive(localDateTime.toInstant().getEpochSecond());
        }

        @Override
        public ZonedDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            long unixTs = jsonElement.getAsLong();
            return ZonedDateTime.ofInstant(Instant.ofEpochSecond(unixTs), ZoneId.systemDefault());
        }
    }


}
