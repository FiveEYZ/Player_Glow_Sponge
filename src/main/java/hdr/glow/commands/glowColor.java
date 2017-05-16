package hdr.glow.commands;

import hdr.glow.config.GlowStrings;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.service.pagination.PaginationList;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.text.format.TextStyles;
import static hdr.glow.config.GlowStrings.*;

public class glowColor implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {

        if (src instanceof Player) {
            Player player = (Player) src;
            PaginationList.builder()
                    .title(Text.of(TextStyles.BOLD, "Player Glow ", TextColors.GOLD, GlowStrings.PluginVersion, TextColors.WHITE, " By ", TextColors.GOLD, "HDR "))
                    .contents(Toggle, Black, DarkBlue, DarkGreen, DarkAqua, DarkRed, DarkPurple, Gold, Gray, DarkGray, Blue, Green, Aqua, Red, LightPurple, Yellow, White)
                    .header(Github)
                    .padding(Padding)
                    .sendTo(player);
        }
        return CommandResult.success();
    }
}