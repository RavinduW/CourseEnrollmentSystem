
package nsbmcourseenrolmentsystem;


public class SubjectSelect {
    private String subjectName;
   private String subjectID;

    public String getSubjectName() {
        return subjectName;
    }

   public void setSubjectName(String subjectName){
       this.subjectName = subjectName;
   }
    public String getSubjectID() {
        return subjectID;
    }

   public void setSubjectID(String subjectID){
       this.subjectID = subjectID;
   }
   
   UndergradStudent ust = new UndergradStudent();
   
   String stuID = ust.getstudentID();
 
}