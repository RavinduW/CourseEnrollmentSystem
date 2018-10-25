
package nsbmcourseenrolmentsystem;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DBconnections {
    //setting up the jdbc connectivity
    
    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    
    public static Connection connect(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm","root","");

            JOptionPane.showMessageDialog(null,"Welcome to NSBM Green University Course Enrolment System");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return con;        
    } //connect method
    
    void addUnderGrad(UndergradStudent ustu){
        try{
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           pst = (PreparedStatement)con.prepareStatement(query);
           
           pst.setString(1, ustu.getstudentID());
           pst.setInt(2, ustu.getindexNo());
           pst.setString(3, ustu.getfullName());
           pst.setString(4, ustu.getNameWithInitials());
           pst.setString(5, ustu.getAddress());
           pst.setString(6, ustu.getPhoneNum());
           pst.setString(7, ustu.getNic());
           pst.setInt(8, ustu.getAge());
           pst.setString(9, ustu.getDob());
           pst.setString(10, ustu.getEmail());
           pst.setString(11, ustu.getFaculty());
           pst.setString(12, ustu.getCourseTitle());
           pst.setString(13, ustu.getCourseID());
           pst.setString(14, ustu.getIntake());
           pst.setString(15, ustu.getGender());
           
           pst.executeUpdate();//execute sql query and insert data to db tables
          
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
        try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query2 = "INSERT INTO undergrad VALUES(?,?,?,?,?,?,?)";
            pst = (PreparedStatement)con.prepareStatement(query2);
            
            pst.setString(1, ustu.getstudentID());
            pst.setInt(2, ustu.getindexNo());
            pst.setInt(3, ustu.getAlevel_index_no());
            pst.setInt(4, ustu.getAlevel_year());
            pst.setString(5, ustu.getAlevel_results());
            pst.setInt(6, ustu.getAlevel_isand_rank());
            pst.setFloat(7, ustu.getZ_score());
            
            pst.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e.toString());
            
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
        
        try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query5 = "INSERT INTO enroldegree VALUES(?,?)";
            pst = (PreparedStatement)con.prepareStatement(query5);
            
            pst.setString(1, ustu.getstudentID());
            pst.setString(2, ustu.getRegDate());
            
             pst.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
                finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }   
    }//addUnderGrad method
    
        void addPostGrad(PostgradStudent pstu){
        try{
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query = "INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           pst = (PreparedStatement)con.prepareStatement(query);
           
           pst.setString(1, pstu.getstudentID());
           pst.setInt(2, pstu.getindexNo());
           pst.setString(3, pstu.getfullName());
           pst.setString(4, pstu.getNameWithInitials());
           pst.setString(5, pstu.getAddress());
           pst.setString(6, pstu.getPhoneNum());
           pst.setString(7, pstu.getNic());
           pst.setInt(8, pstu.getAge());
           pst.setString(9, pstu.getDob());
           pst.setString(10, pstu.getEmail());
           pst.setString(11, pstu.getFaculty());
           pst.setString(12, pstu.getCourseTitle());
           pst.setString(13, pstu.getCourseID());
           pst.setString(14, pstu.getIntake());
           pst.setString(15, pstu.getGender());
           
           pst.executeUpdate();//execute sql query and insert data to db tables
          
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
        try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query2 = "INSERT INTO postgrad VALUES(?,?,?,?,?,?,?)";
            pst = (PreparedStatement)con.prepareStatement(query2);
            
            pst.setString(1, pstu.getstudentID());
            pst.setInt(2, pstu.getindexNo());
            pst.setString(3, pstu.getUni());
            pst.setString(4, pstu.getDegree());
            pst.setDouble(5, pstu.getGpa_value());
            pst.setString(6, pstu.getClass_of_degree());
            pst.setInt(7, pstu.getGraduatedYr());
            
            pst.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e.toString());
            
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
        
        try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query5 = "INSERT INTO enroldegree VALUES(?,?)";
            pst = (PreparedStatement)con.prepareStatement(query5);
            
            pst.setString(1, pstu.getstudentID());
            pst.setString(2, pstu.getRegDate());
            
            pst.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
                finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }   
    }//addPostGrad method
    
    void addsubjects(SubjectSelect ss){
        
          try{
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query3 = "INSERT INTO selectsubject VALUES(?,?,?)";
           pst = (PreparedStatement)con.prepareStatement(query3);
           
           pst.setString(1, ss.stuID);
           pst.setString(2, ss.getSubjectName());
           pst.setString(3, ss.getSubjectID());
           
           pst.executeUpdate();
           
    }catch(Exception e){
              System.out.println(e.toString());
    }
              finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }   
    }
    }//addSubject method
    void addLecturer(Lecturer lec){
        try{
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query6 = "INSERT INTO lecturer VALUES(?,?,?,?)";
           pst = (PreparedStatement)con.prepareStatement(query6);
           
           pst.setString(1,lec.getLecID());
           pst.setString(2,lec.getLecName());
           pst.setString(3,lec.getSubID());
           pst.setString(4,lec.getSubName());
           
           pst.executeUpdate();
         
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            } 
    }
    }//addlecturer method
    
    ArrayList<Lecturer> getLecturer(){
         try{
           ArrayList<Lecturer> list = new ArrayList<Lecturer>();
             
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query4 = "SELECT * FROM lecturer";
           pst = (PreparedStatement)con.prepareStatement(query4);
           
           rs = pst.executeQuery();
           
           while(rs.next()){
               Lecturer lec = new Lecturer();
               lec.setLecID(rs.getString(1));
               lec.setLecName(rs.getString(2));
               lec.setSubID(rs.getString(3));
               lec.setSubName(rs.getString(4));
               
               list.add(lec);
               
           }//end of while
           
           return list;
    
         }catch(Exception e){
             System.out.println(e.toString());
             return null;
         }
           finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        
         }  
    }//getLecturer method
    
    void updateLecturer(Lecturer lec){
        try{
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query7 = "UPDATE lecturer SET subject_id='"+lec.getSubID()+"',subject_name='"+lec.getSubName()+"' WHERE lecturerID='"+lec.getLecID()+"'AND lecturerName='"+lec.getLecName()+"'";
           pst = (PreparedStatement)con.prepareStatement(query7); 
           
           pst.executeUpdate();
            
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
         } 
    }//update lecturer method
    
    void deleteLec(Lecturer lec){
        try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query8 = "DELETE FROM lecturer WHERE lecturerID='"+lec.getLecID()+"' AND subject_id='"+lec.getSubID()+"'";
            pst = (PreparedStatement)con.prepareStatement(query8); 
            
            pst.executeUpdate();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
         } 
        
    }//delete lec method
    
    void addAssignmentMarks(AssignmentMarks am){
         try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query9 = "INSERT INTO assignmentmarks VALUES(?,?,?,?)";
            pst = (PreparedStatement)con.prepareStatement(query9);
            
            pst.setString(1, am.stuID);
            pst.setString(2, am.subID);
            pst.setString(3, am.getAssignmentID());
            pst.setString(4, am.getMarks());
            
            pst.executeUpdate();
            
         }catch(Exception e){
             System.out.println(e.toString());
         }
              finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
         } 
    }//add assignment marks
    
    void addProjectMarks(ProjectMarks pm){
                try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query10 = "INSERT INTO projectmarks VALUES(?,?,?,?)";
            pst = (PreparedStatement)con.prepareStatement(query10);
            
            pst.setString(1, pm.stuID);
            pst.setString(2, pm.subID);
            pst.setString(3, pm.getProjectID());
            pst.setString(4, pm.getMarks());
            
            pst.executeUpdate();
            
         }catch(Exception e){
             System.out.println(e.toString());
         }
              finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
         } 
    }//add projectmarks method
    
    void addExamMarks(Marks m){
                       try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query11 = "INSERT INTO exammarks VALUES(?,?,?)";
            pst = (PreparedStatement)con.prepareStatement(query11);
            
            pst.setString(1, m.stuID);
            pst.setString(2, m.subID);
            pst.setString(3, m.getMarks());
            
            pst.executeUpdate();
            
         }catch(Exception e){
             System.out.println(e.toString());
         }
              finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
         } 
    }//add exam marks method
    
    void addInstructor(Instructor ins){
        try{
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query12 = "INSERT INTO instructor VALUES(?,?,?,?)";
           pst = (PreparedStatement)con.prepareStatement(query12);
           
           pst.setString(1,ins.getInstructorName());
           pst.setString(2,ins.getInstructorID());
           pst.setString(3,ins.getSubName());
           pst.setString(4,ins.getSubID());
           
           pst.executeUpdate();
         
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            } 
    }
    }//addinstructor method
        ArrayList<Instructor> getInstructor(){
         try{
           ArrayList<Instructor> list2 = new ArrayList<Instructor>();
             
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query13 = "SELECT * FROM instructor";
           pst = (PreparedStatement)con.prepareStatement(query13);
           
           rs = pst.executeQuery();
           
           while(rs.next()){
               Instructor ins = new Instructor();
               ins.setInstructorName(rs.getString(1));
               ins.setInstructorID(rs.getString(2));
               ins.setSubID(rs.getString(3));
               ins.setSubName(rs.getString(4));
               
               list2.add(ins);
               
           }//end of while
           
           return list2;
    
         }catch(Exception e){
             System.out.println(e.toString());
             return null;
         }
           finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        
         }  
    }//getinstructor method
      
        void updateInstructor(Instructor ins){
        try{
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           String query14 = "UPDATE instructor SET subject_id='"+ins.getSubID()+"',subject_name='"+ins.getSubName()+"' WHERE instructorID='"+ins.getInstructorID()+"'AND instructorName='"+ins.getInstructorName()+"'";
           pst = (PreparedStatement)con.prepareStatement(query14); 
           
           pst.executeUpdate();
            
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
         } 
    }//update instructor method
        
        void deleteIns(Instructor ins){
        try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query15 = "DELETE FROM instructor WHERE instructorID='"+ins.getInstructorID()+"' AND subject_id='"+ins.getSubID()+"'";
            pst = (PreparedStatement)con.prepareStatement(query15); 
            
            pst.executeUpdate();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
         } 
        
    }//delete ins method
        
         public ResultSet viewUndergrad(String s){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT * FROM student WHERE student_id= ?");
           pst.setString(1, s);
           rs = pst.executeQuery();
           
           
             
         return rs;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }//view undergrad method

    public ResultSet viewUndergrad2(String s){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT * FROM undergrad WHERE student_id= ?");
           pst.setString(1, s);
           rs2 = pst.executeQuery();
           
         return rs2;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }
    
       public ResultSet viewUndergrad3(String s){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT * FROM enroldegree WHERE student_id= ?");
           pst.setString(1, s);
           rs3 = pst.executeQuery();
         
         return rs3;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }
    //undergraduates viewing
    
     public ResultSet viewPostgrad(String s){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT * FROM student WHERE student_id= ?");
           pst.setString(1, s);
           rs = pst.executeQuery();
           
         return rs;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }//view undergrad method

    public ResultSet viewPostgrad2(String s){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT * FROM postgrad WHERE student_id= ?");
           pst.setString(1, s);
           rs2 = pst.executeQuery();
           
         return rs2;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }
    
       public ResultSet viewPostgrad3(String s){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT * FROM enroldegree WHERE student_id= ?");
           pst.setString(1, s);
           rs3 = pst.executeQuery();
         
         return rs3;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }
    //postgraduate viewing
   public ResultSet viewSub1(String s){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT subject_name FROM selectsubject WHERE subject_id=?");
           pst.setString(1, s);
           
           rs = pst.executeQuery();
           
         return rs;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }//view subjects method

       public ResultSet viewSub2(String s){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT credit,price FROM subject WHERE subject_id=?");
           pst.setString(1, s);
           
           rs = pst.executeQuery();
           
         return rs;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }//view undergrad method
    
       void deleteSub(SubjectSelect sub){
            try{
            con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
            String query25 = "DELETE FROM selectsubject WHERE student_id='"+sub.stuID+"' AND subject_id='"+sub.getSubjectID()+"'";
            pst = (PreparedStatement)con.prepareStatement(query25); 
            
            pst.executeUpdate();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            try{
                if(pst != null){
                    pst.close();
                }
                if(con != null){
                    con.close();
                }
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
         } 
       }//deletesub method
       
          public ResultSet viewAssignmentMarks(String s,String s2){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT marks FROM assignmentmarks WHERE assignment_id=? AND student_id=?");
           pst.setString(1, s);
           pst.setString(2, s2);
           
           rs = pst.executeQuery();
           
         return rs;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }//view assignment marks method
       
         public ResultSet viewProjectMarks(String s,String s2){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT marks FROM projectmarks WHERE project_id=? AND student_id=?");
           pst.setString(1, s);
           pst.setString(2, s2);
           
           rs = pst.executeQuery();
           
         return rs;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }//view project marks method
    
         public ResultSet viewExamMarks(String s,String s2){
         try{
          
           con=(Connection) DriverManager.getConnection(url,username,password); //get the connection
           
           pst = con.prepareStatement("SELECT marks FROM exammarks WHERE subject_id=? AND student_id=?");
           pst.setString(1, s);
           pst.setString(2, s2);
           
           rs = pst.executeQuery();
           
         return rs;
         }catch(Exception e){
             System.out.println(e.toString());
            return null; 
         }
     
    }//view exam marks method
      
} //DBconnections class




