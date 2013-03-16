<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="content">
 
	<s:set name="request_articles" scope="request" value="articles" />

	<div id="privateSeek">
		<s:text name="home.text.search" />

		<s:form name="simpleSeek" action="PrivateSimpleSeek" theme="simple">
			
			<s:textfield name="key" />
			<s:fielderror name="key">
				<s:param value="%{'key'}" />
			</s:fielderror>
			<s:submit key="home.search.submit" />
		</s:form>

		<s:url id="loadPrivateAdvancedSeek" action="loadPrivateAdvancedSeek" />

		<s:a href="%{loadPrivateAdvancedSeek}">
			<s:text name="home.text.search.advanced" />
		</s:a>
	</div> 

	 <jsp:include page="privateArticlesTable.jsp" /> 



</div>