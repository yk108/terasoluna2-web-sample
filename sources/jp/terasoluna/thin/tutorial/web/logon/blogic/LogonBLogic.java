package jp.terasoluna.thin.tutorial.web.logon.blogic;

import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.fw.web.UserValueObject;
import jp.terasoluna.thin.tutorial.web.common.uvo.TutorialUVO;
import jp.terasoluna.thin.tutorial.web.logon.dto.LogonInput;
import jp.terasoluna.thin.tutorial.web.logon.dto.LogonOutput;

public class LogonBLogic implements BLogic<LogonInput> {
	 /**
     * ���O�I���������s���B
     *
     * @param param ���͂��ꂽ���[�UID��ێ�����Map
     * @return BLogicResult ���O�I���������ʂ�ێ�����BLogicResult
     */
    public BLogicResult execute(LogonInput param) {

        //���͂��ꂽ���[�UID�̎擾
        String userId = param.getUserId();

        //UVO�̐���
        TutorialUVO uvo = (TutorialUVO) UserValueObject.createUserValueObject();

        //���[�UID��UVO�ɐݒ肷��B
        uvo.setUserId(userId);

        //UVO��ԋp�p�̃N���X�ɐݒ肷��B
        LogonOutput output = new LogonOutput();
        output.setUvo(uvo);

        //BLogicResult�̐����A�ݒ�
        BLogicResult result = new BLogicResult();
        result.setResultObject(output);
        result.setResultString("success");

        return result;
    }
}
