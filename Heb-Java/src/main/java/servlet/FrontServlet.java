package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.AbstractCommand;
import context.WEBResponseContext;
import context.WebRequestContext;

/**
 * Servlet implementation class FrontServlet
 */
public class FrontServlet extends HttpServlet {


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		WEBResponseContext responseContext=null;
		WebRequestContext requestContext=null;
		try {
			Properties p=new Properties();
			
//			カレントの取得
//			Path p1 = Paths.get("");
//		    Path p2 = p1.toAbsolutePath();
//		    System.out.println("カレントディレクトリ"+p2.toString());
			

		    
//		    ファイルのパスを記述
		    String filePath="C:\\Users\\kota\\git\\HelloWeb\\PropertiesFolder\\command.properties";
//		    System.out.println(filePath);
			p.load(new FileInputStream(filePath));
			System.out.println("servletPath:"+request.getServletPath());
			String commandName=p.getProperty(request.getServletPath());
			
			
//			コマンドの作成
			AbstractCommand command=null;
			Class c=Class.forName(commandName);
			command=(AbstractCommand)c.newInstance();
			command.setRequest(request);
			
//			文字のエンコード
			request.setCharacterEncoding("utf-8");
			
//			parameterから値を取得
			Map<String,String[]> parameterMap=request.getParameterMap();
			

			
//			Commandに値を渡す
			command.setParameter(parameterMap);
			
//			RespponseContextのセット
			command.setEnvironment("WEB");
			
			responseContext=(WEBResponseContext)command.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}



//		問い合わせ結果をセットする
		request.setAttribute("response", responseContext.getResponse());
		request.getRequestDispatcher("/WEB-INF/jsp/"+responseContext.getTarget()+".jsp").forward(request, response);


	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		doPost(req, res);
	}
}
