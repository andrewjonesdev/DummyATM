package byaj;

/**
 * Created by student on 6/20/17.
 */

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Integer> {
public Account findOneByAccNumber(String num);
}