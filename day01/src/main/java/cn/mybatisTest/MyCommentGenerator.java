package cn.mybatisTest;


import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;


/**   
 * @Title: MyCommentGenerator.java 
 * @Package com.fendo.mybatis_generator_plus 
 * @Description:  mybatis generator 自定义comment生成器.
 *                基于MBG 1.3.5
 * @author fendo
 * @date 2017年10月5日 下午3:07:26 
 * @version V1.0   
*/
public class MyCommentGenerator extends DefaultCommentGenerator{
	
	private boolean suppressAllComments;
	
	private boolean addRemarkComments;
	
	public void addConfigurationProperties(Properties properties){
		super.addConfigurationProperties(properties);
		suppressAllComments = isTrue(properties.getProperty(
				PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
		
		addRemarkComments = isTrue(properties.getProperty(
				PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));
	}
	
	public void addFieldComment(Field field,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn){
		if (suppressAllComments) {
			return;
		}
		
		field.addJavaDocLine("/**");
		
		String remarks = introspectedColumn.getRemarks();
		
		if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
			String[] remarkLines = remarks.split(
					System.getProperty("line. separator"));
			for (String remarkLine : remarkLines) {
				field.addJavaDocLine(" * " + remarkLine);
			}
		}
		
		field.addJavaDocLine(" * " + introspectedColumn.getActualColumnName());
		field.addJavaDocLine(" */");
	}

}