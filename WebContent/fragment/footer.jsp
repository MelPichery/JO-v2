<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.tutorial.servlets.*"%> 

<div>
<% 
 	  if(session.getAttribute("username") != null){ 
	  String name =(String)session.getAttribute("username");%> 
	  Hello <%=name %> 

	  <div>
	  	<a class="btn btn-secondary" href="/JOtest/addAthlete">Ajout athlete</a>
	  	<a class="btn btn-secondary" href="/JOtest/logout">Déconnexion</a>
	  </div>
	  <% } %>
</div>	  
<div
  style="background: #E0E0E0; text-align: center; padding: 5px; margin-top: 10px;">
  @Copyright monsite.com
 
</div>
 