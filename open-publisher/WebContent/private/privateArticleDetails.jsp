<%@ taglib prefix="s" uri="/struts-tags"%>

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
		<li><s:text name="details.file" /> :<s:a href="%{article.url}">
				<s:property value="%{article.fileName}" />
			</s:a>
		</li>
	</ul>

	<div id="back">
		<s:url id="loadOwnArticles" action="loadOwnArticles" />
		<s:a href="%{loadOwnArticles}">
			<s:text name="global.back" />
		</s:a>
	</div>


</div>