package pl.noiseapps.sample.githubapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreateIssueRequest {
    private String title;
    private String body;
}
