<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet"
	href="https://code.jquery.com/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<style>
body {
	min-width: 630px
}

#container {
	padding-left: 200px;
	padding-right: 190px
}

#container .column {
	float: left
}

#center {
	padding: 10px 20px;
	width: 100%
}

#left {
	width: 180px;
	padding: 0 10px;
}

#right {
	width: 130px;
	padding: 0 10px
}

#footer {
	clear: both
}

#left {
	left: 150px
}

#container {
	overflow: scroll
}

#container .column {
	padding-bottom: 1001em
}

body {
	overflow: hidden
}

#footer-wrapper {
	float: left;
	width: 100%;
	padding-bottom: 10010px;
	background: #1D02FA
}

body {
	margin: 0;
	padding: 0;
	font-family: Sans-serif;
	line-height: 1.5em
	background-image: url("login.jpg");
   background-color: #cccccc;
}

p {
	color: #fff
}

nav ul {
	list-style-type: none;
	margin: 0;
	padding: 0
}

nav ul a {
	color: darkgreen;
	text-decoration: none
}

#header, #footer {
	font-size: large;
	padding: 0.3em;
	background: #011093
}

#left {
	background: #DAE9BC
}

#right {
	background: #F7FDEB
}

#center {
	background: #fff;
	 overflow-y: scroll;
    overflow-x:hidden;
}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

#container .column {
	padding-top: 1em
}
button {
    background-color: orange;
    color: black;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #29e535;
}
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}
</style>
<script>
	$(function() {
		$("#tabs").tabs({
			collapsible : true
		});
	});
	$( function() {
	    $( document ).tooltip();
	  } );

	 $( function() {
		    $( "#dialog" ).dialog({
		      autoOpen: false,
		      modal: true,
		      height: 200,
		      width: 700,
		      show: {
		        effect: "blind",
		        duration: 1000
		      },
		      hide: {
		        effect: "explode",
		        duration: 1000
		      }
		    });
		 
		    $( "#excel-upload" ).on( "click", function() {
		      $( "#dialog" ).dialog( "open" );
		    });
		  } );
</script>

</head>
<body>


	<div id="header">
		<table>
			<tr>
				<td width="1200px">
					<p>Your Share Portal</p>
				<td width='100px' onclick="window.location='../HR/Login.jsp';"><p>Log Out</p></td>
			</tr>
		</table>

	</div>
	<div id='center'>
		<table>
			<tr height="500px">
				<td width='15%'>
				<form action="<%=request.getContextPath()%>/EmpSearchController" method="get" >
					<table border='0'>
					
						<tr style="outline: thin solid" height="200px">
							<td colspan="2"><img src='../HR/User_image.png' ></td>
						
						</tr>
						<tr height="10px">
							<td colspan="2" align="center"><a>Welcome Back User!!</a></td>
						</tr>
						<tr height="10px">
							<td width='80%'><input type='text' name='empNo'
								placeholder="Search Employee"></td>
							<td width='20%'><input type="submit" name='Search'
								value='Search'></td>
						</tr>
						<tr height="60px"></tr>
						<tr height="50px">
						<td colspan="2" height="50px" width="100%"><img  style="border-color: orange;" src='../HR/rr_image.png' title="click here for Reports" onclick="window.location='../HR/RetentionReports.jsp';" >
						</td>
						</tr>
						<tr height="50px"></tr>
					</table>
</form>
<td>
	<a href="/createNewShare" name=""> Create New Share </a>
	<a href="/alterExistingShareValue" name=""> Click Here to Update existing Share </a>
	</td>
</tr></table></div>
	

	<div id="footer">
		<center>
			<p>Copyright Rightly registered</p>
		</center>
	</div>
</body>
</html>
