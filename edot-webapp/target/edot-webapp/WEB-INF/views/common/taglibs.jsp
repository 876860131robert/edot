<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>
<%@ taglib uri="/WEB-INF/taglibs/ai-tags.tld" prefix="ai"%>


<c:set var="ctx" value="<%=com.asiainfo.frame.utils.WebUtils.getBasePath(request)%>"/>
<c:set var="ctx2" value="<%=com.asiainfo.frame.utils.WebUtils.getBasePath2(request)%>"/>

<script type="text/javascript">
var basePath = "${ctx}";
</script>