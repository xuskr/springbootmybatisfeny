package com.xym.springbootmybatisfeny.Handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xym.springbootmybatisfeny.Sercice.EmpService;
import com.xym.springbootmybatisfeny.po.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Xuyimin;
 * @create 2019-03-17-13:45
 */
@Controller
public class Handler {
    @Resource
    private EmpService es;
    @RequestMapping("/findAll")
    public String findAll(Map<String,Object>  map,Integer page){
        if(page==null){
            page=1;
        }

        PageHelper.startPage(page,4);
        //离分页方法最近的查询方法会自动被分页
        List<Emp> list = es.findAll();
        //设置分页的各种属性
        PageInfo<Emp> studentPageInfo = new PageInfo<>(list);
        //获取总页数
        int pages = studentPageInfo.getPages();
        map.put("list",list);
        map.put("page",page);
        map.put("pages",pages);
        return "findAll";
    }

}
