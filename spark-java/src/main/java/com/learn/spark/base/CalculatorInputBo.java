package com.learn.spark.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorInputBo<T>{

    private Class<T> bean;
    private Dataset<T> inputData = JavaSparkSessionProvider.spark.emptyDataset(Encoders.bean(bean));
    private String path;
    private List<String> partitionedColumns;
    
}
