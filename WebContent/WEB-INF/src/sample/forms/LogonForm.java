package sample.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

/*
 * ログインフォームに対応するActionFormクラス
 *
 * 参照元
 * http://www.arksystems.co.jp/closeupit/struts/article003_05.html
 */

public class LogonForm extends ActionForm {

	/**/
	private static final long serialVersionUID = 2989322927308164518L;

	//ログオン名
	protected String userId = null;

	//パスワード
	protected String password = null;

	//パスワードを返す
	public String getPassword() {return (this.password);}

	//パスワードを設定
	public void setPassword(String password) {this.password = password;}

	//ログオン名を返す
	public String getUserId() {return (this.userId);}

	//ログオン名を設定
	public void setUserId(String userId) {this.userId = userId;}

	//フォームの入力文字列を判断
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();

		//nullチェック(ユーザー名)
		if((userId == null) || (userId.length() < 1))
			errors.add(ActionMessages.GLOBAL_MESSAGE,
					new ActionMessage("error.userId.required"));

		//nullチェック(パスワード)
		if((password == null) || (password.length() < 1))
			errors.add(ActionMessages.GLOBAL_MESSAGE,
					new ActionMessage("error.password.required"));

		return errors;
	}
}