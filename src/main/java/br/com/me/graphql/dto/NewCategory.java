package br.com.me.graphql.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewCategory {
    private String name;
    private String description;
}
