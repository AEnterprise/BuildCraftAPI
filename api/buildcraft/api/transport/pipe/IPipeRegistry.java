package buildcraft.api.transport.pipe;

import net.minecraft.util.ResourceLocation;

public interface IPipeRegistry {
    PipeDefinition getDefinition(ResourceLocation identifier);

    void registerPipe(PipeDefinition definition);

    void setItemForPipe(PipeDefinition definition, IItemPipe item);

    IItemPipe getItemForPipe(PipeDefinition definition);

    Iterable<PipeDefinition> getAllRegisteredPipes();
}
