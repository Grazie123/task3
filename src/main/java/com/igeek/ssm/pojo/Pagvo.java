package com.igeek.ssm.pojo;

import java.util.List;

public class Pagvo {
    private Integer pageNow; //当前页
    private Integer myPages; //总页数
    private String query; //查询条件
     private Integer begin; //每页起始值
    private List<Items> itemsList; //每页记录
}
