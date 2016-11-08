<%-- 
    Document   : process
    Created on : Dec 15, 2015, 9:14:12 PM
    Author     : Syarbeat
--%>

<%@ page import="com.sun.jersey.api.client.Client"%>
<%@ page import="com.sun.jersey.api.client.ClientResponse"%>
<%@ page import="com.sun.jersey.api.client.WebResource"%>
<%@ page import="java.util.StringTokenizer"%>
<%@ page import="com.sun.jersey.api.client.filter.HTTPBasicAuthFilter"%>

<%
            
            com.poc.cnooc.src.EmailAnnouncement data = new com.poc.cnooc.src.EmailAnnouncement();
            String url= request.getParameter("url");
            
            data.setApprover(request.getParameter("approver"));
            data.setCreator(request.getParameter("creator"));
            data.setDocstatus("Approved");
            data.setMessages(request.getParameter("messages"));
            data.setSubject(request.getParameter("subjects"));
            data.setTo(request.getParameter("to"));
            String updateStatusResponse=null;
            String sendHTMLResponse=null;
            
            try {
                                           
                        data.setPayload(data);
                        System.out.println("Payload from update.jsp = "+data.getPayload());
                        updateStatusResponse = data.updateStatus(data, url);
                        data.setHTMLEmailForHelpdesk(data, url);
                        sendHTMLResponse = data.sendHTMLEmailToHelpdesk(data, "http://localhost:8086/mail/syarbeat.nsf/api/mail/outbox");
                        

		} catch (Exception e) {

			e.printStackTrace();

		} 
        %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            out.println("Result updateStatusResponse : " + updateStatusResponse + "\n");
            out.println("Result sendHTMLResponse     : " + sendHTMLResponse + "\n");
        %>
        <h1>Data has been saved successfully!</h1>
    </body>
</html>
