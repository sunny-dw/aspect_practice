import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Aspect
public class LoggingAspect {
    @Before("@annotation(Loggable)")
    public void beforeMethodExecution(JoinPoint joinPoint) {
        System.out.println("Logging before method execution: " + joinPoint.getSignature().getName());
    }

    @After("@annotation(Loggable)")
    public void afterMethodExecution(JoinPoint joinPoint) {
        System.out.println("Logging after method execution: " + joinPoint.getSignature().getName());
    }
}