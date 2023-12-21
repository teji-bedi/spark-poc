package com.learn.spark.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TagBo {
    private Integer userId;
    private Integer movieId;
    private String tag;
    private String timestamp;
}
