<html>
    <head>
        <title>creating a website</title>
    </head>
    <%@ page import="java.util.Date" %>
    <body>
        <h1>Hi ${userNo} </h1></br>
        <form action="addCollege">
            DeptCount: <input type="text" name="deptCount"> <br>
            DeptName: <input type="text" name="deptName"> <br>
            DeptId: <input type="text" name="deptId"> <br>
            NO.Of Staff: <input type="text" name="staffCount"> <br>
            No.Of Lab: <input type="text" name="labCount"> <br>
           <input type="submit">
           </form>

          <h1>ViewUser</h1>
          <form action="viewCollege">
          DeptId: <input type="text" name="deptId"> <br>
          <input type="submit">
          </form>        
        
         <h1>deleteUser</h1>
         <form action="deleteCollege">
         DeptId: <input type="text" name="deptId"> <br>
        <input type="submit">
        </form>

        <h1>updateUser</h1>
        <form action ="updateCollege">
        DeptId:<input type ="text" name="deptId"><br>
        DeptCount:<input type ="text" name="deptCount"><br>
        <input type ="submit">
        </form>


    </body>
</html>