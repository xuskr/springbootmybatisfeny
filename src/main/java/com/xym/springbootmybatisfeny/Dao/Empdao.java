package com.xym.springbootmybatisfeny.Dao;

import com.xym.springbootmybatisfeny.po.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Xuyimin;
 * @create 2019-03-17-13:39
 */
@Mapper
@RequestMapping
public interface Empdao {
    @Select("select * from emp")
    public List<Emp> findAll();
}
