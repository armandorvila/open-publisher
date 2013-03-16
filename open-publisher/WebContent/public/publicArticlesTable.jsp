<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<h2>
	<s:text name="articles.table.header" />
</h2>

<security:authorize access="hasRole('ROLE_AUTHOR')">
	<display:table name="request_articles" uid="articlesTable" pagesize="5"
		requestURI="loguedHome.xsp">

		<display:setProperty name="basic.msg.empty_list">
			<s:text name="articles.none" />
		</display:setProperty>

		<display:column property="title" titleKey="articles.table.title" />

		<display:column property="subject" titleKey="articles.table.subject" />

		<display:column titleKey="articles.table.details">
			<s:form action="loadPublicArticleDetails">
				<s:hidden name="idArticle" value="%{#attr.articlesTable.id}" />
				<s:submit key="articles.table.details.submit" />
			</s:form>
		</display:column>

	</display:table>

</security:authorize>

<security:authorize access="anonymous">
	<display:table name="request_articles" uid="articlesTable" pagesize="5"
		requestURI="loadHome.xsp">

		<display:setProperty name="basic.msg.empty_list">
			<s:text name="articles.none" />
		</display:setProperty>

		<display:column property="title" titleKey="articles.table.title" />

		<display:column property="subject" titleKey="articles.table.subject" />

		<display:column titleKey="articles.table.details">
			<s:form action="loadPublicArticleDetails">
				<s:hidden name="idArticle" value="%{#attr.articlesTable.id}" />
				<s:submit key="articles.table.details.submit" />
			</s:form>
		</display:column>

	</display:table>
</security:authorize>
