package io.github.thebusybiscuit.slimefun4.core.commands.subcommands;

import java.util.Optional;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.bakedlibs.dough.common.PlayerList;
import io.github.thebusybiscuit.slimefun4.core.commands.SlimefunCommand;
import io.github.thebusybiscuit.slimefun4.core.commands.SubCommand;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuide;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideMode;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;

class GuideCommand extends SubCommand {

    @ParametersAreNonnullByDefault
    GuideCommand(Slimefun plugin, SlimefunCommand cmd) {
        super(plugin, cmd, "guide", false);
    }

    @Override
    public void onExecute(CommandSender sender, String[] args) {
        Optional<Player> player = Optional.empty();
        Player p = null;
        if (args.length > 1){
            player = PlayerList.findByName(args[1]);
            if ((sender.hasPermission("slimefun.cheat.items") || !(sender instanceof Player))  && player.isPresent())
                p = player.get();
        }
        else if(sender instanceof Player)
            p = (Player) sender;
        if(p!=null){
            if (sender.hasPermission("slimefun.command.guide")) {
                SlimefunGuideMode design = SlimefunGuide.getDefaultMode();
                p.getInventory().addItem(SlimefunGuide.getItem(design).clone());
            } else {
                Slimefun.getLocalization().sendMessage(sender, "messages.no-permission", true);
            }
        }
        else
            Slimefun.getLocalization().sendMessage(sender, "messages.only-players", true);
        
    }

}
