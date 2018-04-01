package jp.terasoluna.thin.tutorial.web.logon.form;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;

/**
 * ログオンフォーム（アクションフォームクラス)
 *
 */
public class LogonForm extends ValidatorActionFormEx {
	/**
     * シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * ユーザID。
     */
    private String userId = null;

    /**
     * ユーザIDを返却する。
     * 
     * @return ユーザID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザIDを設定する。
     * 
     * @param userId ユーザID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
