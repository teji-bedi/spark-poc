package com.learn.spark.bo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TagBo {
    private Integer userId;
    private Integer movieId;
    private String tag;
    private Integer timestamp;
}
