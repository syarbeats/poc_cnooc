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
            data.setDocstatus("Completed");
            data.setMessages(request.getParameter("body"));
            data.setSubject(request.getParameter("subjects"));
            data.setTo(request.getParameter("to"));
            String updateStatusResponse=null;
            String sendHTMLResponse=null;
            
            try {
                                           
                        data.setPayload(data);
                        System.out.println("[BROADCAST.JSP]Payload when broadcast email = "+data.getPayload());
                        System.out.println("[BROADCAST.JSP] URL = "+ request.getParameter("url"));
                        
                        updateStatusResponse = data.updateStatus(data, url);
                        data.setHTMLEmailForBroadcast(data);
                        sendHTMLResponse = data.sendHTMLEmailForBroadcast(data, "http://localhost:8086/mail/syarbeat.nsf/api/mail/outbox");
                        

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
            out.println("[PROCESS.JSP]Result updateStatusResponse : " + updateStatusResponse + "\n");
            out.println("[PROCESS.JSP]Result sendHTMLResponse     : " + sendHTMLResponse + "\n");
        %>
        <h1>Data has been saved successfully!</h1>
    </body>
</html>
