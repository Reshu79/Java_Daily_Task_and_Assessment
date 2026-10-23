package crud_package.demo.service;

import crud_package.demo.dao.CourseDao;
import crud_package.demo.model.CourseModel;
import crud_package.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseImplement implements CourseService {
    @Autowired
    private CourseRepository cr;
    @Override
    public String courselogic(CourseDao cd){
         CourseModel cm=new CourseModel(cd.getSname(),cd.getCourse_duration(),
                 cd.getCourse_timimg(),cd.getCourse_name(),cd.getPh_no());
         cr.save(cm);
         return "data stored succesfully";
    }



}
