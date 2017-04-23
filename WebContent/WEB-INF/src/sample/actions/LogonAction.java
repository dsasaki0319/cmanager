package sample.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import sample.bizlogic.UserInfo;
import sample.forms.LogonForm;

/*
 * ログオン処理を行うアクション
 */

public class LogonAction extends Action {

	//Strutsから呼び出されるアクション
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		ActionErrors errors = new ActionErrors();

		//フォーム情報のキャスト
		LogonForm logonform = (LogonForm) form;

		//フォーム情報の取り出し
		String userId = (String) logonform.getUserId();
		String password = (String) logonform.getPassword();

		//ユーザー情報の保持
		UserInfo uinfo = new UserInfo();

		//TODO test
		uinfo.setUsername("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		try{
//			//ユーザー情報を管理するクラスのインスタンスを生成して呼び出す
//			LogonForm logonmgr = new LogonForm();
//			logonmgr.logonCheck(userId, password);
//
//			//ユーザー情報の取り出し
//			uinfo = logonmgr.getUserInfo(userId);
//
//		} catch (IncalidatePasswordException ex) {
//			errors.add(ActionMessages.GLOBAL_MESSAGE,
//					new ActionMessage("error.invalidatepassword"));
//		} catch (UnknownUserException ex) {
//			errors.add(ActionMessages.GLOBAL_MESSAGE,
//					new ActionMessage("error.unknownuser"));
//		} catch (Exception ex) {
//			errors.add(ActionMessages.GLOBAL_MESSAGE,
//					new ActionMessage("error.internal"));
//		}

		//エラーをキャッチした場合Errorsオブジェクトを登録
		if (!errors.isEmpty()){
			saveErrors(request,errors);
			//失敗終了
			return (mapping.getInputForward());
		}

		//エラーなしならユーザー情報を登録
		HttpSession session = request.getSession();
		session.setAttribute("user_key", uinfo);

		//成功終了
		return (mapping.findForward("success"));
	}
}
