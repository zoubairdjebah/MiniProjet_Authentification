<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="/struts-tags" prefix="s"%>
	<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<title>Ajouter un utilisateur</title>
	
		<link rel="stylesheet" href="../css/bootstrap.min.css">
		<link rel="stylesheet" href="../css/style.css">
	</head>
	<body>
	<jsp:include page="header.jsp"/>
		<div class="container">
			<h1>Ajouter un nouvel utilisateur :</h1>
			<hr>
			<a href="../pages/User.jsp">
				<i class=" glyphicon glyphicon-chevron-left"></i> Getsion d'utilisateur
			</a>	
				<br>
				<br>
				<br>
				<s:actionmessage/>
				<s:form action="UserAjouter" namespace="/p" method="ajouter">
					<table width="60%" align="center" >
					  <tr>
					    <td>
							<s:textfield name="bean.nom" label="Nom " cssClass="form-control labelStAj"/>
					    </td>
					  </tr>
					  <tr>
					    <td>
							<s:textfield name="bean.login" label="Login " cssClass="form-control labelStAj"/>
					    </td>
					  </tr>
					  <tr>
					    <td>
							<s:textfield name="bean.password" label="Password " cssClass="form-control labelStAj"/>
					    </td>
					  </tr>
					  <tr>
					  <td></td>
					    <td align="center">
							<button type="submit" Class="btn btn-success"><i class=" glyphicon glyphicon-ok"></i> Valider l'ajout</button>
					    </td>
					  </tr>
					</table>
			</s:form>
		</div>
	</body>
</html>