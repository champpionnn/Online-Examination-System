<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Question</title>
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
    </div></center><hr>
    </header>
<center>
    <div style="width:700px; height:500px; border: 2px solid black;background-color: lightslategrey">
        <h2 >
            Add Question
        </h2><form action="AddQuestion">
        <table style="width:100%" height="400" cellspacing="30" bgcolor="lightgrey">
            <tr><td>Question Id</td><td ><input type="number" name="qid"style="width: 200px;"></td></tr>
            <tr><td>Question</td><td><textarea name="ques"rows="4"style="width: 200px;"></textarea></td></tr>
            <tr><td>Option 1</td><td><input type="text" name="opt1"style="width: 200px;"></td></tr>
            <tr><td>Option 2</td><td><input type="text" name="opt2"style="width: 200px;"></td></tr> 
            <tr><td>Option 3</td><td><input type="text" name="opt3"style="width: 200px;"></td></tr>
            <tr><td>Option 4</td><td><input type="text" name="opt4"style="width: 200px;"></td></tr>
            <tr><td>Answer</td><td><input type="text"name="ans"style="width: 200px;"></td></tr>
            <tr><td colspan=2 style="width: 200px;text-align: center;">
                    <%
                    if(request.getParameter("msg")!=null)
                        out.println("<H2 style='color:red;'>"+request.getParameter("msg")+"</h2>");
                    if(request.getParameter("message")!=null){
                        out.println("<H2 style='color:blue;'>"+request.getParameter("message")+"</h2>");
                    }// javax.servlet.http.HttpSession session=request.getSession();
                    String email=(String)session.getAttribute("email");   
                    if(email==null)
                    {
                      response.sendRedirect("Adminlogin.html?mess=Please Login First");
                    }
                    %>
                
            </td></tr>
            <tr style="margin-left:80px"><td><input type="Submit" value="Add Question"></td><td><input type="Reset" ></td></tr>
        </table>
        </form>
    </div>
        
</center>
    
    
</body>
</html>