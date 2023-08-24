package com.learn.spark.bo;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class RatingBo {
    private Integer userId;
    private Integer movieId;
    private BigDecimal rating;
    private String timestamp;
}
