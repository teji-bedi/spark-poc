package com.learn.spark.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RatingBo {
    private Integer userId;
    private Integer movieId;
    private Double rating;
    private Integer timestamp;
}
