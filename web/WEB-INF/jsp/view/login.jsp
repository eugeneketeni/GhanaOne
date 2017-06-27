<%--@elvariable id="loginFailed" type="java.lang.Boolean"--%>
<template:loggedOut htmlTitle="Log In" bodyTitle="Log In">
    You must log in to access the customer support site.<br /><br />
    <c:if test="${loginFailed}">
        <b>The username and password you entered are not correct. Please try
            again.</b><br /><br />
    </c:if>
    <form method="POST" action="<c:url value="/login" />">
        Username<br />
        <input type="text" name="username" /><br /><br />
        Password<br />
        <input type="password" name="password" /><br /><br />
        <input type="submit" value="Log In" />
    </form>
    
        <form method="post" action="<c:url value="/forgetPassword" />">
    

        <input type="submit" value="Forget Password?" />
    </form>
    <br>
        </form>
    
        <form method="post" action="<c:url value="/registerUser" />">
    

        <input type="submit" value="Register user" />
    </form>

</template:loggedOut>
