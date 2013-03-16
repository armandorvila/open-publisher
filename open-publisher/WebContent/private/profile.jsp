<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="content">

	<s:url id="publish" action="loadPublishArticle" />
	<s:url id="modify" action="loadModifyProfile" />
	<s:url id="query" action="loadOwnArticles" />
	<s:url id="delete" action="deleteProfile" />

	<h2>
		<s:text name="profile.header" />
	</h2>

	<div id="author_info">
		<ul>
			<li><s:text name="profile.author.name" />:<s:property
					value="%{author.name}" /></li>
			<li><s:text name="profile.author.surname" />: <s:property
					value="%{author.surname}" /></li>
			<li><s:text name="profile.author.date" /> :<s:property
					value="%{author.dateOfJoining}" /></li>
		</ul>
	</div>

	<div id="author_options">

		<ul>
			<li><s:a href="%{publish}">
					<s:text name="profile.option.publish" />
				</s:a>
			</li>
			<li><s:a href="%{query}">
					<s:text name="profile.option.query" />
				</s:a>
			</li>
			<li><s:a href="%{modify}">
					<s:text name="profile.option.modify" />
				</s:a>
			</li>
			<li><s:a href="%{delete}" onclick="return window.confirm('Are You sure?');">
					<s:text name="profile.option.delete" />
				</s:a>
			</li>
		</ul>

	</div>



</div>