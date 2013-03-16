<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<div id="content">

	<h2>
		<s:text name="advancedseek.header" />
	</h2>

	<s:form id="advancedSeek" name="publicAdvancedSeek"
		action="PublicAdvancedSeek" theme="simple">
		<s:text name="advancedseek.title" />
		<s:textfield name="title" />

		<s:text name="advancedseek.subject" />
		<s:textfield name="subject" />

		<s:text name="advancedseek.author" />
		<s:textfield name="author" />

		<s:actionerror />
		<s:submit key="advancedseek.submit" />
	</s:form>

	<div id="back">

		<security:authorize access="hasRole('ROLE_AUTHOR')">
			<s:url id="loguedHome" action="loguedHome" />
			<s:a href="%{loguedHome}">
				<s:text name="global.back" />
			</s:a>
		</security:authorize>

		<security:authorize access="anonymous">
			<s:url id="loadHome" action="loadHome" />
			<s:a href="%{loadHome}">
				<s:text name="global.back" />
			</s:a>
		</security:authorize>
	</div>

</div>