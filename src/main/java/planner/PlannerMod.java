package planner;

import necesse.engine.registries.ObjectRegistry;
import necesse.engine.registries.TileRegistry;
import planner.models.PlannerFenceObject;
import planner.models.PlannerPathObject;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.inventory.recipe.Recipes;
import planner.models.PlannerWallObject;

import java.awt.*;

@ModEntry
public class PlannerMod {

    private static Config config;
    public void preInit() {
        System.out.println("Pre-Init Planner Mod...");
        config = new Config();
    }

    public void init() {
        System.out.println("Starting Planner Mod, Hello World!");

        TileRegistry.registerTile("plannerpathtile", new PlannerPathObject("plannerpath", new Color(0, 0, 200)), 0, true);
        ObjectRegistry.registerObject("plannerwall", new PlannerWallObject("plannerwall", new Color(0, 0, 200)), 0, true);
        ObjectRegistry.registerObject("plannerfence", new PlannerFenceObject("plannerfence", new Color(0, 0, 200)), 0, true);

        TileRegistry.registerTile("plannerpathtilewhite", new PlannerPathObject("plannerpathwhite", new Color(255, 255, 255)), 0, true);
        ObjectRegistry.registerObject("plannerwallwhite", new PlannerWallObject("plannerwallwhite", new Color(255, 255, 255)), 0, true);
        ObjectRegistry.registerObject("plannerfencewhite", new PlannerFenceObject("plannerfencewhite", new Color(255, 255, 255)), 0, true);

        TileRegistry.registerTile("plannerpathtilepink", new PlannerPathObject("plannerpathpink", new Color(255, 105, 180)), 0, true);
        ObjectRegistry.registerObject("plannerwallpink", new PlannerWallObject("plannerwallpink", new Color(255, 105, 180)), 0, true);
        ObjectRegistry.registerObject("plannerfencepink", new PlannerFenceObject("plannerfencepink", new Color(255, 105, 180)), 0, true);

        TileRegistry.registerTile("plannerpathtilelightgreen", new PlannerPathObject("plannerpathlightgreen", new Color(144, 238, 144 )), 0, true);
        ObjectRegistry.registerObject("plannerwalllightgreen", new PlannerWallObject("plannerwalllightgreen", new Color(144, 238, 144 )), 0, true);
        ObjectRegistry.registerObject("plannerfencelightgreen", new PlannerFenceObject("plannerfencelightgreen", new Color(144, 238, 144 )), 0, true);

        TileRegistry.registerTile("plannerpathtilepurple", new PlannerPathObject("plannerpathpurple", new Color(147,112,219 )), 0, true);
        ObjectRegistry.registerObject("plannerwallpurple", new PlannerWallObject("plannerwallpurple", new Color(147,112,219 )), 0, true);
        ObjectRegistry.registerObject("plannerfencepurple", new PlannerFenceObject("plannerfencepurple", new Color(147,112,219 )), 0, true);

    }

    public void postInit() {
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerpathtile"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerwall"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerfence"));

        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerpathtilewhite"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerwallwhite"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerfencewhite"));

        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerpathtilepink"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerwallpink"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerfencepink"));

        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerpathtilelightgreen"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerwalllightgreen"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerfencelightgreen"));

        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerpathtilepurple"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerwallpurple"));
        Recipes.registerModRecipe(config.getPlannerCraftingRecipe("plannerfencepurple"));
    }
}
