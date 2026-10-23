package crud_package.demo.dao;

import jakarta.persistence.Column;

public class CourseDao {
    private int id;
    private String sname;
    private String course_duration;
    private int course_timimg;
    private String course_name;
    private long ph_no;

    public CourseDao(){

    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public int getCourse_timimg() {
        return course_timimg;
    }

    public void setCourse_timimg(int course_timimg) {
        this.course_timimg = course_timimg;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public long getPh_no() {
        return ph_no;
    }

    public void setPh_no(long ph_no) {
        this.ph_no = ph_no;
    }

    public CourseDao(String sname, String course_duration, int course_timimg, String course_name, long ph_no) {
        this.sname = sname;
        this.course_duration = course_duration;
        this.course_timimg = course_timimg;
        this.course_name = course_name;
        this.ph_no = ph_no;
    }


}
