package planner.models;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.PlayerMob;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.level.gameObject.FenceObject;

import java.awt.*;

public class PlannerFenceObject extends FenceObject {

    public PlannerFenceObject(String textureName, Color mapColor) {
        super(textureName, mapColor, 1, 1);
        this.objectHealth = 1;
    }

    @Override
    public ListGameTooltips getItemTooltips(InventoryItem item, PlayerMob perspective) {
        ListGameTooltips tooltips = super.getItemTooltips(item, perspective);
        tooltips.add(Localization.translate("itemtooltip", "plannerfenceplacetip"));
        return tooltips;
    }
}