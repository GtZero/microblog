package com.guotao.www.util;

import java.util.List;

/**
 * 分页对象
 * GuoT 19.3.27
 * @param <T>
 */
public class PageBean<T> {
    //当前页码
    private Integer currentPage = 1;
    //每页显示条数
    private Integer pageSize = 5;
    //当前条件下的总记录数
    private Integer totalCount = 0;
    //总页数
    private Integer totalPage = 1;
    //开始行号
    private Integer startNum = 0;
    //查询的结果集
    private List<T> list;

    public Integer getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    public Integer getTotalPage() {
        //总页数
        totalPage = totalCount / pageSize;
        if(totalCount == 0 || totalCount % pageSize != 0){
            totalPage++;
        }
        return totalPage;
    }
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
    public Integer getStartNum() {
        //开始行号=(当前页数-1)x每页显示的条数
        return (currentPage - 1) * pageSize;
    }
    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }
    public List<T> getList() {
        return list;
    }
    public void setList(List<T> list) {
        this.list = list;
    }
}