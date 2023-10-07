<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h3>Login</h3>
        <form:form>
            Username: <input type="text" name="username" style="margin-top: 12px"/><br/>
            Password: <input type="password" name="password" style="margin-top: 12px"/><br/>
            <input type="submit" value="Login" style="margin-top: 12px">
        </form:form>
    </body>
</html>