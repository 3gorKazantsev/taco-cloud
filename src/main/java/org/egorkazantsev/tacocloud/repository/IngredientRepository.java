package org.egorkazantsev.tacocloud.repository;

import org.egorkazantsev.tacocloud.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
