<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>This is just a test</h2>
    <div style="width: 1304px">
        <div style="width: 300px;float: left;border: 1px solid #888888">
            <form action="" id="formID" method="post" enctype="multipart/form-data">
                <label>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名</label>
                <input type="text" name="username" id="usernameID" /><br />
                <label>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别</label>
                <input type="text" name="sex" id="sexID" /><br />
                <label>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄</label>
                <input type="text" name="age" id="ageID" /><br />
                <label>出生日期</label>
                <input type="text" name="birthday" id="birthdayID" /><br />
                <label>创建时间</label>
                <input type="text" name="createTime" id="createTimeID" /><br />
                <label>修改时间</label>
                <input type="text" name="lastModTime" id="lastModTimeID" /><br />
                <input type="submit" id="submitID" value="保存" onclick="submit()" />
            </form>
        </div>
        <div style="width: 1000px;float: left;border: 1px solid #888888">
            <table>
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>年龄</th>
                    <th>出生日期</th>
                    <th>创建时间</th>
                    <th>修改时间</th>
                </tr>
                <c:forEach items="${helloPOS}" var="helloPO">
                    <tr>
                        <td>${helloPO.id}</td>
                        <td>${helloPO.username}</td>
                        <td>${helloPO.sex}</td>
                        <td>${helloPO.age}</td>
                        <td>${helloPO.birthday}</td>
                        <td>${helloPO.createTime}</td>
                        <td>${helloPO.lastModTime}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script type="text/javascript">
        $("#submitID").on("click",function(){
            $.post("${pageContext.request.contextPath}/HelloServlet?method=login&r="+Math.random(),$("#formID").serialize(),function(jsonDATA){
                if(jsonDATA.success){

                    location.href = "${pageContext.request.contextPath}/HelloServlet?method=findAll";
                }else{

                    location.href = "${pageContext.request.contextPath}/HelloServlet?method=findAll";
                }
            },"json");
        });
    </script>
</body>
</html>