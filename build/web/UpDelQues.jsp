<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update/Delete Question</title>
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
    <header>
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
    </header>
<center>
    <div style="width:1200px; height:600px;overflow: scroll; border: 2px solid black;background-color: lightslategrey">
        <h2 >
            Update/Delete Question
        </h2>
        <table style="width:1100" border="1" cellspacing="0" bgcolor="white"cellpadding="10">
            <tr><th>Ques Id</th><th>Question</th><th>Update</th><th>Delete</th></tr>
            <%
                DB.DBCon db=new DB.DBCon();
                db.pstmt=db.con.prepareStatement("select * from ques_mstr");
                db.rst=db.pstmt.executeQuery();
                while(db.rst.next())
                {
                    out.println("<tr><td>"+db.rst.getString(1)+"</td><td>"+db.rst.getString(2)+"</td>"
                            + "<td><a href=UpdateQues.jsp?qid="+db.rst.getString(1)+"> <input type=button value=Update>"
                            + "</a></td>"
                            + "<td><a href=DeleteQues.jsp?qid="+db.rst.getString(1)+"> <input type=button value=Delete>"
                            + "</a></td>");
              }
            
            
            %>
           
           
            
        </table>
        </form>
    </div>
        
</center>
    
    
</body>
</html>