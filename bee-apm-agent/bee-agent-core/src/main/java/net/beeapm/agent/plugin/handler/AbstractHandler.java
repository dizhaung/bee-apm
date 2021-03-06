package net.beeapm.agent.plugin.handler;


import net.beeapm.agent.log.Log;
import net.beeapm.agent.model.Span;

/**
 * Created by yuan on 2018/7/30.
 */
public abstract class AbstractHandler implements IHandler {

    public void logBeginTrace(String className,String methodName, Span span, Log log){
        log.trace("[begin]{}.{} type={}", className, methodName, span.getType());
    }
    public void logEndTrace(String className, String methodName, Span span, Log log){
        log.trace("[end]{}.{} type={}", className, methodName, span.getType());
    }

    public void calculateSpend(Span span){
        if(span != null){
            span.setSpend(System.currentTimeMillis() - span.getTime().getTime());
        }
    }

}
