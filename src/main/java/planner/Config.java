package planner;

import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;


public class Config {

    public Recipe getPlannerCraftingRecipe(String resultStringID) {
        return new Recipe(
            resultStringID,
            100,
            RecipeTechRegistry.NONE,
            new Ingredient[]{
                new Ingredient("anylog", 1),
            }
        );
//                new Ingredient("palmlog", 1),
//                new Ingredient("pinelog", 1),
//                new Ingredient("sprucelog", 1),
//                new Ingredient("willowlog", 1),
//                new Ingredient("deadwoodlog", 1),
    }
}