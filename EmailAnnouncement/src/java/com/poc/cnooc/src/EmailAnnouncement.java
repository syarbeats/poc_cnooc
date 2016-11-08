/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poc.cnooc.src;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;


/**
 *
 * @author Syarbeat
 */
public class EmailAnnouncement {
                       
    String Creator;
    String Subject;
    String Docstatus;
    String To;
    String Approver;
    String Messages;
    String htmlEmail;
    String payload;
    String url;
    String htmlEmailForHelpesk;
    String htmlEmailForBroadcast;
    
    Client client = Client.create();
    ClientResponse restResponse=null;
    WebResource webResource = null;
    
    public void EmailAnnouncement(String creator,String subject, String docstatus,String to,String approver,String messages)
    {
        this.Creator = creator;
        this.Approver = approver;
        this.Docstatus = docstatus;
        this.Messages = messages;
        this.Subject = subject;
        this.To = to;
        
    }
    
    public void setURL(String url)
    {
        this.url = url;
    }
    
    public String getURL()
    {
        return this.url;
    }
    
    public String getCreator()
    {
        return this.Creator;
    }
    
    public void setCreator(String creator)
    {
        this.Creator = creator;
    }
    
    public String getApprover()
    {
        return this.Approver;
    }
    
    public void setApprover(String approver)
    {
        this.Approver = approver;
    }
    
    public String getSubject()
    {
        return this.Subject;
    }
    
    public void setSubject(String subject)
    {
        this.Subject = subject;
    }
    
    public String getDocstatus()
    {
        return this.Docstatus;
    }
    
    public void setDocstatus(String docstatus)
    {
        this.Docstatus = docstatus;
    }
    
    public String getTo()
    {
        return this.To;
    }
    
    public void setTo(String to)
    {
        this.To = to;
    }
    
    public String getMessages()
    {
        return this.Messages;
    }
    
    public void setMessages(String messages)
    {
        this.Messages = messages;
    }
    
    public void setHTMLEmail(EmailAnnouncement data, String dataUrl)
    {
        this.htmlEmail = "MIME-Version: 1.0\n"+
                         "To: "+data.getApprover()+"\n"+                         
                         "Subject: [Email Announcement] Need your approval \n"+
                         "Content-Type: text/html; charset=US-ASCII\n"+
                         "\n"+
                                
                         "<html xmlns=\"http://www.w3.org/1999/xhtml\">"+
                            "<head></head>"+
                            "<body style=\"margin: 0; padding: 0;\">"+
                             "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">"+
                              "<tr>"+
                               "<td>"+
                                 "<table align=\"center\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"border-collapse: collapse;\">"+
                                   "<tr>"+
                                     "<td align=\"center\" bgcolor=\"#70bbd9\" style=\"padding: 40px 0 30px 0;\">"+
                                                    "<font style=\"font-size:12pt;font-weight:bold\"> Email Broadcast Request </font>"+
                                     "</td>"+
                                   "</tr>"+
                                   "<tr>"+
                                     "<td bgcolor=\"#ffffff\" style=\"padding: 40px 30px 40px 30px;\">"+
                                       "<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">"+
                                        "<tr bgcolor=\"green\">"+
                                         "<td align=\"center\">"+
                                          "<font style=\"font-size:12pt;font-weight:bold\">IT & Communication Department - CNOOC</font>"+
                                         "</td>"+
                                        "</tr>"+
                                        "<tr>"+
                                         "<td align=\"center\" style=\"padding: 20px 0 30px 0;\">"+
                                         "<table>"+
                                                            "<tr>"+
                                                                    "<td>"+
                                                                            "<font style=\"font-size:12pt;font-weight:bold\">Nama:</font>"+
                                                                    "</td>"+
                                                                    "<td></td>"+
                                                                    "<td>"+
                                                                            data.getCreator()+
                                                                    "</td>"+
                                                            "</tr>"+
                                                            "<tr>"+
                                                                    "<td>"+
                                                                            "<font style=\"font-size:12pt;font-weight:bold\">NIK:</font>"+
                                                                    "</td>"+
                                                                    "<td></td>"+
                                                                    "<td>"+
                                                                            "007"+
                                                                    "</td>"+
                                                            "</tr>"+
                                                            "<tr>"+
                                                                    "<td>"+
                                                                            "<font style=\"font-size:12pt;font-weight:bold\">Division:</font>"+
                                                                    "</td>"+
                                                                    "<td></td>"+
                                                                    "<td>"+
                                                                            "Operation"+
                                                                    "</td>"+
                                                            "</tr>"+
                                                            "<tr>"+
                                                                    "<td>"+
                                                                            "<font style=\"font-size:12pt;font-weight:bold\">Broadcast Message:</font>"+
                                                                    "</td>"+
                                                                    "<td></td>"+
                                                                    "<td>"+
                                                                            data.getMessages()+
                                                                    "</td>"+
                                                            "</tr>"+
                                                     "</table>"+
                                         "</td>"+
                                        "</tr>"+            
                                       "</table>"+
                                     "</td>"+
                                   "</tr>"+
                                   "<tr>"+
                                     "<td bgcolor=\"#ee4c50\" style=\"padding: 30px 30px 30px 30px;\">"+
                                       "<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">"+
                                         "<td width=\"70%\">"+
                                          "&reg; Email Broadcast Request Application<br/>"+
                                          "PT. Visitek Indonesia"+
                                         "</td>"+
                                         "<td align=\"center\">"+
                                          "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">"+
                                           "<tr>"+
                                            "<td>"+
                                             "<a href=\"http://localhost:8080/EmailAnnouncement/"+"update.jsp?url="+dataUrl+"&creator="+data.getCreator()+"&approver="+data.getApprover()+"&messages="+data.getMessages()+"&to="+data.getTo()+"&subjects="+data.getSubject()+"\">"+
                                              "<font style=\"font-size:12pt;font-weight:bold\">Accept</font>"+
                                             "</a>"+
                                            "</td>"+
                                                            "<td>|</td>"+
                                            "<td >"+
                                             "<a href=\"http://localhost:8080/EmailAnnouncement/"+"update.jsp?url="+dataUrl+"&creator="+data.getCreator()+"&approver="+data.getApprover()+"&messages="+data.getMessages()+"&to="+data.getTo()+"&subjects="+data.getSubject()+"\">"+
                                              "<font style=\"font-size:12pt;font-weight:bold\">Revise</font>"+
                                             "</a>"+
                                            "</td>"+
                                            "<td>|</td>"+
                                            "<td>"+
                                             "<a href=\"http://localhost:8080/EmailAnnouncement/"+"update.jsp?url="+dataUrl+"&creator="+data.getCreator()+"&approver="+data.getApprover()+"&messages="+data.getMessages()+"&to="+data.getTo()+"&subjects="+data.getSubject()+"\">"+
                                              "<font style=\"font-size:12pt;font-weight:bold\">Reject</font>"+
                                             "</a>"+
                                            "</td>"+
                                           "</tr>"+
                                          "</table>"+
                                         "</td>"+
                                       "</table>"+
                                     "</td>"+
                                   "</tr>"+
                                 "</table>"+
                               "</td>"+
                              "</tr>"+
                            "</table>"+
                            "</body>"+
                            "</html>";
    }
    
    public String getHTMLEmail()
    {
        return this.htmlEmail;
    }
    
    public void setPayload(EmailAnnouncement data)
    {
        this.payload = "{\"Creator\":\""+data.getCreator()+"\", \"Subject\":\""+data.getSubject()+"\", \"Docstatus\":\""+data.getDocstatus()+"\", \"To\":\""+data.getTo()+"\", \"Approver\":\""+data.getApprover()+"\", \"Messages\":\""+data.getMessages()+"\"}";
                        
    }
    
    public String getPayload()
    {
        return this.payload;
    }
    
    public String saveDataToDomino(EmailAnnouncement data, String dataUrl)
    {
       
        client.addFilter(new HTTPBasicAuthFilter("Syarbeat", ""));
        webResource = client.resource(dataUrl);
	restResponse = webResource.type("application/json").post(ClientResponse.class, data.getPayload());

	if (restResponse.getStatus() != 201) {
            throw new RuntimeException("Failed : HTTP error code : "
		+ restResponse.getStatus());
        }

	System.out.println("Output from Server .... \n"+restResponse.toString());
	setURL(restResponse.getLocation().toString()) ;                               
	System.out.println(getURL());
        
        return restResponse.toString();
                                                      
    }
    
    public String sendHTMLEmail(EmailAnnouncement data, String dataUrl)
    {
        webResource = client.resource(dataUrl);			                      
        String email= data.getHTMLEmail();
        restResponse = webResource.type("message/rfc822").post(ClientResponse.class, email);

	if (restResponse.getStatus() != 201) {
            throw new RuntimeException("Failed : HTTP error code : "
		+ restResponse.getStatus());
	}

	System.out.println("Output from Server .... \n"+restResponse.toString());
	//dataUrl = restResponse.getLocation().toString() ;
	//System.out.println(dataUrl);
        return restResponse.toString();
    }
    
    public String updateStatus(EmailAnnouncement data,String dataUrl)
    {
        //Client client = Client.create();
        client.addFilter(new HTTPBasicAuthFilter("Syarbeat", "Diah!)@(*"));
        webResource = client.resource(dataUrl);
        //System.out.println("URL= "+url);
       // String input = "{\"Creator\":\""+data.getCreator()+"\", \"Subject\":\""+data.getSubject()+"\", \"Docstatus\":\""+data.getDocstatus()+"\", \"To\":\""+data.getTo()+"\", \"Approver\":\""+data.getApprover()+"\", \"Messages\":\""+data.getMessages()+"\"}";
        
        restResponse = webResource.type("application/json").put(ClientResponse.class, data.getPayload());
	System.out.println("PUT Request= "+data.getPayload());
        System.out.println("Output from Server .... \n"+restResponse.toString());
        
        return restResponse.toString();
    }
    
    public void setHTMLEmailForHelpdesk(EmailAnnouncement data, String dataUrl)
    {
        this.htmlEmailForHelpesk = "MIME-Version: 1.0\n"+
                                   "To: helpdesk.cnooc/EAI@Ningrat \n"+
                                   //"Subject: [Email Announcement] "+data.getSubject()+" \n"+
                                   "Subject: [Email Announcement] Please broadcast this email \n"+
                                   "Content-Type: text/html; charset=US-ASCII\n"+
                                   "\n"+
                                
                                     "<html xmlns=\"http://www.w3.org/1999/xhtml\">"+
                                        "<head></head>"+
                                        "<body style=\"margin: 0; padding: 0;\">"+
                                         "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">"+
                                          "<tr>"+
                                           "<td>"+
                                             "<table align=\"center\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"border-collapse: collapse;\">"+
                                               "<tr>"+
                                                 "<td align=\"center\" bgcolor=\"#70bbd9\" style=\"padding: 40px 0 30px 0;\">"+
                                                                "<font style=\"font-size:12pt;font-weight:bold\"> Email Broadcast Request </font>"+
                                                 "</td>"+
                                               "</tr>"+
                                               "<tr>"+
                                                 "<td bgcolor=\"#ffffff\" style=\"padding: 40px 30px 40px 30px;\">"+
                                                   "<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">"+
                                                    "<tr bgcolor=\"green\">"+
                                                     "<td align=\"center\">"+
                                                      "<font style=\"font-size:12pt;font-weight:bold\">IT & Communication Department - CNOOC</font>"+
                                                     "</td>"+
                                                    "</tr>"+
                                                    "<tr>"+
                                                     "<td align=\"center\" style=\"padding: 20px 0 30px 0;\">"+
                                                     "<table>"+
                                                                        "<tr>"+
                                                                                "<td>"+
                                                                                        "<font style=\"font-size:12pt;font-weight:bold\">Nama:</font>"+
                                                                                "</td>"+
                                                                                "<td></td>"+
                                                                                "<td>"+
                                                                                        data.getCreator()+
                                                                                "</td>"+
                                                                        "</tr>"+
                                                                        "<tr>"+
                                                                                "<td>"+
                                                                                        "<font style=\"font-size:12pt;font-weight:bold\">NIK:</font>"+
                                                                                "</td>"+
                                                                                "<td></td>"+
                                                                                "<td>"+
                                                                                        "007"+
                                                                                "</td>"+
                                                                        "</tr>"+
                                                                        "<tr>"+
                                                                                "<td>"+
                                                                                        "<font style=\"font-size:12pt;font-weight:bold\">Division:</font>"+
                                                                                "</td>"+
                                                                                "<td></td>"+
                                                                                "<td>"+
                                                                                        "Operation"+
                                                                                "</td>"+
                                                                        "</tr>"+
                                                                        "<tr>"+
                                                                                "<td>"+
                                                                                        "<font style=\"font-size:12pt;font-weight:bold\">Broadcast Message:</font>"+
                                                                                "</td>"+
                                                                                "<td></td>"+
                                                                                "<td>"+
                                                                                        data.getMessages()+
                                                                                "</td>"+
                                                                        "</tr>"+
                                                                 "</table>"+
                                                     "</td>"+
                                                    "</tr>"+            
                                                   "</table>"+
                                                 "</td>"+
                                               "</tr>"+
                                               "<tr>"+
                                                 "<td bgcolor=\"#ee4c50\" style=\"padding: 30px 30px 30px 30px;\">"+
                                                   "<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">"+
                                                     "<td width=\"70%\">"+
                                                      "&reg; Email Broadcast Request Application<br/>"+
                                                      "PT. Visitek Indonesia"+
                                                     "</td>"+
                                                     "<td align=\"center\">"+
                                                      "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">"+
                                                       "<tr>"+
                                                        "<td>"+
                                                         "<a href=\"http://localhost:8080/EmailAnnouncement/"+"helpdesk.jsp?url="+dataUrl+"&creator="+data.getCreator()+"&approver="+data.getApprover()+"&messages="+data.getMessages()+"&to="+data.getTo()+"&subjects="+data.getSubject()+"\">"+
                                                          "<font style=\"font-size:12pt;font-weight:bold\">Broadcast Email<font>"+
                                                         "</a>"+
                                                        "</td>"+
                                                                        "<td>|</td>"+
                                                        "<td >"+

                                                        "</td>"+
                                                        "<td>|</td>"+
                                                        "<td>"+

                                                        "</td>"+
                                                       "</tr>"+
                                                      "</table>"+
                                                     "</td>"+
                                                   "</table>"+
                                                 "</td>"+
                                               "</tr>"+
                                             "</table>"+
                                           "</td>"+
                                          "</tr>"+
                                        "</table>"+
                                        "</body>"+
                                        "</html>";
    }
    
    public String getHTMLEmailForHelpdesk()
    {
        return this.htmlEmailForHelpesk;
    }
    
    public String sendHTMLEmailToHelpdesk(EmailAnnouncement data, String urlEmail)
    {
        webResource = client.resource(urlEmail);
        String email= data.getHTMLEmailForHelpdesk();
                                        
        restResponse = webResource.type("message/rfc822").post(ClientResponse.class, email);

	if (restResponse.getStatus() != 201) {
		throw new RuntimeException("Failed : HTTP error code : "
			+ restResponse.getStatus());
	}

	System.out.println("Status = "+restResponse.getStatus());
        //System.out.println("Output from Server .... \n"+restResponse.toString());
	//String url_data = restResponse.getLocation().toString() ;
	//System.out.println(url_data);
        
        return restResponse.toString();
    }
    
    public void setHTMLEmailForBroadcast(EmailAnnouncement data)
    {
        this.htmlEmailForBroadcast = "MIME-Version: 1.0\n"+
                                   "To: "+data.getTo()+"\n"+
                                   //"Subject: [Email Announcement] "+data.getSubject()+" \n"+
                                   "Subject: [Email Announcement]"+data.getSubject()+"  \n"+
                                   "Content-Type: text/html; charset=US-ASCII\n"+
                                   "\n"+
                                
                                     "<html xmlns=\"http://www.w3.org/1999/xhtml\">"+
                                        "<head></head>"+
                                        "<body style=\"margin: 0; padding: 0;\">"+
                                         "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">"+
                                          "<tr>"+
                                           "<td>"+
                                             "<table align=\"center\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"border-collapse: collapse;\">"+
                                               "<tr>"+
                                                 "<td align=\"center\" bgcolor=\"#70bbd9\" style=\"padding: 40px 0 30px 0;\">"+
                                                                "<font style=\"font-size:12pt;font-weight:bold\"> Email Broadcast Request </font>"+
                                                 "</td>"+
                                               "</tr>"+
                                               "<tr>"+
                                                 "<td bgcolor=\"#ffffff\" style=\"padding: 40px 30px 40px 30px;\">"+
                                                   "<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">"+
                                                    "<tr bgcolor=\"green\">"+
                                                     "<td align=\"center\">"+
                                                      "<font style=\"font-size:12pt;font-weight:bold\">IT & Communication Department - CNOOC</font>"+
                                                     "</td>"+
                                                    "</tr>"+
                                                    "<tr>"+
                                                     "<td align=\"center\" style=\"padding: 20px 0 30px 0;\">"+
                                                     "<table>"+
                                                                                                                                                          
                                                                        "<tr>"+
                                                                                "<td>"+
                                                                                        "<font style=\"font-size:12pt;font-weight:bold\">Broadcast Message:</font>"+
                                                                                "</td>"+
                                                                                "<td></td>"+
                                                                                "<td>"+
                                                                                        data.getMessages()+
                                                                                "</td>"+
                                                                        "</tr>"+
                                                                 "</table>"+
                                                     "</td>"+
                                                    "</tr>"+            
                                                   "</table>"+
                                                 "</td>"+
                                               "</tr>"+
                                               "<tr>"+
                                                 "<td bgcolor=\"#ee4c50\" style=\"padding: 30px 30px 30px 30px;\">"+
                                                   "<table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">"+
                                                     "<td width=\"70%\">"+
                                                      "&reg; Email Broadcast Request Application<br/>"+
                                                      "PT. Visitek Indonesia"+
                                                     "</td>"+
                                                     "<td align=\"center\">"+
                                                      "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">"+
                                                       "<tr>"+
                                                        "<td>"+
                                                         
                                                        "</td>"+                                                                                                                                                                                   
                                                        "<td>"+

                                                        "</td>"+
                                                       "</tr>"+
                                                      "</table>"+
                                                     "</td>"+
                                                   "</table>"+
                                                 "</td>"+
                                               "</tr>"+
                                             "</table>"+
                                           "</td>"+
                                          "</tr>"+
                                        "</table>"+
                                        "</body>"+
                                        "</html>";
    }
    
    public String getHTMLEmailForBroadcast()
    {
        return this.htmlEmailForBroadcast;
    }
    
    public String sendHTMLEmailForBroadcast(EmailAnnouncement data, String urlEmail)
    {
        webResource = client.resource(urlEmail);
        String email= data.getHTMLEmailForBroadcast();
                                        
        restResponse = webResource.type("message/rfc822").post(ClientResponse.class, email);

	if (restResponse.getStatus() != 201) {
		throw new RuntimeException("Sending Email Failed : HTTP error code : "
			+ restResponse.getStatus());
	}

	System.out.println("Status = "+restResponse.getStatus());
        
        return restResponse.toString();
    }
}
