<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bean</title>
    </head>
    
    <body>
        <h1>Student Data</h1>
        
        <jsp:useBean id="student" class="Bean.Student">
            <jsp:setProperty name="student" property="name" value="Yash"/>
            <jsp:setProperty name="student" property="age" value="23"/>
        </jsp:useBean>

        <p>
            <b> Student Name : </b>
             <jsp:getProperty name="student" property="name"/>
        </p>
        
        <p>
            <b> Student Age : </b>
             <jsp:getProperty name="student" property="age"/>
        </p>

    </body>
</html>
