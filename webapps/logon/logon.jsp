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
<title>���O�I�����</title>
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
                ���O�I�����
            </h2>
        </td>
    </tr>
</table>

<ts:form action="/logon/logonBL">
<table border="0" align="center">
  <tr>
    <td>
      UserId�F
    </td>
    <td>
      <html:text property="userId"/>
    </td>
    <td>
      <ts:submit value="���O�I��"/>
    </td>
  </tr>
</table>
</ts:form>

</body>
</html:html>