<%@ page import="com.mojafirma.MeTweet" %>
<%@ page import="com.sdatweeter.servise.MyTweeterService" %>
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
<%! MyTweeterService service=MyTweeterService.getInstance();%>
<table border="1">
    <tr>
        <td wedth="100px">Author</td>
        <td width="150px">Date</td>
        <td width="400px">Message</td>
    </tr>
    <% for (MeTweet tweet:service.getMyTweetList()){ %>
       <tr>
           <td><%=tweet.getAuthor()%></td>
           <td><%=tweet.getTime() %></td>
           <td><%=tweet.getTweet() %></td>
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