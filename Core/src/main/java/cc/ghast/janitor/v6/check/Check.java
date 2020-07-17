package cc.ghast.janitor.v6.check;

import cc.ghast.janitor.v6.data.PlayerData;
import com.comphenix.packetwrapper.AbstractPacket;
import com.comphenix.protocol.events.PacketContainer;
import lombok.RequiredArgsConstructor;

/**
 * @author Ghast
 * @since 17/07/2020
 * Ghast Holdings LLC / JIv6 © 2020
 */

@RequiredArgsConstructor
public abstract class Check {
    private final CheckInformation info;
    private final PlayerData data;

    private int vls;

    public abstract void handle(AbstractPacket container);

    protected void log() {
        violate(1, "");
    }

    protected void log(int i) {
        violate(i, "");
    }

    protected void log(String debug) {
        violate(1, "");
    }

    protected void log(int i, String debug) {
        violate(i, debug);
    }

    private void violate(int i, String debug) {

    }
}