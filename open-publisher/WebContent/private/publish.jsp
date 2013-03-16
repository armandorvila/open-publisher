<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="content">

	<h2>
		<s:text name="publish.header" />
	</h2>

	<s:form id="newArticleInfo" action="publishArticle" theme="simple"
		enctype="multipart/form-data">
		<s:text name="publish.name" />
		<s:textfield name="title" />
		<s:fielderror name="title">
			<s:param value="%{'title'}" />
		</s:fielderror>
		<s:text name="publish.subject" />
		<s:textfield name="subject" />
		<s:fielderror name="subject">
			<s:param value="%{'subject'}" />
		</s:fielderror>
		<s:text name="publish.description" />
		<s:textarea name="description" />
		<s:fielderror name="description">
			<s:param value="%{'description'}" />
		</s:fielderror>
		<s:text name="publish.file" />
		<s:file name="newFile" />
		<s:fielderror name="file">
			<s:param value="%{'file'}" />
		</s:fielderror>
		
		<s:submit key="publish.submit" />
	</s:form>



</div>