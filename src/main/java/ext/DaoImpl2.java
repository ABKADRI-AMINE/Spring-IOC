package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("vw")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double data = 55;
        return data;
    }
}
