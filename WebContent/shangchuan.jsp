
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%String ctxPath=request.getContextPath(); %>
 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=ctxPath%>/PictureServlet" method="post" enctype="multipart/form-data">
<input  type="file" name="images"> 
<button  type="submit"  name="upload">上传</button>
</form>
</body>
</html>
