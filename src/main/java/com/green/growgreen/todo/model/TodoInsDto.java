package com.green.growgreen.todo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class TodoInsDto {
    @JsonIgnore
    private int itodo; // 인서트 시 itodo가 필요하기에
    private int iuser;
    private int iplant;
    private String contents;
    private String deadlineDay;
    private String deadlineTime;
    // private String finishedAt; 끝나는 날짜로 끝날 때 입력됩니다.
    // 문자열로하면 속도가 느려서 0과 1로 분기하기에 yn_ 을 사용합니다.
}
