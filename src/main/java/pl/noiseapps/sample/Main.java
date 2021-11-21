package pl.noiseapps.sample;

import org.apache.commons.cli.ParseException;
import pl.noiseapps.sample.api.RetrofitConfig;
import pl.noiseapps.sample.api.client.OpenWeatherApi;
import pl.noiseapps.sample.api.model.Weather;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {

//        String token = "Bearer " + RetrofitGithubHelper.GITHUB_TOKEN;
//        GithubIssueApi api = RetrofitGithubHelper.createApi();
//
//        CreateIssueRequest request = new CreateIssueRequest(UUID.randomUUID().toString(), null);
//        String json = new Gson().toJson(request);
//        Call<Void> createIssue = api.createRepoIssue("Noiseapps", "sda_project", request, token);
//        Response<Void> response = createIssue.response();
//        System.out.println(response.isSuccessful());
//
//        Call<List<Issue>> repoCall = api.getRepoIssues("Noiseapps", "sda_project", token);
//        Response<List<Issue>> response = repoCall.response();
//        List<Issue> body = response.body();
//        System.out.println(body);


//
        // pobieramy utworzoną implementację interfejsu API
        OpenWeatherApi api = RetrofitConfig.getApi();

        // przygotowujemy zapytanie, podając metodę oraz potrzebne parametry (w tym przypadku ID miejsca, jednostkę oraz klucz API)
        Call<Weather> call = api.getWeatherDataById("3093133", "metric", RetrofitConfig.API_KEY);

        // wykonujemy zapytanie
        Response<Weather> response = call.execute();

        // jeśli zapytanie jest udane (czyli HTTP status code to 2xx)
        if (response.isSuccessful()) {
            // pobieramy obiekt modelu danych z odpowiedzi
            Weather body = response.body();
            // wyświetlamy otrzymany obiekt odpowiedzi
            System.out.println(body);
        } else {
            // wyświetlamy informacje o błędzie
            System.err.println(String.format("Failed to read weather data %s", response.errorBody().string()));
        }

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
