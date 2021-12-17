package io.github.thebusybiscuit.slimefun4.api.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * This {@link Event} is called when an {@link SlimefunItem} is used to break blocks for other plugins responding
 *
 * @author CuddlTheif
 * 
 * @see ExplosiveTool, LumberAxe, PickaxeOfVeinMining
 *
 */
public class FakeBlockBreakEvent extends BlockBreakEvent {

    public FakeBlockBreakEvent(Block theBlock, Player player) {
        super(theBlock, player);
    }
    
}
