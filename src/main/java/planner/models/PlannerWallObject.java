package planner.models;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.PlayerMob;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.toolItem.ToolType;
import necesse.level.gameObject.WallObject;

import java.awt.*;

public class PlannerWallObject extends WallObject {

    public PlannerWallObject(String textureName, Color mapColor) {
        super(textureName, textureName, mapColor, 0, ToolType.ALL);
        this.objectHealth = 1;
    }

    @Override
    public ListGameTooltips getItemTooltips(InventoryItem item, PlayerMob perspective) {
        ListGameTooltips tooltips = super.getItemTooltips(item, perspective);
        tooltips.add(Localization.translate("itemtooltip", "plannerwallplacetip"));
        return tooltips;
    }
}