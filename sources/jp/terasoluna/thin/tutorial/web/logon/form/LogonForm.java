package jp.terasoluna.thin.tutorial.web.logon.form;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;

/**
 * ���O�I���t�H�[���i�A�N�V�����t�H�[���N���X)
 *
 */
public class LogonForm extends ValidatorActionFormEx {
	/**
     * �V���A���o�[�W����ID�B
     */
    private static final long serialVersionUID = 1L;

    /**
     * ���[�UID�B
     */
    private String userId = null;

    /**
     * ���[�UID��ԋp����B
     * 
     * @return ���[�UID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���[�UID��ݒ肷��B
     * 
     * @param userId ���[�UID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
