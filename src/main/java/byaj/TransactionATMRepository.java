package byaj;

/**
 * Created by student on 6/20/17.
 */

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionATMRepository extends CrudRepository<TransactionATM, Integer> {
    public List<TransactionATM> findAllByTranAccOrderByTranDateDesc(int tranAcc);
    public List<TransactionATM> findAllByOrderByTranDateDesc();
}