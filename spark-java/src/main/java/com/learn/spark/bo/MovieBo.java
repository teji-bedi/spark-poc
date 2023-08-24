package com.learn.spark.bo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieBo {
    private Integer movieId;
    private String title;
    private String genres;
}
