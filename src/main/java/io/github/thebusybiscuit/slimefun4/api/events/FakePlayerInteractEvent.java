package io.github.thebusybiscuit.slimefun4.api.events;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

/**
 * This {@link Event} is called when an {@link SlimefunItem} is used to interact with blocks for other plugins responding
 *
 * @author CuddleTheif
 * 
 * @see LumberAxe
 *
 */
public class FakePlayerInteractEvent extends PlayerInteractEvent {

    public FakePlayerInteractEvent(Player who, Action action, ItemStack item, Block clickedBlock,
            BlockFace clickedFace) {
        super(who, action, item, clickedBlock, clickedFace);
    }

}