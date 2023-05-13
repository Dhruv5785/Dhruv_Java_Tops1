<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function checkfname()
{
	alert("Hello1");
	var f=document.frm.fname.value;
	alert("Hello2");
	var reg=/^[A-Za-z]+$/;
	alert("Hello3");
	if(f=="")
		{
		alert("Hello if");
		document.getElementById("fname").innerHTML="Please Enter First Name";
		}
	else if(!reg.test(f))
		{
		alert("Hello else if");
		document.getElementById("fname").innerHTML="Please Enter only Alphabets";
		}
	else
		{
		alert("Hello else ");
		document.getElementById("fname").innerHTML="";
		}
}
/* function checkEmail()
{
	var f=document.frm.email.value;
	var reg=/^[A-Za-z0-9-_.]+@[A-Za-z]\.[A-Za-z]{2,4}$/;
	if(f=="")
		{
		document.getElementById("email").innerHTML="Please Enter Email";
		}
	else if(!reg.test(f))
		{
		document.getElementById("email").innerHTML="Please Enter Valid Email";
		}
	else
		{
		document.getElementById("email").innerHTML="";
		}
	}
function checkmobile()
{
	var f=document.frm.mobile.value;
	var reg=/^\d(10)$/;
	if(f=="")
		{
		document.getElementById("mobile").innerHTML="Please Enter mobile";
		}
	else if(!reg.test(f))
		{
		document.getElementById("mobile").innerHTML="Please Enter only 10 digit";
		}
	else
		{
		document.getElementById("mobile").innerHTML="";
		}
	}
function checkpassword()
{
	var f=document.frm.password.value;
	var reg=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
	if(f=="")
		{
		document.getElementById("password").innerHTML="Please Enter mobile";
		}
	else if(!reg.test(f))
		{
		document.getElementById("password").innerHTML="Min 1 Digit, Upper, Lower & Special";
		}
	else
		{
		document.getElementById("password").innerHTML="";
		}
	}
function checkcpassword()
{
	var p1=document.frm.password.value;
	var p1=document.frm.cpassword.value;
	
	if(p2=="")
		{
		document.getElementById("password").innerHTML="Please Enter confirm password";
		}
	else if(p1!=p2)
		{
		document.getElementById("cpassword").innerHTML="password & confirm password Does not match";
		}
	else
		{
		document.getElementById("cpassword").innerHTML="";
		}
	}
 */
</script>
</head>
<body>
<form name="frm" method="post" action="">
       <table  cellspacing="5px" celladding="3px">
       <tr>
       <td>First Name</td>
       <td><input type="text" name="fname" onblur="checkfname();"></td>
       <td><span id="fname"></span> </td>
       </tr>
        <tr>
       <td>Last Name</td>
       <td><input type="text" name="lname"></td>
        <tr>
       <td>Email Id</td>
       <td><input type="text" name="email" onblur="checkEmail()"></td>
        <td><span id="email"></span> </td>
       </tr>
       <tr>
       <td>Mobile</td>
       <td><input type="text" name="mobile" onblur="checkmobile();"></td>
       <td><span id="mobile"></span></td>
       
       </tr>
       <tr>
       <td>Address</td>
       <td><textarea  cols="15" name=address></textarea></td>
       </tr>
       <tr>
       <td>Gender</td>
       <td>
       <input type="radio" name="gender" value="male">Male
       <input type="radio" name="gender" value="female">FeMale
       </td>
       </tr>
       <tr>
       <td>Hobby</td>
       <td>
       <input type="checkbox" name="hobby" value="music">Music<br>
       <input type="checkbox" name="hobby" value="reading">Reading<br>
       <input type="checkbox" name="hobby" value="cricket">Cricket<br>
       <input type="checkbox" name="hobby" value="travelling">Travelling
       </td>
       </tr>
       <tr>
       <td>Education</td>
       <td>
       <select name="education">
       <option>---Select Education---</option>
       <option value="10th">10th</option>
        <option value="12th">12th</option>
         <option value="be">BE</option>
          <option value="bca">BCA</option>
           <option value="bba">BBA</option>
           <option value="me">ME</option>
            <option value="mca">MCA</option>
            </select>
       </td>
       </tr>
       <tr>
       <td>Birth Date</td>
       <td><input type="date" name="bdate"> </td>
       </tr>
       <tr>
       <td>Resume</td>
       <td><input type="file" name="resume"> </td>
       </tr>
       <tr>
       <td>Password</td>
       <td><input type="password" name="password" onblur="checkpassword();"> </td>
       <td><span id="password"></span></td>
       </tr>
       <tr>
       <td>Confirm Password</td>
       <td><input type="password" name="cpassword" onblur="checkcpassword();"> </td>
       <td><span id="cpassword"></span></td>
       </tr>
       <tr>
       <td colspan="2" align="center">
       <input type="submit" name="action" value="SUBMIT">
        </td>
       </tr>
       </table>
</form>
</body>
</html>