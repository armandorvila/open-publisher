<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="content">

	<div id="publicSeek">
		<s:text name="home.text.search" />

		<s:form name="simpleSeek" theme="simple" action="PublicSimpleSeek">
			<s:textfield name="key" />
			<s:fielderror name="key">
				<span class="errorMessage"><s:property value="message" /></span>
				<s:param value="%{'key'}" />
			</s:fielderror>
			<s:submit key="home.search.submit" />
		</s:form>
		<s:url id="loadAdvancedSeek" action="loadPublicAdvancedSeek" />

		<s:a href="%{loadAdvancedSeek}">
			<s:text name="home.text.search.advanced" />
		</s:a>
	</div>

	<s:set name="request_articles" scope="request" value="articles" />
	<jsp:include page="publicArticlesTable.jsp" />


</div>