package com.learn.spark.bo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LinkBo {
    private Integer movieId;
    private Integer imdbId;
    private Integer tmdbId;
}
