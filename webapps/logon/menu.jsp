<%@ page contentType="text/html; charset=Windows-31J"%>
<%@ taglib uri="/struts-html" prefix="html" %>
<%@ taglib uri="/struts-bean" prefix="bean" %>
<%@ taglib uri="/struts-logic" prefix="logic" %>
<%@ taglib uri="/terasoluna-struts" prefix="ts" %>
<%@ taglib uri="/terasoluna" prefix="t" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=shift_jis">
<title>���j���[���</title>
</head>

<body>
<table border="0" style="width:100%;">
    <tr>
        <td align="center">
            <html:img module="/" page="/image/terasoluna_logo.gif" />
        </td>
    </tr>
    <tr>
        <td align="center">
            <h2>
                ���j���[���
            </h2>
            �悤���� <bean:write name="USER_VALUE_OBJECT"
              property="userId" scope="session" ignore="true"/> ����B
        </td>
    </tr>
</table>

<ts:form action="/logon/menuDSP">
<table border="0">
  <tr>
    <td>
        <ts:submit value="�o�^���" property="forward_insert" />
    </td>
  </tr>
  <tr>
    <td>
        <ts:submit value="�ꗗ���" property="forward_list" />
    </td>
  </tr>
</table>
</ts:form>


<hr>
<ts:link action="/logon/logoff.do" >���O�I�t</ts:link>

</body>
</html:html>