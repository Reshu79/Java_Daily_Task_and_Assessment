package crud_package.demo.model;

import jakarta.persistence.*;

@Entity
@Table (name="course_table")
public class CourseModel {
    //it is table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="stud_id")//to specify the Column name
    private int id;
    @Column  (name="stud_name")
    private String sname;
    @Column(name="course_duration")
    private String course_duration;
    @Column(name="course_timing")
    private int course_timimg;
    @Column(name="course_name")
    private String course_name;
    @Column(name="ph_no")
    private long ph_no;

    public CourseModel() {
    }//default or non-parametrized constructor

    public CourseModel(String sname, String course_duration, int course_timimg, String course_name, long ph_no) {
        this.sname = sname;
        this.course_duration = course_duration;
        this.course_timimg = course_timimg;
        this.course_name = course_name;
        this.ph_no = ph_no;
    }//parametrized constructor

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
