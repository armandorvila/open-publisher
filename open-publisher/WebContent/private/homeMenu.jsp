<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="menu">
	<ul>
		<li class="actual"><a href="#"><s:text
					name="menu.home" /> </a></li>
		<li><a href="<s:url action="loadProfile"/>"><s:text
					name="menu.profile" /> </a></li>


	</ul>
</div>