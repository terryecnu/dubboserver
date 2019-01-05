package org.spring.springboot.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;

/**
 * 
 * @author JingjingMa 2018-12-20
 * 
 * dubbo 通用参数配置
 *
 */
@Configuration
public class DubboConfiguration {

	/**
	 * 服务消费方 （特殊参数值配置）
	 * <p>
	 * 特殊说明：
	 * 1. 此处的配置参数是全局的
	 * 2. 如果需要特殊处理，参考示例 @Reference(version = "1.0.0", timeout = 10000, retries=-1)
	 * </p>
	 * @return
	 */
    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(12000);//请求超时时间
        consumerConfig.setRetries(-1);//失败重试次数-1【解决服务端幂等性，暂时使用此种方式处理】 （参考源码 com.alibaba.dubbo.rpc.cluster.support.FailoverClusterInvoker，com.alibaba.dubbo.config.AbstractConfig）
        //consumerConfig.setCheck(false);//服务检查（调试kafka等不需要后端服务时可以使用）
        return consumerConfig;
    }
	
   
}
