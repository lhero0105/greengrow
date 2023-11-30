package com.green.growgreen.plant;


import com.green.growgreen.ResVo;
import com.green.growgreen.plant.model.PlantInsDto;
import com.green.growgreen.plant.model.PlantSelDto;
import com.green.growgreen.plant.model.PlantSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlantMapper {
    int insPlant(PlantInsDto dto);
    List<PlantSelVo> selPlantAll(PlantSelDto dto);
}
