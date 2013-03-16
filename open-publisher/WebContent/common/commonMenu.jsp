<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>


<div id="menu">
	<ul>
		<li><a href="<s:url action="private/loguedHome"/>"><s:text
					name="menu.home" /> </a></li>
		<security:authorize access="hasRole('ROLE_AUTHOR')">
			<li><a href="<s:url action="private/loadProfile"/>"><s:text
						name="menu.profile" /> </a></li>
		</security:authorize>
	</ul>
</div>