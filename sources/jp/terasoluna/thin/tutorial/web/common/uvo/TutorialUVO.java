package jp.terasoluna.thin.tutorial.web.common.uvo;

import jp.terasoluna.fw.web.UserValueObject;

/**
 * ���[�U�[�o�����[�I�u�W�F�N�g�����N���X�B
 *
 */
public class TutorialUVO extends UserValueObject {

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
     * @return �ێ����郆�[�UID
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