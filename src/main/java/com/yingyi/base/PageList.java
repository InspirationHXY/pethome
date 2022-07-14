package com.yingyi.base;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 前端分页展示的查询结果数据
 * @param <T>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageList<T> {
    private Long totals = 0L;

    private List<T> data = new ArrayList<>();
}
