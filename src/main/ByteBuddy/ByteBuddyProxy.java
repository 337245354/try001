/*
package ByteBuddy;

import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class ByteBuddyProxy {

    public static <T> T getProxy(Class clazz) throws Exception {

        DynamicType.Unloaded<?> dynamicType = new ByteBuddy()
                .subclass(clazz)
                .method(ElementMatchers.<MethodDescription>named("queryUserInfo"))
                .intercept(MethodDelegation.to(InvocationHandler.class))
                .make();

        return (T) dynamicType.load(Thread.currentThread().getContextClassLoader()).getLoaded().newInstance();
    }

}

    @RuntimeType
    public static Object intercept(@Origin Method method, @AllArguments Object[] args, @SuperCall Callable<?> callable) throws Exception {
        System.out.println(method.getName() + " 你被代理了，By Byte-Buddy！");
        return callable.call();
    }

    @Test
    public void test_ByteBuddyProxy() throws Exception {
        IUserApi userApi = ByteBuddyProxy.getProxy(UserApi.class);
        String invoke = userApi.queryUserInfo();
        logger.info("测试结果：{}", invoke);
    }

*/
/**
 * 测试结果：
 *
 * queryUserInfo 你被代理了，By Byte-Buddy！
 * 20:19:44.498 [main] INFO  org.itstack.interview.test.ApiTest - 测试结果：小傅哥，公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 *
 * Process finished with exit code 0
 */

