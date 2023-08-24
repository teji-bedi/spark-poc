package com.learn.spark.bo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GenomeTagBo {
    private Integer tagId;
    private String tag;
}
