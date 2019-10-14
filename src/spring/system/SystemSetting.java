package spring.system;
//进入系统时，完成系统初始化操作
public class SystemSetting {

	String charset;
	
	public SystemSetting()
	{
		System.out.println("系统初始化....................start");
		
		charset = "utf-8";
		
		System.out.println("系统初始化....................end");
		
	}
	
}
