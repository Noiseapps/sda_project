package pl.noiseapps.sample.service;

import org.junit.jupiter.api.Test;
import pl.noiseapps.sample.repository.SampleRepository;

import static org.mockito.Mockito.*;

class LoaderServiceTest {


    @Test
    void testRepositoryMethodIsCalled() {
        SampleRepository mockRepo = mock(SampleRepository.class);
//        doThrow(new NullPointerException()).when(mockRepo).save(any());

        String sampleValue = "Hello world!";
        LoaderService service = new LoaderService(mockRepo);

        service.saveSampleData(sampleValue);

        verify(mockRepo).save(argThat(argument -> argument.getValue().equals(sampleValue)));
    }

}