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
<title>�ꗗ�\�����</title>
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
                �ꗗ�\�����
            </h2>
        </td>
    </tr>
</table>

<!-- �������� -->
<ts:pageLinks id="userListPageLinks"
              action="/userManager/listBL" name="_userManagerForm" rowProperty="row"
              totalProperty="totalCount" indexProperty="startIndex"
              currentPageIndex="now" totalPageCount="total"/>
<div style="text-align:center">
<h5>

<bean:write name="now"/>�^<bean:write name="total"/>�i<bean:write name="_userManagerForm" property="totalCount"/>�j

<p>

<bean:write name="userListPageLinks" filter="false"/>

<p>
<table align="center" frame="box" border="1">
    <tr>
        <td width="30"  align="center"><b>�ڋqID</b></td>
        <td width="100" align="center"><b>�ڋq��</b></td>
    </tr>
    <logic:iterate id="userBean" name="_userManagerForm" property="users">
    <tr>
        <td align="center">
          <bean:write name="userBean" property="customerId"/>
        </td>
        <td>
          <bean:write name="userBean" property="customerName"/>
        </td>
           </tr>
    </logic:iterate>
</table>
<p>

<bean:write name="userListPageLinks" filter="false"/>

</h5>

</div>
<!-- �����܂� -->

<hr>

<ts:link page="/logon/menuSCR.do">���j���[</ts:link>

</body>
</html:html>