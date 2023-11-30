package com.green.growgreen.plant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class PlantInsDto {
    @JsonIgnore
    private int iplant;
    private int iuser;
    private String nicknm;
    private String pic;
    private String comment;
}
