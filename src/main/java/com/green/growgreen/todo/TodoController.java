package com.green.growgreen.todo;



import com.green.growgreen.ResVo;
import com.green.growgreen.todo.model.TodoInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todo")
public class TodoController {
    private final TodoService service;

    @PostMapping
    public ResVo postTodo(@RequestBody TodoInsDto dto){
        return service.postTodo(dto);
    }

}
