package basics;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class VehicleTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Vehicle vehicle = (Vehicle) beanFactory.getBean("vehicle");
		vehicle.drive();

	}

}
