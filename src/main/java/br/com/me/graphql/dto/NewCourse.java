package br.com.me.graphql.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewCourse {
    private String name;
    private String description;

    private Long categoryId;
}
