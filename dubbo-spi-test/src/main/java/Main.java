import com.dq.Car;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @Author mubi
 * @Date 2021/2/11 13:41
 */
public class Main {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        System.out.println("----dubbo spi");
        // 通过反射实例化
        Car car1 = extensionLoader.getExtension("car1");
        car1.drive();
        // 从缓存中获取
        Car car12 = extensionLoader.getExtension("car1");
        car12.drive();
    }

}
