<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="content">

	<s:form action="/login" id="formLogin" theme="simple">

		<s:text name="home.login.username" />
		<s:textfield name="j_username" />
		<s:text name="home.login.pass" />
		<s:password name="j_password" />

		<s:submit value="login" />

	</s:form>

</div>