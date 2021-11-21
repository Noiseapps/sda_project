package pl.noiseapps.sample.githubapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Issue {

    private int number;
    private String state;
    private String title;
    private String body;
    private User user;

}
