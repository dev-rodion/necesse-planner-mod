package planner.models;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.PlayerMob;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.level.gameTile.PathTiledTile;

import java.awt.*;

public class PlannerPathObject extends PathTiledTile {

    public PlannerPathObject() {
        super("plannerpath", new Color(0, 0, 200));
        this.tileHealth = 1;
    }

    @Override
    public ListGameTooltips getItemTooltips(InventoryItem item, PlayerMob perspective) {
        ListGameTooltips tooltips = super.getItemTooltips(item, perspective);
        tooltips.add(Localization.translate("itemtooltip", "plannerpathplacetip"));
        return tooltips;
    }
}