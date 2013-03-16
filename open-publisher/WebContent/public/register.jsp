<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="content">

	<h2>
		<s:text name="register.header" />
	</h2>

	<s:form id="register" action="enrollAuthor" theme="simple">
		<s:text name="register.name" />
		<s:textfield name="name" key="register.name.error" />
		<s:fielderror name="name">
			<s:param value="%{'name'}" />
		</s:fielderror>
		<s:text name="register.surname" />
		<s:textfield name="surname" />
		<s:fielderror name="surname">
			<s:param value="%{'surname'}" />
		</s:fielderror>
		<s:text name="register.username" />
		<s:textfield name="username" />
		<s:fielderror name="username">
			<s:param value="%{'username'}" />
		</s:fielderror>
		<s:text name="register.password" />
		<s:password name="password" />
		<s:fielderror name="password">
			<s:param value="%{'password'}" />
		</s:fielderror>
		<s:text name="register.password_confirm" />
		<s:password name="passwordConfirm" />
		<s:fielderror name="passwordConfirm">
			<s:param value="%{'passwordConfirm'}" />
		</s:fielderror>

		<s:submit key="register.submit" />
	</s:form>

	<div id="back">
		<s:url id="loadHome" action="loadHome" />
		<s:a href="%{loadHome}">
			<s:text name="global.back" />
		</s:a>
	</div>

</div>