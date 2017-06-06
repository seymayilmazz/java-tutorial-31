import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

/**
 * Created by Şeyma Yılmaz on 6.6.2017.
 */
public class A {

    @Deprecated
    public void sayHello(){

    }

    public void sayHi(){

    }

    public void print(@NotNull Person person){

    }

    @Nullable
    public Person get(){
        return null;
    }
}
