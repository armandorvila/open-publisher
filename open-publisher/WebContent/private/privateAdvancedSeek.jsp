<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="content">

	<s:hidden name="idAuthor" />

	<h2>
		<s:text name="advancedseek.header" />
	</h2>

	<s:form id="advancedSeek" name="privateAdvancedSeek"
		action="PrivateAdvancedSeek" theme="simple">

		<s:text name="advancedseek.title" />
		<s:textfield name="title" />
		<s:text name="advancedseek.subject" />
		<s:textfield name="subject" />
		<s:actionerror />
		<s:submit key="advancedseek.submit" />
	</s:form>

	<div id="back">
		<s:url id="loadOwnArticles" action="loadOwnArticles" />
		<s:a href="%{loadOwnArticles}">
			<s:text name="global.back" />
		</s:a>

	</div>

</div>