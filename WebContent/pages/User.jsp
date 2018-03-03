
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
<body >
	<jsp:include page="header.jsp"/>
	<div class="container">
		<h1>Getion d'utilisateur :</h1>
		<hr>
		<a href="../index.jsp">
			<i class=" glyphicon glyphicon-chevron-left"></i> Accueil
		</a>	
		<br><br>
		
		<div class="row">
				<s:form action="User" namespace="/p" method="chercher" theme="simple">
					<p align="center" class="p1 alert alert-success lead" >Entrer si-dessous l'ID, le nom ou le login de l'utilisateur que vous chercher !!	</p>
					<table align="center">
						<tr>
							<td class="labelUsr"><strong>ID</strong><s:textfield name="bean.id" cssClass="form-control"/></td>
							<td class="labelUsr"><strong>Nom</strong><s:textfield name="bean.nom" cssClass="form-control "/></td>
							<td class="labelUsr"><strong>Login</strong><s:textfield name="bean.login" cssClass="form-control"/></td>
							<td ><button type="submit" Class="btn btn-danger btnUser"><i class=" glyphicon glyphicon-search btnChercher"></i> Rechercher</button></td>
						</tr>
					</table>
					
				</s:form>
		</div>
		<br><br>
		<h3 align="center">Liste de tous les utilisateurs
			<s:form action="User" namespace="/p" method="chercher">
				<table align="center">
					<tr>
						<td ><button type="submit" Class="btn btn-warning btnUser"><i class=" glyphicon glyphicon-search btnChercher"></i></button></td>
						<td><s:hidden name="bean.id"/></td>
					</tr>
				</table>
			</s:form>
		</h3>
		<hr>
		<table align="right">
			<tr>
				<td ><a href="../pages/AjouterUser.jsp"  Class="btn btn-success btnU" role="button"><i class=" glyphicon glyphicon-plus btnChercher"></i> Ajouter un nouvel utilisateur</a></td>
			</tr>
		</table>
		<br><br>
		<display:table name="listP" requestURI="User.action" pagesize="3" class="table table-bordered tableUser" decorator="MyDecorator" export="true">
			<display:column property="id" headerClass="clmUser success"></display:column>
			<display:column property="nom" headerClass="clmUser success" sortable="true"></display:column>
			<display:column property="login" headerClass="clmUser success"></display:column>
			<display:column property="password" headerClass="clmUser success"></display:column>
			<display:column property="myLink" title="" headerClass="clmUser success"/>
		</display:table>
	</div>
	<br><br><br><br>
</body>
</html>