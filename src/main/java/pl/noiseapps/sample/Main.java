package pl.noiseapps.sample;

import org.apache.commons.cli.*;
import pl.noiseapps.sample.api.RetrofitConfig;
import pl.noiseapps.sample.api.model.Weather;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {

        Call<Weather> call = RetrofitConfig.getApi().getWeatherDataById("3093133", "metric", RetrofitConfig.API_KEY);
        Response<Weather> execute = call.execute();
        System.out.println(execute.body());


//        System.out.println("Hi");
//
//        Options cliOptions = new CliConfig().createCliOptions();
//        CommandLineParser parser = new DefaultParser();
//        CommandLine commandLine = parser.parse(cliOptions, args);
//
//        if (commandLine.hasOption('h')) {
//            HelpFormatter formatter = new HelpFormatter();
//            formatter.printHelp("ant", cliOptions);
//        }
//        if (commandLine.hasOption('t')) {
//            String value = commandLine.getOptionValue('t');
//            System.out.println(value);
//        }

    }
}
