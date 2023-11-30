package com.green.growgreen.todo;

import com.green.growgreen.ResVo;
import com.green.growgreen.todo.model.TodoInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
@Slf4j
public class TodoService {
    private final TodoMapper mapper;
    public ResVo postTodo(TodoInsDto dto){
        int affectedRows = mapper.insTodo(dto);
        return new ResVo(dto.getItodo());
    }

}
