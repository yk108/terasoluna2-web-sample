package jp.terasoluna.thin.tutorial.web.usermanager.dto;

import java.util.List;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

/**
 * 
 * �ꗗ�f�[�^�擾�����̏o�̓N���X
 *
 */
public class ListOutput {
    
    /**
     * �\���p���[�U���X�g�B
     */
    private List<SelectUserOutput> users = null;

    /**
     * ���[�U���X�g�̑S�����B
     */
    private String totalCount;
    
    /**
     * �\���p���[�U���X�g��ԋp����B
     * @return �\���p���[�U���X�g
     */
    public List<SelectUserOutput> getUsers() {
        return users;
    }

    /**
     * �\���p���[�U���X�g��ݒ肷��B
     * @param users �\���p���[�U���X�g
     */
    public void setUsers(List<SelectUserOutput> users) {
        this.users = users;
    }

    /**
     * ���[�U���X�g�̑S������ԋp����B
     * @return ���[�U���X�g�̑S����
     */
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * ���[�U���X�g�̑S������ݒ肷��B
     * @param totalCount ���[�U���X�g�̑S����
     */
    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }
}
