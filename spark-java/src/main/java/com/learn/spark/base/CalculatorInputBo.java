package com.learn.spark.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import scala.Serializable;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorInputBo<T> implements Serializable {

    private Class<T> bean;
    private Dataset<T> inputData = SparkSessionProvider.spark.emptyDataset(Encoders.bean(bean));
    private String path;
    private List<String> partitionedColumns;
    
}
