package pl.noiseapps.sample.service;

import pl.noiseapps.sample.model.SampleModel;
import pl.noiseapps.sample.repository.SampleRepository;

import java.util.UUID;

public class LoaderService {

    private final SampleRepository repository;

    public LoaderService(SampleRepository repository) {
        this.repository = repository;
    }

    public void saveSampleData(String value) {
        SampleModel model = new SampleModel(UUID.randomUUID(), value);

        repository.save(model);
    }
}
