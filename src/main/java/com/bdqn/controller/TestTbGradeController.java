package com.bdqn.controller;


import com.bdqn.pojo.TestTbGrade;
import com.bdqn.service.TestTbGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 张佳伟
 * @since 2019-05-06
 */
@RestController
public class TestTbGradeController {

    @Autowired
    private TestTbGradeService testTbGradeService;

    @PostMapping("/del")
    public boolean del(Integer id){
        return testTbGradeService.removeById(id);
    }


    @PostMapping("/updateById")
    public boolean updateById(TestTbGrade testTbGrade){
        return testTbGradeService.updateById(testTbGrade);
    }

    @PostMapping("/getById")
    public TestTbGrade getById(Integer id) {
        return testTbGradeService.getById(id);
    }

    @PostMapping("/select")
    public List<TestTbGrade> list() {
        return testTbGradeService.list();
    }

    @PostMapping("/addOne")
    public boolean addOne(TestTbGrade testTbGrade){
        return testTbGradeService.save(testTbGrade);
    }
}
