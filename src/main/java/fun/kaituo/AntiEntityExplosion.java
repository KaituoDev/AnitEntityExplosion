package fun.kaituo;

import fun.kaituo.event.onExplode;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiEntityExplosion extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new onExplode(), this);
        this.getLogger().info("This plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("This plugin has been disabled!");
    }
}
