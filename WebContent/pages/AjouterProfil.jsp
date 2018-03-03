<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="/struts-tags" prefix="s"%>
	<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	
		<link rel="stylesheet" href="../css/bootstrap.min.css">
		<link rel="stylesheet" href="../css/style.css">
	</head>
	<body>
	<jsp:include page="header.jsp"/>
		<div class="container">
		
		<h1>Ajouter un nouveau profil :</h1>
		<hr>
		
		<a href="./User.jsp">
			<i class=" glyphicon glyphicon-chevron-left"></i> Getsion d'utilisateur
			
		</a>	
			<br>
			<br>
			<br>
			<s:actionmessage/>
			
			<s:form action="Profil" namespace="/p" method="ajouter">
				<table width="60%" align="center" >
				  <tr>
				    <td>
						<s:textfield name="bean.libelle" label="Libelle " cssClass="form-control"/>
				    </td>
				    
				  </tr>
				  <tr>
				    <td>
						<s:textfield name="bean.description" label="Description " cssClass="form-control"/>
				    </td>
				    
				  </tr>
				  <tr>
				  
				  <td></td>
				    <td align="center">
						<button type="submit" Class="btn btn-success"><i class=" glyphicon glyphicon-ok"></i> Ajouter</button>
				    </td>
				    
				  </tr>
				</table>
		</s:form>
		</div>
	</body>
</html>