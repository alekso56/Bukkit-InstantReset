package org.cyberiantiger.minecraft.instantreset;

import org.bukkit.command.CommandSender;

public class ReloadSubCommand implements SubCommand {
    private final InstantReset plugin;

    public ReloadSubCommand(InstantReset plugin) {
        this.plugin = plugin;
    }
    
	@Override
	public void onCommand(CommandSender sender, String... args) throws CommandException {
		plugin.reloadConfig();
	}

}
