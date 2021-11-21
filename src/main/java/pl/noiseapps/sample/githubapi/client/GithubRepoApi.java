package pl.noiseapps.sample.githubapi.client;

import pl.noiseapps.sample.githubapi.model.CreateIssueRequest;
import pl.noiseapps.sample.githubapi.model.Issue;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface GithubRepoApi {

    @GET("/repos/{owner}/{repo}/issues")
    Call<List<Issue>> getRepoIssues(@Path("owner") String owner,
                                    @Path("repo") String repositoryName,
                                    @Header("Authorization") String authToken);

    @POST("/repos/{owner}/{repo}/issues")
    Call<Void> createRepoIssue(@Path("owner") String owner,
                                    @Path("repo") String repositoryName,
                                    @Body CreateIssueRequest request,
                                    @Header("Authorization") String authToken);
}
