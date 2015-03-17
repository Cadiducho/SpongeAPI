/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.api.world;

import org.spongepowered.api.service.persistence.data.DataContainer;

import org.spongepowered.api.entity.player.gamemode.GameMode;

/**
 * A representation of the settings which define a world for creation.
 */
public interface WorldCreationSettings {

    /**
     * Gets the name of the world.
     * 
     * @return The name
     */
    String getWorldName();

    /**
     * Gets the seed of the world.
     * 
     * @return The seed
     */
    long getSeed();

    /**
     * Gets the default gamemode of the world.
     * 
     * @return The gamemode
     */
    GameMode getGameMode();

    /**
     * Gets the type of the generator for the world.
     * 
     * @return The generator type
     */
    GeneratorType getGeneratorType();

    /**
     * Gets whether map features are enabled to be generated into the world.
     * 
     * @return Are map features enabled
     */
    boolean usesMapFeatures();

    /**
     * Gets whether hardcore mode is enabled in this world.
     * 
     * @return Is hardcore
     */
    boolean isHardcore();

    /**
     * Gets whether commands are allowed in this world.
     * 
     * @return Are commands allowed
     */
    boolean commandsAllowed();

    /**
     * Gets whether the bonus chest should be created in this world.
     * 
     * @return Should create bonus chest
     */
    boolean bonusChestEnabled();
    
    /**
     * Gets the dimension type for the world.
     * 
     * @return The dimension type
     */
    DimensionType getDimension();
    
    /**
     * Gets a {@link DataContainer} of any extra settings required by the
     * generator.
     * 
     * @return The generator settings
     */
    DataContainer getGeneratorSettings();

}
