package fi.haagahelia.friends.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface DebtRepository extends CrudRepository<Debt, Long>{
	
	List<Debt> findByReason(@Param("reason") String reason);

}
