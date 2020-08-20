import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class TestAccount{
	@SuppressWarnings(value={"unchecked"})
	public static void main(String[] args){
		int[] studentnum = {16038,16039};

		for(int i = 0; i<studentnum.length; i++){
			System.out.println("--------------------------------------------------------------");
			System.out.println("				學號:"+studentnum[i]);
			String a = "Account" + studentnum[i];
			doHwOne(a);
		}
	}
	
	@SuppressWarnings(value={"unchecked"})
	public static void doHwOne(String homeworkname){
		try {
			Class clz = Class.forName(homeworkname);
			// 指定參數型態
			Class[] params = {int.class, double.class, double.class};
			Constructor constructor = clz.getDeclaredConstructor(params);
			// 指定參數內容
			Object[] paramObjs = {1122, 20000.0, 4.5};
			// 實例化
			Object obj = constructor.newInstance(paramObjs);

			Method withdraw = clz.getMethod("withdraw", new Class[]{double.class});
			withdraw.invoke(obj, new Object[]{1500.0}); 
			
			Method deposit = clz.getMethod("deposit", new Class[]{double.class});
			deposit.invoke(obj, new Object[]{6000.0}); 
			
			Method getBalance = clz.getMethod("getBalance", new Class[]{});
			System.out.println("Balance: $" + getBalance.invoke(obj, new Object[]{})); 

			Method getMonthlyInterest = clz.getMethod("getMonthlyInterest", new Class[]{});
			System.out.println("Monthly Interest: " + getMonthlyInterest.invoke(obj, new Object[]{}));

			Method getDateCreated = clz.getMethod("getDateCreated", new Class[]{});
			System.out.println("Date Created: " + getDateCreated.invoke(obj, new Object[]{}));
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
        	} catch (SecurityException e) {
			e.printStackTrace();
        	} catch (NoSuchMethodException e) {
			e.printStackTrace();
        	} catch (IllegalArgumentException e) {
			e.printStackTrace();
        	} catch (InstantiationException e) {
			e.printStackTrace();
        	} catch (IllegalAccessException e) {
			e.printStackTrace();
        	} catch (InvocationTargetException e) {
			e.printStackTrace();
        	}
	}
}
