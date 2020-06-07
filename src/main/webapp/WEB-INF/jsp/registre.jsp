
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<html>
  <head>
    <title>注册页面</title>
  </head>
  <body>
  <center>
    <h3>欢迎注册该网站</h3>
    <form action="doRegister.jsp" method="post">
       <table>
          <tr>
            <td>用户名</td>
            <td><input type="text" name="user"></td>
          </tr>
          <tr>
            <td>密码</td>
            <td><input type="password" name="pwd">密码不得少于6位</td>
          </tr>
          <tr>
            <td>性别</td> 
            <td><input type="radio" name="sex" value="男">男
                <input type="radio" name="sex" value="女">女</td>
          </tr>
          <tr>
            <td>擅长的语言</td>
            <td></td>
            <td><input type="checkbox" name="checkbox1" value="C">C</td>
            <td><input type="checkbox" name="checkbox1" value="Java">Java</td>
            <td><input type="checkbox" name="checkbox1" value="C#">C#</td>
            <td><input type="checkbox" name="checkbox1" value="Ruby">Ruby</td>
            <td><input type="checkbox" name="checkbox1" value="PHP">PHP</td>
          </tr>
          <tr>
            <td><input type="submit" value="注册"></td>
            <td><input type="reset" value="取消"></td>
          </tr>
       </table>
    </form>
  </center>
  </body>
</html>
