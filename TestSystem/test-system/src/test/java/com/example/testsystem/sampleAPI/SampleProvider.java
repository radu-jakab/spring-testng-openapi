package com.example.testsystem.sampleAPI;

import io.swagger.client.model.SampleRequestDTO;
import io.swagger.client.model.SubDTO;
import org.springframework.stereotype.Component;

import java.util.UUID;

public class SampleProvider {

    public static SampleRequestDTO buildSampleRequestDTO() {
        SampleRequestDTO result = new SampleRequestDTO();
        result.setId(UUID.randomUUID().toString());
        result.setSomeNumber(4.3);

        SubDTO subDTO = new SubDTO();
        subDTO.setId(UUID.randomUUID().toString());
        subDTO.setName("Sub name");
        subDTO.setThing("Sub thing");
        result.setSubObject(subDTO);

        return result;
    }
}
