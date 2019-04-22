package com.xym.springbootmybatisfeny.Sercice;

import com.xym.springbootmybatisfeny.po.Emp;

import java.util.List;

/**
 * @author Xuyimin;
 * @create 2019-03-17-13:42
 */
    public interface EmpService {
        public List<Emp> findAll();
}
