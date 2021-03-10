import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
import com.sss.model.Student;
 
public class StudentTest {
 
	public static void main(String[] args) {
		
		BeanFactory beanFactory = null;
		
		try {
			
			Resource resource = new ClassPathResource("ApplicationContext.xml");
			beanFactory = new XmlBeanFactory(resource);
			
			Object object = beanFactory.getBean("student");
			Message student = (Student)object;
		
			System.out.println(message.getStudentId()+"\t"+student.getStudent());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
