<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="footer">

	<p>
		<span id="footer.text"><s:text name="global.pie.author" />
		</span>
		<s:a href="http://www.armandorv.com/">
			armandorv
			</s:a>
	</p>
	<p>
		<span id="count"><s:property
				value="%{#application.visitCounter}" /> Vists</span>
	</p>
</div>