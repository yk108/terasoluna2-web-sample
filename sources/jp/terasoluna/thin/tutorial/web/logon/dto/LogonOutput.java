package jp.terasoluna.thin.tutorial.web.logon.dto;

import jp.terasoluna.thin.tutorial.web.common.uvo.TutorialUVO;

public class LogonOutput {
	/**
	 * ���O�C������ێ�����UserValueObject
	 */
	private TutorialUVO uvo = null;

	/**
	 * UserValueObject��ԋp����B
	 * 
	 * @return UserValueObject
	 */
	public TutorialUVO getUvo() {
		return uvo;
	}

	/**
	 * UserValueObject��ݒ肷��B
	 * 
	 * @param uvo
	 *            UserValueObject
	 */
	public void setUvo(TutorialUVO uvo) {
		this.uvo = uvo;
	}
}
