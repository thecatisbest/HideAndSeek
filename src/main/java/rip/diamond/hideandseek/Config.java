package rip.diamond.hideandseek;

import me.goodestenglish.api.util.serialization.LocationSerialization;
import org.bukkit.Location;

public class Config {

    public static Location LOBBY_LOCATION = LocationSerialization.deserializeLocation(HideAndSeek.INSTANCE.getConfigFile().getString("lobby-location"));
    public static int GAME_TIME_SECOND = HideAndSeek.INSTANCE.getConfigFile().getInt("game-time-second");

}
