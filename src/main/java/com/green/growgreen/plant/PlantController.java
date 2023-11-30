package com.green.growgreen.plant;


import com.green.growgreen.ResVo;
import com.green.growgreen.plant.model.PlantInsDto;
import com.green.growgreen.plant.model.PlantSelDto;
import com.green.growgreen.plant.model.PlantSelVo;
import com.green.growgreen.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 식물에 언제 물을 주고 하는지 일정관리 입니다.
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/plant")
public class PlantController {
    private final PlantService service;
    @PostMapping
    public ResVo postPlant(@RequestBody PlantInsDto dto){
        return service.insPlant(dto);
    }
    @GetMapping
    public List<PlantSelVo> getPlantAll(PlantSelDto dto){
        return service.getPlantAll(dto);
    }

}
