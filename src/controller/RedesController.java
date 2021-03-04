package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class RedesController {
	
	 private static final String InputStreamReader = null;
		public RedesController (){
		 super ();
}

	public String os() {
		 String os = System.getProperty("os.name");
		 
	return os;
	}
	public void CallProcess(String process) {
		 try {
			Runtime.getRuntime().exec(process);
		} catch (Exception e) {
		   String msgErro = e.getMessage();
		//   System.err.println(msgErro);
		   if (msgErro.contains("740")) {
			   //cmd /c caminho_do_processo
			   StringBuffer  buffer = new StringBuffer();
			   buffer.append("cmd /c");
			   buffer.append(" ");
			   buffer.append(process);
			   try {
				Runtime.getRuntime().exec(buffer.toString());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			   
		   }else {
			System.err.println(msgErro);}
		   }
		 }
      
public void readProcess (String process) {
	 try {
		Process p =Runtime.getRuntime().exec(process);
		InputStream fluxo = p.getInputStream();
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader (leitor);
		String linha = buffer.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		buffer.close();
		leitor.close();
		fluxo.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void KillProcess (String param) {
	 String cmdPid = "TASKKILL / PID";
	 String cmdNome = "TASKILL / IM";
	 int pid = 0;
	 StringBuffer buffer = new StringBuffer();
	 
	 try {
		 //TASKKILL /PID XXX
		 pid = Integer.parseInt(param);
		 buffer.append(cmdPid);
		 buffer.append(" ");
		 buffer.append(pid);
	 
	 }catch (Exception e) {
		 buffer.append(cmdNome);
		 buffer.append(" ");
		 buffer.append(param);
	 }
try {
	Runtime.getRuntime().exec(buffer.toString());
} catch (IOException e) {
	e.printStackTrace();
}
}

}


	 

