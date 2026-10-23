package crud_package.demo.controller;

import crud_package.demo.dao.CourseDao;
import crud_package.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/courseapi")
public class CourseController {
    //ithula courseService la ullatha edukkom
    @Autowired
    private CourseService cs;
    @PostMapping("/postapi")
    public String getting(@RequestBody CourseDao cd){
        return cs.courselogic(cd);
    }
    @PutMapping("/updateapi")
    public EntityResponse<String> update(@RequestBody){
        String response=
    }
}
