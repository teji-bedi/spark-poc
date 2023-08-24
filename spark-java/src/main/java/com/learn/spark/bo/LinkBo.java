package com.learn.spark.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LinkBo {
    private Integer movieId;
    private Integer imdbId;
    private Integer tmdbId;
}
