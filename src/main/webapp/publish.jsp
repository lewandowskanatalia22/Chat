<%@ page import="com.mojafirma.MeTweet" %>
<%@ page import="com.google.common.base.Strings" %>
<%@ page import="com.sdatweeter.servise.MyTweeterService" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.sdateeter.servelets.PublishServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String error=request.getParameter("error");
    if (error != null && "".equals(error)){
        out.println("brak autora i / lub wiadomości ");
    }
    String author ="";
    for (Cookie cookie: request.getCookies()){
        if (PublishServlet.AUTHOR_COOKIE.equals(cookie.getName())){
            author=cookie.getValue();
        }
    }
%>
<%! MyTweeterService service=MyTweeterService.getInstance(); %>
<form action="/publish.servlet" method="post">
    <ul>
        <li>Author <input name="author" value="<%= author %>"></li>
        <li>Message: <textarea name="message"></textarea></li>

    </ul>
    <input type="submit" value="Submit">
</form>
<%--<%--%>
    <%--String author = request.getParameter("author");--%>
    <%--String message = request.getParameter("message");--%>

    <%--if (Strings.isNullOrEmpty(author)|| Strings.isNullOrEmpty(message)){--%>
        <%--out.print("brak autora lub wiadomości.");--%>
    <%--} else {--%>
        <%--MeTweet meTweet = new MeTweet(author, message, System.currentTimeMillis());--%>
        <%--service.addTweet(meTweet);--%>

    <%--}--%>
<%--%>--%>

</body>
</html>
