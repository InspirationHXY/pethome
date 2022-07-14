package com.yingyi.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基本的分页查询条件
 */
@Data
public class BaseQuery {
    private Integer currentPage = 1;
    private Integer pageSize = 5;

    //limit的第一个参数值
    public Integer getBegin(){
        return (this.currentPage - 1) * this.pageSize;
    }
}
