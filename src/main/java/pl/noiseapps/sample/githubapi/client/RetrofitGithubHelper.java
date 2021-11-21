package pl.noiseapps.sample.githubapi.client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitGithubHelper {

    // TODO zmieńcie token GH na swój :)
    public static final String GITHUB_TOKEN="<your_token_here>";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static GithubIssueApi createApi() {
        return retrofit.create(GithubIssueApi.class);
    }
    public static GithubRepoApi createRepoApi() {
        return retrofit.create(GithubRepoApi.class);
    }
}
