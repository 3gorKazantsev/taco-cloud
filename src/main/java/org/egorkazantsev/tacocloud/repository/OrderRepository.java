package org.egorkazantsev.tacocloud.repository;

import org.egorkazantsev.tacocloud.domain.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, String> {

}
