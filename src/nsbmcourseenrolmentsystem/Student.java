
package nsbmcourseenrolmentsystem;

public class Student {

    private String studentID;
    private int indexNo;
    private String fullName;
    private String nameWithInitials;
    private String gender;
    private String nic;
    private int age;
    private String dob;
    private String email;
    private String faculty;
    private String courseTitle;
    private String courseID;
    private String intake;
    private String regDate;
    private String address;
    private String phoneNum;
    
    //setters & getters 
    public String getstudentID(){
        return studentID;
    }
    public void setstudentID(String studentID){
        this.studentID = studentID;
    }
    
    public int getindexNo(){
        return indexNo;
    }
    public void setindexNo(int indexNo){
        this.indexNo = indexNo;
    }
    
    public String getfullName(){
        return fullName;
    }
    public void setfullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getNameWithInitials() {
        return nameWithInitials;
    }
    public void setNameWithInitials(String nameWithInitials) {
        this.nameWithInitials = nameWithInitials;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNic() {
        return nic;
    }
    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseID() {
        return courseID;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getIntake() {
        return intake;
    }
    public void setIntake(String intake) {
        this.intake = intake;
    }
    //setters & getters}


    public String getRegDate() {
        return regDate;
    }

 
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

 
    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhoneNum() {
        return phoneNum;
    }

    
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}

class UndergradStudent extends Student{
    private int alevel_index_no;
    private int alevel_year;
    private String alevel_results;
    private int alevel_isand_rank;
    private float z_score;
    
    //setters & getters
    public int getAlevel_index_no() {
        return alevel_index_no;
    }
    public void setAlevel_index_no(int alevel_index_no) {
        this.alevel_index_no = alevel_index_no;
    }

    public int getAlevel_year() {
        return alevel_year;
    }
    public void setAlevel_year(int alevel_year) {
        this.alevel_year = alevel_year;
    }

 
    public String getAlevel_results() {
        return alevel_results;
    }
    public void setAlevel_results(String alevel_results) {
        this.alevel_results = alevel_results;
    }

 
    public int getAlevel_isand_rank() {
        return alevel_isand_rank;
    }
    public void setAlevel_isand_rank(int alevel_isand_rank) {
        this.alevel_isand_rank = alevel_isand_rank;
    }

    public float getZ_score() {
        return z_score;
    }
    public void setZ_score(float z_score) {
        this.z_score = z_score;
    }//setters & getterss
    
}


class PostgradStudent extends Student{
    private String uni;
    private String degree;
    private double gpa_value;
    private int graduatedYr;
    private String class_of_degree;
    
    //setters & getters 
    public String getUni() {
        return uni;
    }
    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public double getGpa_value() {
        return gpa_value;
    }
    public void setGpa_value(double gpa_value) {
        this.gpa_value = gpa_value;
    }

    public int getGraduatedYr() {
        return graduatedYr;
    }
    public void setGraduatedYr(int graduatedYr) {
        this.graduatedYr = graduatedYr;
    }

    public String getClass_of_degree() {
        return class_of_degree;
    }
    public void setClass_of_degree(String class_of_degree) {
        this.class_of_degree = class_of_degree;
    }
//setters & getters
    
}