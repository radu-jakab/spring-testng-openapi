package com.example.targetsystem.sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @PostMapping("sample")
    public ResponseEntity<SampleResponseDTO> testThisMethod(@RequestBody SampleRequestDTO request) {
        SampleResponseDTO responseDTO = new SampleResponseDTO();
        responseDTO.setId(request.getId());
        responseDTO.setPayload(request.getSubObject().getThing());

        return ResponseEntity.ok(responseDTO);
    }
}
