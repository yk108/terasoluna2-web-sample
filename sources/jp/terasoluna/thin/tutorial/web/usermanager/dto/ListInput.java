package jp.terasoluna.thin.tutorial.web.usermanager.dto;

/**
 * 
 * �ꗗ�f�[�^�擾�����̓��̓N���X
 *
 */
public class ListInput {

    /**
     * �\���s���B
     */
    private String row = null;
    
    /**
     * �J�n�C���f�b�N�X�B
     */
    private String startIndex = null;
    
    /**
     * �\���s����ԋp����B
     * @return �\���s��
     */
    public String getRow() {
        return row;
    }

    /**
     * �\���s����ݒ肷��B
     * @param row �\���s��
     */
    public void setRow(String row) {
        this.row = row;
    }
    
    /**
     * �J�n�C���f�b�N�X��ԋp����B
     * @return �J�n�C���f�b�N�X
     */
    public String getStartIndex() {
        return startIndex;
    }
    
    /**
     * �J�n�C���f�b�N�X��ݒ肷��B
     * @param startIndex �J�n�C���f�b�N�X
     */
    public void setStartIndex(String startIndex) {
        this.startIndex = startIndex;
    }
}