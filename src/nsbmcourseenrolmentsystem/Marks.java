/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmcourseenrolmentsystem;

/**
 *
 * @author Ravindu Weerasinghe
 */
public class Marks {
    private String marks;

    /**
     * @return the marks
     */
    public String getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(String marks) {
        this.marks = marks;
    }
    
    Student st  = new Student();
    Subject sb = new Subject();
    String stuID = st.getstudentID();
    String subID = sb.getSubjectID();
     
    
}
    class AssignmentMarks extends Marks{
        private String assignmentID;
        
        public String getAssignmentID(){
            return assignmentID;
        }
        
        public void setAssignmentID(String assignmentID){
            this.assignmentID = assignmentID;
        }      
        
    }

    class ProjectMarks extends Marks{
        private String projectID;
        
        public String getProjectID(){
            return projectID;
    }
        public void setProjectID(String projectID){
            this.projectID = projectID;
        }
    }
