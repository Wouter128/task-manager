package be.wouterbiront.taskmanager.application.annotation;

import org.springframework.stereotype.Service;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service // meta-annotation to make it a Spring bean
public @interface UseCase {
}
