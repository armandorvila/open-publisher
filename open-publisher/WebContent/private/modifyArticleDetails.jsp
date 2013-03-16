<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="content">
	<h2>
		<s:text name="modify.article.header" />
	</h2>

	<s:form id="oldArticleInfo" action="modifyArticle" theme="simple"
		enctype="multipart/form-data">

		<s:hidden name="idArticle" value="%{article.id}" />
		<s:text name="modify.article.name" />
		<s:textfield name="name" value="%{article.title}" />
		<s:fielderror name="name">
			<s:param value="%{'name'}" />
		</s:fielderror>
		<s:text name="modify.article.subject" />
		<s:textfield name="subject" value="%{article.subject}" />
		<s:fielderror name="subject">
			<s:param value="%{'subject'}" />
		</s:fielderror>
		<s:text name="modify.article.description" />
		<s:textarea name="description" value="%{article.description}" />
		<s:fielderror name="description">
			<s:param value="%{'description'}" />
		</s:fielderror>

		<%-- 		<s:text name="modify.article.file" />
		<s:file name="newFile" />--%>
		<s:submit key="modify.article.submit" /> 

	</s:form>

	<div id="back">
		<s:url id="loadOwnArticles" action="loadOwnArticles" />
		<s:a href="%{loadOwnArticles}">
			<s:text name="global.back" />
		</s:a>
	</div>


</div>