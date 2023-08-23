<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Password</title>
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
    <center> <br>
        
        
        
        <div style="background-color:grey;width: 400px; height: 300px;">
            <form action="ChangePass"><br>
            <h1 > Change Password</h1>
            <table cellspacing="15" cellpadding="10"bgcolor="lightgrey">
                <tr><td><label>Old Password</label></td><td> :</td><td><input placeholder="Old Password" type="password" name="op"></td></tr>
                <tr><td><label>New Password</label></td><td> :</td><td><input placeholder="New Password" type="password" name="np"></td></tr>
                <tr><td><label>Confirm Password</label></td><td> :</td><td><input placeholder="Confirm Password" type="password" name="cp"></td></tr>
                
                    <%
                     if(request.getParameter("msg")!=null)
                   {
                   out.println("<tr><th colspan=3 style='color:red;'>"+request.getParameter("msg")+"</th></tr>");
                   }
                      if(request.getParameter("mes")!=null)
                   {
                   out.println("<tr><th colspan=3 style='color:red;'>"+request.getParameter("mes")+"</th></tr>");
                   }
                       if(request.getParameter("mg")!=null)
                   {
                   out.println("<tr><th colspan=3 style='color:red;'>"+request.getParameter("mg")+"</th></tr>");
                   }
                    
                    %>
                   
           
                <tr> <td><input type="Submit"value ="Change" style="cursor: pointer;color: blue;" >
                    </td><td></td><td><input type="Reset" style="color: blue;cursor: pointer;"></td></tr>
            </table>
                
            
        </form></div>
       </center>
</body>
</html>