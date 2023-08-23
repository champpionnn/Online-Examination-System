<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home Page</title>
    <link href="https://fonts.googleapis.com/css2?family=Baloo+Bhai+2:wght@800&family=Baloo+Bhaina+2:wght@800&display=swap" rel="stylesheet">
    <style>
        /* CSS RESET  */
        body{
            font-family: 'Baloo Bhai 2', cursive;
            margin: 0px;
            padding: 0px;
            background: url(Images/Student7.jpg);
            background-repeat:no-repeat ;
           background-size: 1550px 800px;  
           font-family: Baloo Bhai;  
           
        }
        .navbar
        {
         display: inline-block;
         border: 3px solid white;
        margin-left: 0%;
         margin-top: 25px;
         border-radius: 5px;
        }
        .navbar li{
            display: inline-block;
        }
        .navbar li a{
            color: white;
            font-size:23px;
            padding: 15px;
            text-decoration: none;
        }
        .navbar li a:hover{
           
           color: grey;
           font-size:23px;
           padding:15px;
           text-decoration: none; 
       }
     

    
    </style>
</head>
<body>
    <header><center>
        <div class="navbar">
        <ul>
        <li><a href="StudentList.jsp "> Student List</a> </li>
        <li><a href="AddQuestion.jsp "> Add Question</a> </li>
        
        <li><a href="QuestionList.jsp">Question List</a></li>
        <li> <a href="UpDelQues.jsp">Update/Delete Question</a></li>
        <li><a href="AdminResult.jsp">Result</a></li>
        
        <li><a href="AdminChangePass.jsp">Change Password</a></li>
        <li><a href="AdminLogout">Log Out</a></li>
        </ul>
    </div><hr>
    </center></header>
     <center> <br>
        
        
        
        <div style="background-color:grey;width: 400px; height: 300px;">
            <form action="AdminChangePass"><br>
            <h1 > Change Password</h1>
            <table cellspacing="15" cellpadding="10"bgcolor="lightgrey">
                <tr><td><label>Old Password</label></td><td> :</td><td><input placeholder="Old Password" type="password" name="op"></td></tr>
                <tr><td><label>New Password</label></td><td> :</td><td><input placeholder="New Password" type="password" name="np"></td></tr>
                <tr><td><label>Confirm Password</label></td><td> :</td><td><input placeholder="Confirm Password" type="password" name="cp"></td></tr>
           
                <tr> <td><input type="Submit"value ="Change" style="cursor: pointer;color: blue;" >
                    </td><td></td><td><input type="Reset" style="color: blue;cursor: pointer;"></td></tr>
            </table>
                
            
        </form></div>
       </center>
    
</body>
</html>