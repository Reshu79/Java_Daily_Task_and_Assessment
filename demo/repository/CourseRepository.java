package crud_package.demo.repository;

import crud_package.demo.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//this repository having query logics like save
public interface CourseRepository extends JpaRepository <CourseModel,Integer>{

}
