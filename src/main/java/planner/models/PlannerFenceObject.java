package planner.models;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.PlayerMob;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.toolItem.ToolType;
import necesse.level.gameObject.FenceObject;
import necesse.level.gameObject.WallObject;

import java.awt.*;

public class PlannerFenceObject extends FenceObject {

    public PlannerFenceObject() {
        super("plannerfence", new Color(0, 0, 200), 1, 1);
        this.objectHealth = 1;
    }

    @Override
    public ListGameTooltips getItemTooltips(InventoryItem item, PlayerMob perspective) {
        ListGameTooltips tooltips = super.getItemTooltips(item, perspective);
        tooltips.add(Localization.translate("itemtooltip", "plannerfenceplacetip"));
        return tooltips;
    }
}