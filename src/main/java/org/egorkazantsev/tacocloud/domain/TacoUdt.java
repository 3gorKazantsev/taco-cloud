package org.egorkazantsev.tacocloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.List;

@Data
@AllArgsConstructor
@UserDefinedType("taco")
public class TacoUdt {

    private String name;

    private List<IngredientUdt> ingredients;
}
