package jp.terasoluna.thin.tutorial.web.logon.dto;

/**
 * ���O�I�������̓��̓N���X.
 *
 */
public class LogonInput {

    /**
     * ���[�UID
     */
    private String userId = null;

    /**
     * ���[�UID��ԋp����B
     * @return ���[�UID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���[�UID��ݒ肷��B
     * @param userId ���[�UID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
