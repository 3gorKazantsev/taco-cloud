package org.egorkazantsev.tacocloud.utils;

import org.egorkazantsev.tacocloud.domain.Ingredient;
import org.egorkazantsev.tacocloud.domain.IngredientUdt;
import org.egorkazantsev.tacocloud.domain.Taco;
import org.egorkazantsev.tacocloud.domain.TacoUdt;

public class UdtUtils {

    public static IngredientUdt toIngredientUDT(Ingredient ingredient) {
        return new IngredientUdt(ingredient.getName(), ingredient.getType());
    }

    public static TacoUdt toTacoUdt(Taco taco) {
        return new TacoUdt(taco.getName(), taco.getIngredients());
    }
}
