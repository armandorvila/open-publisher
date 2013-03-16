<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-store, mustrevalidate" />
<meta http-equiv="Expires" content="0" />
<link rel="stylesheet" href="/OpenPublisher/css/main.css" />
<title><s:text name="global.title" /></title>
</head>
<body>
	<div id="container">

		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="menu" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />

	</div>

</body>
</html>