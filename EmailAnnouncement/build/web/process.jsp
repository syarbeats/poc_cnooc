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
            //ClientResponse restResponse=null;
            com.poc.cnooc.src.EmailAnnouncement data = new com.poc.cnooc.src.EmailAnnouncement();
            
            data.setApprover(request.getParameter("approver"));
            data.setCreator(request.getParameter("creator"));
            data.setDocstatus("Submitted");
            data.setMessages(request.getParameter("body"));
            data.setSubject(request.getParameter("subjects"));
            data.setTo(request.getParameter("to"));
                      
            System.out.println("[PROCESS.JSP]Approver = "+data.getApprover());
                       
            String saveDataResponse=null;
            String sendHTMLResponse=null;
                    
            try {
                    data.setPayload(data);
                    
                    saveDataResponse = data.saveDataToDomino(data, "http://localhost:8086/EmailBroadcast.nsf/api/data/collections/name/Email_Announce?form=Email_Announce");
                    data.setHTMLEmail(data, data.getURL());
                    sendHTMLResponse = data.sendHTMLEmail(data, "http://localhost:8086/mail/syarbeat.nsf/api/mail/outbox");                   

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
            
            out.println("[PROCESS.JSP]Result saveDataResponse : " + saveDataResponse + "\n");
            out.println("[PROCESS.JSP]Result sendHTMLResponse : " + sendHTMLResponse + "\n");
        %>
        <h1>Data has been saved successfully!</h1>
    </body>
</html>
