<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
    <head>
        <title>首页</title>
        <meta charset="utf-8">
    </head>
    <body>
        <s:form action="customer_save" namespace="/customer" method="post">
            <s:textfield name="custName" cssStyle="WIDTH: 180px" label="客户名称"/>
            <s:textfield name="custPhone" cssStyle="WIDTH: 180px" label="固定电话"/>
            <s:textfield name="custMobile" cssStyle="WIDTH: 180px" label="移动电话"/>
            <s:submit value="保存"/>
        </s:form>
    </body>
</html>