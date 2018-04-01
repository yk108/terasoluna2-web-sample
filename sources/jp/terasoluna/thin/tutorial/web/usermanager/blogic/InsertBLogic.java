package jp.terasoluna.thin.tutorial.web.usermanager.blogic;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.dao.UpdateDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicMessage;
import jp.terasoluna.fw.service.thin.BLogicMessages;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.thin.tutorial.web.usermanager.dto.InsertInput;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

/**
 * �o�^�������s���r�W�l�X���W�b�N�B
 *
 */
public class InsertBLogic implements BLogic<InsertInput> {

	/**
	 * QueryDAO�B Spring�ɂ��C���X�^���X��������ݒ肳���B
	 */
	private QueryDAO queryDAO = null;

	/**
	 * UpdateDAO�B Spring�ɂ��C���X�^���X��������ݒ肳���B
	 */
	private UpdateDAO updateDAO = null;

	/**
	 * �o�^�������s���B
	 */
	public BLogicResult execute(InsertInput param) {
		BLogicResult result = new BLogicResult();

		SelectUserOutput selectUserOutput = queryDAO.executeForObject("user.getUser", param, SelectUserOutput.class);

		// �o�^����ID���d�����Ă�ꍇ�ُ͈폈��������
		if (selectUserOutput != null) {

			// �G���[���b�Z�[�W����
			BLogicMessages messages = new BLogicMessages();
			messages.add("message", new BLogicMessage("errors.input.id.repeat"));
			result.setErrors(messages);

			result.setResultString("failure");
			return result;
		}

		// �o�^����
		updateDAO.execute("user.insertUser", param);

		// ���b�Z�[�W����
		BLogicMessages messages = new BLogicMessages();
		messages.add("message", new BLogicMessage("message.regist", param.getCustomerId()));
		result.setMessages(messages);

		result.setResultString("success");
		return result;
	}

	/**
	 * QueryDAO��ݒ肷��B
	 * 
	 * @param queryDAO
	 */
	public void setQueryDAO(QueryDAO queryDAO) {
		this.queryDAO = queryDAO;
	}

	/**
	 * UpdateDAO��ݒ肷��B
	 * 
	 * @param updateDAO
	 */
	public void setUpdateDAO(UpdateDAO updateDAO) {
		this.updateDAO = updateDAO;
	}

}
