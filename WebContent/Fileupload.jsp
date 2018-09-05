<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <title>File Uploading Form</title>
   </head>
   
  <body>
  <div style="text-align: center;">
<form action="servletname" method="post" enctype="multipart/form-data">
<h1><u>Registration Form</u></h1>
<table align="center" cellspacing="10">
<tr><td>Enter Name:</td><td><input type="text" name="user1"></td></tr>
<tr><td>Enter Password:</td><td><input type="text" name="user2"></td></tr>
<tr><td>Enter ReEnter Password:</td><td><input type="text" name="user3"></td></tr>
<tr><td>Enter Mail id:</td><td><input type="text" name="user4"></td></tr>
<tr><td>Select Picture :</td><td><input type="file" name="filetoupload"></td></tr>
<tr><td colspan="2"><input type="submit" value="Submit Application"></td></tr>  
</table>
</form>
</div>
<script>

</script>
</body>
</html>
     <!--  <h3>File Upload:</h3>
      Select a file to upload: <br ><br >
      <form action = "UploadServlet" method = "post" enctype = "multipart/form-data">
         <input type = "file" name = "file" size = "50" ><br><br>
         
         <input type = "submit" value = "Upload File" ><br><br>
      </form>
      </div>
   </body>
</html> -->