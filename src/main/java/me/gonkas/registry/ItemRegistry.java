package me.gonkas.registry;

import me.gonkas.LeviathanAxe;
import me.gonkas.items.FrozenFlameMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {

    public static final ToolItem LEVIATHANAXE = (ToolItem) registerItem(
            "leviathan_axe", new AxeItem(FrozenFlameMaterial.INSTANCE, 15f, -3f, new FabricItemSettings()));

    public static void registerModItems() {
        LeviathanAxe.LOGGER.info("Registering Mod Items for " + LeviathanAxe.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ItemRegistry::addItemsToCombatItemGroup);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LeviathanAxe.MODID, name), item);
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(LEVIATHANAXE);
    }
}