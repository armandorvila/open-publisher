<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="/tld/c.tld" prefix="c"%>
<%@ taglib uri="/tld/spring-form.tld" prefix="spring"%>
<div id="header">

	<h1>
		<s:text name="global.header.title" />
	</h1>

	<security:authorize access="hasRole('ROLE_AUTHOR')">

		<div id="user_message">
			<s:text name="privateheader.text" />
			<security:authentication property="name" />
			<s:url id="logout" value="/logout" />
			<s:a href="%{logout}">logout</s:a>
		</div>
	</security:authorize>

	<security:authorize access="anonymous">

		<s:form action="/login" id="formLogin" theme="simple">

			<s:text name="home.login.username" />
			<s:textfield name="j_username" />
			<s:text name="home.login.pass" />
			<s:password name="j_password" />

			<c:if test="${not empty param.error}">
				<span class="errorMessage"><s:text name="login.error" /></span>
				<spring:errors></spring:errors>

			</c:if>

			<s:submit value="login" />

		</s:form>

		<s:url id="loadRegister" action="loadRegister" />
		<s:a href="%{loadRegister}">
			<s:text name="home.login.signUp" />
		</s:a>

	</security:authorize>

</div>