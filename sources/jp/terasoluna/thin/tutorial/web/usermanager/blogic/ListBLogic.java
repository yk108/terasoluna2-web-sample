package jp.terasoluna.thin.tutorial.web.usermanager.blogic;

import java.util.List;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.thin.tutorial.web.usermanager.dto.ListInput;
import jp.terasoluna.thin.tutorial.web.usermanager.dto.ListOutput;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

/**
 * �ꗗ�f�[�^���擾����r�W�l�X���W�b�N�B
 *
 */
public class ListBLogic implements BLogic<ListInput> {

    /**
     * QueryDAO�B
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private QueryDAO queryDAO = null;
    
    /**
     * �ꗗ�f�[�^�擾�������s��
     */
    public BLogicResult execute(ListInput param) {
        
        String strIndex = param.getStartIndex();
        String strRow = param.getRow();

        int startIndex = 0;
        int row = 10;
        if (strIndex != null) {
            startIndex = Integer.parseInt(strIndex);
            
        }
        
        if (strRow != null) {
            row = Integer.parseInt(strRow);
        }

        //�������擾����
        String totalCount 
            = queryDAO.executeForObject("user.getUserCount", null, String.class);
        
        //�ꗗ�f�[�^���擾����
        List<SelectUserOutput> users = queryDAO.executeForObjectList("user.getUsers", null, startIndex, row);

        //�r�W�l�X���W�b�N�̏o�̓N���X�Ɍ��ʂ�ݒ肷��
        ListOutput output = new ListOutput();
        output.setUsers(users);
        output.setTotalCount(totalCount);
        
        BLogicResult result = new BLogicResult();
        result.setResultObject(output);
        result.setResultString("success");
        
        return result;
    }

    /**
     * QueryDAO��ݒ肷��B
     * @param queryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {
        this.queryDAO = queryDAO;
    }
}