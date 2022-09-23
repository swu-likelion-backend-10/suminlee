package hello.hellospring.post.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length=100, nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Column(length = 100, nullable = false)
    private String department;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String introduction;

    @Builder
    public Board(Long id, String name, Integer age, String department, String introduction){
    this.id=id;
    this.name = name;
    this.age = age;
    this.department = department;
    this.introduction = introduction;
    }

}