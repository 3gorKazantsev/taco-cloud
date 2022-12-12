package org.egorkazantsev.tacocloud.repository;

import org.egorkazantsev.tacocloud.domain.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder tacoOrder);
}
