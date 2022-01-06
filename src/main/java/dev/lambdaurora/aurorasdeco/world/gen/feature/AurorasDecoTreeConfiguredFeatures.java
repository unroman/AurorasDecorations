/*
 * Copyright (c) 2021 - 2022 LambdAurora <aurora42lambda@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package dev.lambdaurora.aurorasdeco.world.gen.feature;

import dev.lambdaurora.aurorasdeco.AurorasDeco;
import dev.lambdaurora.aurorasdeco.mixin.world.TreeConfiguredFeaturesAccessor;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.util.ConfiguredFeatureUtil;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;

import java.util.List;

public final class AurorasDecoTreeConfiguredFeatures {
	private AurorasDecoTreeConfiguredFeatures() {
		throw new UnsupportedOperationException("AurorasDecoTreeConfiguredFeatures only contains static definitions.");
	}

	private static final BeehiveTreeDecorator BEES_015 = new BeehiveTreeDecorator(0.15f);

	public static final ConfiguredFeature<TreeFeatureConfig, ?> OAK_BEES_015 = ConfiguredFeatureUtil.register(
			AurorasDeco.id("oak_bees_15").toString(),
			Feature.TREE.configure(TreeConfiguredFeaturesAccessor.invokeOak().decorators(List.of(BEES_015)).build())
	);

	public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_OAK_BEES_015 = ConfiguredFeatureUtil.register(
			AurorasDeco.id("fancy_oak_bees_15").toString(),
			Feature.TREE.configure(TreeConfiguredFeaturesAccessor.invokeFancyOak().decorators(List.of(BEES_015)).build())
	);

	public static final ConfiguredFeature<TreeFeatureConfig, ?> BIRCH_BEES_015 = ConfiguredFeatureUtil.register(
			AurorasDeco.id("birch_bees_15").toString(),
			Feature.TREE.configure(TreeConfiguredFeaturesAccessor.invokeBirch().decorators(List.of(BEES_015)).build())
	);
}