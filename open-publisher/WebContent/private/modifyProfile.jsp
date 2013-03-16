<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="content">

	<h2>
		<s:text name="modify.profile.header" />
	</h2>

	<s:form action="modifyProfile" theme="simple">
		<s:text name="modify.profile.name" />
		<s:textfield name="name" value="%{#session.author.name}"/>
		<s:fielderror name="name">
			<s:param value="%{'name'}" />
		</s:fielderror>
		<s:text name="modify.profile.surname" />
		<s:textfield name="surname" value="%{#session.author.surname}"/>
		<s:fielderror name="surname">
			<s:param value="%{'surname'}" />
		</s:fielderror>
		<s:submit name="modify.profile.submit" />
	</s:form>

	<div id="back">
		<s:url id="loadProfile" action="loadProfile" />
		<s:a href="%{loadProfile}">
			<s:text name="global.back" />
		</s:a>
	</div>

</div>