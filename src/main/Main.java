
import cglib.TesstProxy;
import observer.BinaryObserver;
import observer.HexaObserver;
import observer.OctalObserver;
import observer.Subject;

import java.io.ObjectInputFilter;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    private static ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(
            () -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    public static void main(String[] args) {
        while (true) {
            new Thread(() -> {
                String dateStr = threadLocal.get().format(new Date());
                try {
                    Date parseDate = threadLocal.get().parse(dateStr);
                    String dateStrCheck = threadLocal.get().format(parseDate);
                    boolean equals = dateStr.equals(dateStrCheck);
                    if (!equals) {
                        System.out.println(equals + " " + dateStr + " " + dateStrCheck);
                    } else {
                        System.out.println(equals);
                    }
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }
            }).start();
        }
    }
}

