package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.utils.ReferenceConfigCache;
import org.apache.dubbo.rpc.service.GenericService;

public class GenericApplication {

    public static void main(String[] args) {

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");

        ReferenceConfig<GenericService> reference = new ReferenceConfig();

        ApplicationConfig application = new ApplicationConfig();
        application.setName("generic-consumer");
        reference.setApplication(application);
        reference.setRegistry(registry);
        reference.setInterface("org.apache.dubbo.demo.GreetingService");
        // 声明为泛化接口
        reference.setGeneric(true);

        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(reference);

        // 直接调用
        Object result = genericService.$invoke("hello", new String[] { "java.lang.String" },
                new Object[] { "world" });
        System.out.println(result);
    }

}
