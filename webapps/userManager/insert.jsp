<%@ page contentType="text/html; charset=Windows-31J"%>
<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/terasoluna" prefix="t"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=shift_jis">
<title>�o�^���</title>
</head>

<body>
	<table border="0" style="width: 100%;">
		<tr>
			<td align="center"><html:img module="/"
					page="/image/terasoluna_logo.gif" /></td>
		</tr>
		<tr>
			<td align="center">
				<h2>�o�^���</h2>
			</td>
		</tr>
	</table>

	<!-- �G���[���b�Z�[�W��\������ -->
	<html:errors />

	<!-- �������� --->
	<ts:form action="/userManager/insertBL">

		<fieldset style="border: 2pt solid black; padding: 20px; width: 100%;">
			<legend style="font-weight: bold;"> �o�^������ </legend>
			<p>
			<table border="0" frame="box">
				<tr>
					<td valign="top">
						<table frame="box">
							<tr>
								<td align="center" width="50">�ڋqID</td>
								<td width="200"><html:text name="_userManagerForm"
										property="customerId" maxlength="10" /> <br> <span
									style="font-size: xx-small; color: red">(�K�{����,�����̂�10���ȓ�)</span>
								</td>
							</tr>
							<tr>
								<td align="center" width="50">�ڋq��</td>
								<td width="200"><html:text name="_userManagerForm"
										property="customerName" maxlength="20" /> <br> <span
									style="font-size: xx-small; color: red">(�K�{����,�S�p15�����ȓ�)</span>
								</td>
							</tr>
							<tr>
								<td align="center" width="50">�X�֔ԍ�</td>
								<td width="200"><html:text name="_userManagerForm"
										property="zipNo" maxlength="3" /> <br> <span
									style="font-size: xx-small; color: red">(�K�{����,�n�C�t���Ȃ�)</span></td>
							</tr>
							<tr>
								<td align="center" width="50">�d�b�ԍ�</td>
								<td width="200"><html:text name="_userManagerForm"
										property="tel" maxlength="10" /> <br> <span
									style="font-size: xx-small; color: red">(�n�C�t���Ȃ�)</span></td>
							</tr>
							<tr>
								<td align="center" width="50">���[���A�h���X</td>
								<td width="200"><html:text name="_userManagerForm"
										property="mail" maxlength="10" /> <br> <span
									style="font-size: xx-small; color: red"></span></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td><ts:submit value="�o�^" /></td>
				</tr>
			</table>
		</fieldset>

		<hr>

		<ts:link page="/logon/menuSCR.do">���j���[</ts:link>

	</ts:form>
	<!-- �����܂� -->
</body>
</html:html>