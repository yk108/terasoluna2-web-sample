package jp.terasoluna.thin.tutorial.web.usermanager.blogic;

import java.util.List;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.thin.tutorial.web.usermanager.dto.ListInput;
import jp.terasoluna.thin.tutorial.web.usermanager.dto.ListOutput;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

/**
 * 一覧データを取得するビジネスロジック。
 *
 */
public class ListBLogic implements BLogic<ListInput> {

    /**
     * QueryDAO。
     * Springによりインスタンス生成され設定される。
     */
    private QueryDAO queryDAO = null;
    
    /**
     * 一覧データ取得処理を行う
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

        //件数を取得する
        String totalCount 
            = queryDAO.executeForObject("user.getUserCount", null, String.class);
        
        //一覧データを取得する
        List<SelectUserOutput> users = queryDAO.executeForObjectList("user.getUsers", null, startIndex, row);

        //ビジネスロジックの出力クラスに結果を設定する
        ListOutput output = new ListOutput();
        output.setUsers(users);
        output.setTotalCount(totalCount);
        
        BLogicResult result = new BLogicResult();
        result.setResultObject(output);
        result.setResultString("success");
        
        return result;
    }

    /**
     * QueryDAOを設定する。
     * @param queryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {
        this.queryDAO = queryDAO;
    }
}