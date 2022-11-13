package com.example.targetsystem.sample;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class SampleRequestDTO {
    private String id;
    private Double someNumber;
    private ZonedDateTime someDateTime;
    private SubDTO subObject;
}
