package org.egorkazantsev.tacocloud.converter;

import org.egorkazantsev.tacocloud.domain.Ingredient;
import org.egorkazantsev.tacocloud.domain.IngredientUdt;
import org.egorkazantsev.tacocloud.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StringToIngredientUdtConverter implements Converter<String, IngredientUdt> {

    private IngredientRepository ingredientRepo;

    @Autowired
    public StringToIngredientUdtConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public IngredientUdt convert(String id) {
        Optional<Ingredient> ingredient = ingredientRepo.findById(id);
        if (ingredient.isEmpty())
            return null;

        return ingredient
                .map(i -> new IngredientUdt(i.getName(), i.getType()))
                .get();
    }
}
