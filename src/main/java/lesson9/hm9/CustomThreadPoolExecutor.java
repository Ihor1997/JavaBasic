package lesson9.hm9;

import com.sun.tools.javac.code.Attribute;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomThreadPoolExecutor extends ThreadPoolExecutor {
    @Override
    public void execute(Runnable runnable) {
        Method[] methods = runnable.getClass().getMethods();
        for (Method m : methods) {
            Repeat repeat = m.getAnnotation(Repeat.class);
            if (m.isAnnotationPresent(Repeat.class)) {
                for (int i = 0; i < repeat.runCount(); i++) {
                    runnable.run();
                }
            }
        }
    }
}
