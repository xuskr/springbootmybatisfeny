package com.xym.springbootmybatisfeny.Sercice.impl;

import com.xym.springbootmybatisfeny.Dao.Empdao;
import com.xym.springbootmybatisfeny.Sercice.EmpService;
import com.xym.springbootmybatisfeny.po.Emp;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Xuyimin;
 * @create 2019-03-17-13:43
 */
@Service
public class EmpServiceimpl implements EmpService {
    @Resource
    private Empdao ed;

    @Override
    public List<Emp> findAll() {
        return ed.findAll();
    }
}
