package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("vc")
public class DaoImpl0 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteu");
        double data = 53;
        return data;
    }
}
