package planner;

import necesse.engine.registries.ObjectRegistry;
import necesse.engine.registries.TileRegistry;
import planner.models.PlannerFenceObject;
import planner.models.PlannerPathObject;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.inventory.recipe.Recipes;
import planner.models.PlannerWallObject;

@ModEntry
public class PlannerMod {

    private static Config config;
    public void preInit() {
        System.out.println("Pre-Init Planner Mod...");
        config = new Config();
    }

    public void init() {
        System.out.println("Starting Planner Mod, Hello World!");
        TileRegistry.registerTile(
                "plannerpathtile",
                new PlannerPathObject(),
                0,
                true);
        ObjectRegistry.registerObject(
                "plannerwall",
                new PlannerWallObject(),
                0,
                true);
        ObjectRegistry.registerObject(
                "plannerfence",
                new PlannerFenceObject(),
                0,
                true);
    }

    public void postInit() {
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerpathtile"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerwall"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerfence"));
    }
}
