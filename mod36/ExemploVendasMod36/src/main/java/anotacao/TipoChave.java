package anotacao;

import java.lang.annotation.*;

/**
 * @author guilherme.kajimura
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
