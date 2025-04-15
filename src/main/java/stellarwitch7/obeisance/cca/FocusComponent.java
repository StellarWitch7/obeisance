package stellarwitch7.obeisance.cca;

import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;
import org.ladysnake.cca.api.v3.component.tick.ClientTickingComponent;
import org.ladysnake.cca.api.v3.component.tick.ServerTickingComponent;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.server.network.ServerPlayerEntity;

public class FocusComponent implements ServerTickingComponent, ClientTickingComponent, AutoSyncedComponent {
    private final PlayerEntity player;

    public FocusComponent(PlayerEntity player) {
        this.player = player;
    }

    @Override
    public void readFromNbt(NbtCompound tag, WrapperLookup registryLookup) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readFromNbt'");
    }

    @Override
    public void writeToNbt(NbtCompound tag, WrapperLookup registryLookup) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeToNbt'");
    }

    @Override
    public void applySyncPacket(RegistryByteBuf buf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'applySyncPacket'");
    }

    @Override
    public void writeSyncPacket(RegistryByteBuf buf, ServerPlayerEntity recipient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeSyncPacket'");
    }

    @Override
    public void clientTick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clientTick'");
    }

    @Override
    public void serverTick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'serverTick'");
    }
}
