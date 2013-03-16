<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<div id="content">

	<h2>
		<s:text name="details.header" />
	</h2>

	<ul>
		<li><s:text name="details.title" /> : <s:property
				value="%{article.title}" />
		</li>
		<li><s:text name="details.subject" /> : <s:property
				value="%{article.subject}" />
		</li>
		<li><s:text name="details.description" />:
			<p class="info">
				<s:property value="%{article.description}" />
			</p>
		</li>
		<li><s:text name="details.authorName" /> :<s:property
				value="%{article.author}" />
		</li>
		<li><s:text name="details.file" /> :<s:a href="%{article.url}">
				<s:property value="%{article.fileName}" />
			</s:a>
		</li>
	</ul>
	
		<div id="back">
		<security:authorize access="hasRole('ROLE_AUTHOR')">
			<s:url id="loguedHome" action="loguedHome" />
			<s:a href="%{loguedHome}">
				<s:text name="global.back" />
			</s:a>
		</security:authorize>
		<security:authorize access="anonymous">
			<s:url id="loadHome" action="loadHome" />
			<s:a href="%{loadHome}">
				<s:text name="global.back" />
			</s:a>
		</security:authorize>
	</div>

</div>