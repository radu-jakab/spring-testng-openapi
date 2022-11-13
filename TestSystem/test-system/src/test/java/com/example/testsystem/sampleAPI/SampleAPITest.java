package com.example.testsystem.sampleAPI;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import io.swagger.client.api.SampleControllerApi;
import io.swagger.client.model.SampleRequestDTO;
import io.swagger.client.model.SampleResponseDTO;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Objects;

public class SampleAPITest {
    private SampleControllerApi sampleControllerApi;

    @BeforeClass
    public void init() {
        sampleControllerApi = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(SampleControllerApi.class, "http://localhost:8080");
    }

    @Test
    public void givenSampleRequest_whenAPICalled_thenResponseOK() {
        SampleRequestDTO request = SampleProvider.buildSampleRequestDTO();

        SampleResponseDTO response = sampleControllerApi.testThisMethod(request);

        assert Objects.equals(response.getId(), request.getId());
    }
}
