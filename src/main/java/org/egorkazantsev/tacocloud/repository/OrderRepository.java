package org.egorkazantsev.tacocloud.repository;

import org.egorkazantsev.tacocloud.domain.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
