package com.learn.spark.bo;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieBo {
    private Integer movieId;
    private String title;
    private String genres;
}
