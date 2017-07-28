package JL_mybatis;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ━━━━━━━━━━━━神兽出没━━━━━━━━━━━━━
 *　　　　　　　　┏┓　　　┏┓+ +
 *　　　　　　　┏┛┻━━━┛┻┓ + +
 *　　　　　　　┃　　　　　　　┃ 　
 *　　　　　　　┃　　　━　　　┃ ++ + + +
 *　　　　　　 ████━████ ┃+
 *　　　　　　　┃　　　　　　　┃ +
 *　　　　　　　┃　　　┻　　　┃
 *　　　　　　　┃　　　　　　　┃ + +
 *　　　　　　　┗━┓　　　┏━┛
 *　　　　　　　　　┃　　　┃　　　　　　　　　　　
 *　　　　　　　　　┃　　　┃ + + + +
 *　　　　　　　　　┃　　　┃　　　　Code is far away from bug with the animal protecting　　　　　　　
 *　　　　　　　　　┃　　　┃ + 　　　　神兽保佑,代码无bug　　
 *　　　　　　　　　┃　　　┃		by:JiangL
 *　　　　　　　　　┃　　　┃　　+　　　　　　　2017年7月28日22:46:18　　
 *　　　　　　　　　┃　 　　┗━━━┓ + +
 *　　　　　　　　　┃ 　　　　　　　┣┓
 *　　　　　　　　　┃ 　　　　　　　┏┛
 *　　　　　　　　　┗┓┓┏━┳┓┏┛ + + + +
 *　　　　　　　　　　┃┫┫　┃┫┫
 *　　　　　　　　　　┗┻┛　┗┻┛+ + + +
 */
public class JL_mybatis {
	/**
	 * 静态方法私有方法
	 * @param mybatis_config_source Mybatis配置xml文件的路径
	 * @return
	 */
	private static SqlSessionFactory getFactory() {
		String resource = "mybatis_config.xml";
		InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		return factory;
	}
	
	/**
	 * 不带参数的sql查询
	 * @param sql_source SQL语句对应的ID
	 * @return
	 */
	public static <T> List<T> query(String sql_source) {
		SqlSession session = getFactory().openSession();
		List<T> list = session.selectList(sql_source);
		session.close();
		return list;
	}
	
	/**
	 * 带参数的sql查询
	 * @param sql_source SQL语句对应的ID
	 * @param params Map<String, Object>
	 * @return
	 */
	public static <T> List<T> query(String sql_source,Map<String, Object> params) {
		SqlSession session = getFactory().openSession();
		List<T> list = session.selectList(sql_source, params);
		session.close();
		return list;
	}
	
	/**
	 * 不带参数的插入sql
	 * @param sql_source SQL语句对应的ID
	 * @return
	 */
	public static int insert(String sql_source) {
		SqlSession session = getFactory().openSession();
		int count = session.insert(sql_source);
		session.commit();
		session.close();
		return count;
	}
	
	/**
	 * 带参数的插入sql
	 * @param sql_source SQL语句对应的ID
	 * @param params Map<String, Object>
	 * @return
	 */
	public static int insert(String sql_source,Map<String, Object> params) {
		SqlSession session = getFactory().openSession();
		int count = session.insert(sql_source, params);
		session.commit();
		session.close();
		return count;
	}
	
	/**
	 * 不带参数的删除sql
	 * @param sql_source SQL语句对应的ID
	 * @return
	 */
	public static int delete(String sql_source) {
		SqlSession session = getFactory().openSession();
		int count = session.delete(sql_source);
		session.commit();
		session.close();
		return count;
	}
	
	/**
	 * 带参数的删除sql
	 * @param sql_source SQL语句对应的ID
	 * @param params Map<String, Object>
	 * @return
	 */
	public static int delete(String sql_source,Map<String, Object> params) {
		SqlSession session = getFactory().openSession();
		int count = session.delete(sql_source, params);
		session.commit();
		session.close();
		return count;
	}
	
	/**
	 * 不带参数的更新sql
	 * @param sql_source SQL语句对应的ID
	 * @return
	 */
	public static int update(String sql_source) {
		SqlSession session = getFactory().openSession();
		int count = session.delete(sql_source);
		session.commit();
		session.close();
		return count;
	}
	
	/**
	 * 带参数的更新sql
	 * @param sql_source SQL语句对应的ID
	 * @param params Map<String, Object>
	 * @return
	 */
	public static int update(String sql_source,Map<String, Object> params) {
		SqlSession session = getFactory().openSession();
		int count = session.delete(sql_source, params);
		session.commit();
		session.close();
		return count;
	}
	
	public static void jar_help() {
		String help1 = "  Jar包使用事项：";
		String help2 = "1.该jar包基于mybatis-3.4.1开发，主要用于简化代码；";
		String help3 = "2.使用该jar包前需创建mybatis配置文件和mapper文件；";
		String help4 = "3.配置文件名称必须是mybatis_config.xml且必须放在src的根目录下；";
		String help5 = "4.不可在jdk1.8以下的环境运行；";
		String help6 = "5.该jar包提供带参和不带参的增删改查共8个方法，直接调用并传入sql在mapper中对应的ID即可";
		String help7 = "              ——by JL 2017-07-28 23:12:51";
		System.out.println(help1);
		System.out.println(help2);
		System.out.println(help3);
		System.out.println(help4);
		System.out.println(help5);
		System.out.println(help6);
		System.out.println(help7);
	}
}
