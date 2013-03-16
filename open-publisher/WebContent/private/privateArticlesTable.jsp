<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<h2>
	<s:text name="articles.table.header" />
</h2>

<display:table name="request_articles" uid="articlesTable" pagesize="5"
	requestURI="loadArticlesOfAuthor">

	<display:setProperty name="basic.msg.empty_list">
		<s:text name="articles.none" />
	</display:setProperty>

	<display:column property="title" titleKey="articles.table.title" />

	<display:column property="subject" titleKey="articles.table.subject" />

	<display:column titleKey="articles.table.details">
		<s:form action="loadPrivateArticleDetails">
			<s:hidden name="idArticle" value="%{#attr.articlesTable.id}" />
			<s:submit key="articles.table.details.submit" />
		</s:form>
	</display:column>
	<display:column titleKey="articles.table.modify">
		<s:form action="loadModifyArticle">
			<s:hidden name="idArticle" value="%{#attr.articlesTable.id}" />
			<s:submit key="articles.table.modify.submit" />
		</s:form>
	</display:column>
	<display:column titleKey="articles.table.delete">
		<s:form action="deleteArticle">
			<s:hidden name="idArticle" value="%{#attr.articlesTable.id}" />
			<s:submit key="articles.table.delete.submit"
				onclick="return window.confirm('Are You sure?');" />
		</s:form>
	</display:column>

</display:table>