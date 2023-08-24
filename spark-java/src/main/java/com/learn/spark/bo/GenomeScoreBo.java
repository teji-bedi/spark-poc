package com.learn.spark.bo;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class GenomeScoreBo {
    private Integer movieId;
    private Integer tagId;
    private BigDecimal relevance;
}
