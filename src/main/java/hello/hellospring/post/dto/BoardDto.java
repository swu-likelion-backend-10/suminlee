package hello.hellospring.post.dto;

import hello.hellospring.post.domain.Board;
import lombok.Builder;

import java.time.LocalDateTime;

public class BoardDto {

    private Long id;
    private String name;
    private Integer age;
    private String department;
    private String introduction;

    private LocalDateTime createdTime;
    private LocalDateTime modifiedTime;

    public Board toEntity(){
        Board build = Board.builder()
                .id(id)
                .name(name)
                .age(age)
                .department(department)
                .introduction(introduction)
                .build();
        return build;
    }

    @Builder
    public BoardDto(Long id, String name, Integer age, String department,String introduction, LocalDateTime createdTime, LocalDateTime modifiedTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department=department;
        this.introduction=introduction;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
    }
}
