<%@ page import="com.mojafirma.model.chatDao.Tweet" %>
<%@ page import="com.mojafirma.model.service.TweetService" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="utf-8" %>
<html>
<head>
    <title> sda tweeter</title>
</head>
<body>
<p>
    <a href="publish.jsp">Publish tweet</a>
</p>

<table border="1">
    <tr>
        <td wedth="100px">Author</td>
        <td width="150px">Date</td>
        <td width="400px">Message</td>
    </tr>
    <% for (Tweet tweet:service.getMyTweetList()){ %>
       <tr>
           <td><%=tweet.getUser_id()%></td>
           <td><%=tweet.getDate_time() %></td>
           <td><%=tweet.getMessage() %></td>
   <% } %>

</table>
<%--<% MyTweeterService service = MyTweeterService.getInstance();--%>
    <%--for (MeTweet tweet : service.getMyTweetList()) {--%>
        <%--out.print("Tweet author: " + tweet.getAuthor() + "<br>");--%>
        <%--out.print("Tweet message: " + tweet.getTweet() + "<br>");--%>
        <%--out.print("Tweet time: " + tweet.getTime() + "<br>");--%>

    <%--}--%>
<%--%>--%>
</body>
</html>