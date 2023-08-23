<%@page import="DB.DBCon"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile</title>
    <style>
        /* CSS RESET  */
        body{
            margin: 0px;
            padding: 0px;
            background: url(Images/Student7.jpg);
            background-repeat:no-repeat ;
           background-size: 1550px 800px;
           
             
           
        }
        .navbar
        {
         display: inline-block;
         border: 3px solid white;
        margin-left: 2%;
         margin-top: 25px;
         border-radius: 5px;
         /* position: fixed; */
        }
        .navbar li{
            display: inline-block;
        }
        .navbar li a{
            color: white;
            font-size: 23px;
            padding:  40px;
            text-decoration: none; 
        }
        .navbar li a:hover{
           
            color: grey;
            font-size: 23px;
            padding:  40px;
            text-decoration: none; 
        }

    
    </style>
</head>
<body>
    <header><center>
        <div class="navbar">
        <ul>
        <li><a href="StuProfile.jsp "> Profile</a> </li>
        <li><a href="StartExam">Exam</a></li>
        <li><a href="StuResult">Result</a></li>
        <li><a href="ChangePass.jsp">Change Password</a></li>
       
        <li><a href="StuLogout">Logout</a></li>
        </ul>
    </div></center><hr>
    </header>
<center><div style="background: steelblue; width: 70%;height: 670px"><h1>Students Profile</h1>
        
                <table border bgcolor="skyblue" width="70%" height="600px" cellspacing="0" cellpadding="10">
                    <% 
                       String user=(String)session.getAttribute("user");
                        
                        
                        DBCon db=new DBCon();
                        db.pstmt=db.con.prepareStatement("Select * from stu_info where email=?");
                        db.pstmt.setString(1,user);
                        db.rst=db.pstmt.executeQuery();
                        if(db.rst.next())
                        {
                            out.println("<tr><td>User Id</td><td>"+db.rst.getString(1)+"</td></tr>"
                                    + "<tr><td>Student Name</td><td>"+db.rst.getString(2)+"</td></tr>"
                                    + "<tr><td>Qualification</td><td>"+db.rst.getString(3)+"</td></tr>"
                                    + "<tr><td>Date of Birth</td><td>"+db.rst.getString(4)+"</td></tr>"
                                    + "<tr><td>Gender</td><td>"+db.rst.getString(5)+"</td></tr>"
                                    + "<tr><td>Address</td><td>"+db.rst.getString(6)+"</td></tr>"
                                    + "<tr><td>City</td><td>"+db.rst.getString(7)+"</td></tr>"
                                    + "<tr><td>State</td><td>"+db.rst.getString(8)+"</td></tr>"
                                    + "<tr><td>Pin</td><td>"+db.rst.getString(9)+"</td></tr>"
                                    + "<tr><td>Mobile Number</td><td>"+db.rst.getString(10)+"</td></tr>");
                            
                                    
                        }else
                        {
                            out.println("<tr><td colspan=2> Please login First</td></tr>");
                        }
                        
                        
                    
                            
                            %>
                </table>
                    
                    
                
    </div></center>
    
</body>
</html>