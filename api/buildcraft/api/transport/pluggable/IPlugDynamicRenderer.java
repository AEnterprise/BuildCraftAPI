/*
 * Copyright (c) 2017 SpaceToad and the BuildCraft team
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not
 * distributed with this file, You can obtain one at https://mozilla.org/MPL/2.0/
 */

package buildcraft.api.transport.pluggable;


import net.minecraft.client.renderer.BufferBuilder;

public interface IPlugDynamicRenderer<P extends PipePluggable> {
    void render(P plug, double x, double y, double z, float partialTicks, BufferBuilder bb);
}
