package com.novaventure.survivalessentials.registry.Features;


import net.minecraft.block.BlockState;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import static com.novaventure.survivalessentials.SurvivalEssentials.APPLE_LEAVES;
import static com.novaventure.survivalessentials.SurvivalEssentials.APPLE_LOG;

public class AppleTreeFeature {
    public ConfiguredFeature<?, ?> APPLE_TREE_OVERWORLD = Feature.TREE
            .configure((new TreeFeatureConfig(
                    TreeFeatureConfig.Builder(new SimpleBlockStateProvider(AppleTreeFeature.States.APPLE_LOG),
                    new SimpleBlockStateProvider(States.APPLE_LEAVES),
                    new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0),3),
                    new StraightTrunkPlacer(4, 2, 0),
            new TwoLayersFeatureSize(1,0,1))).ignoreVines().build()));

    public static final class States {
        public static final BlockState APPLE_LOG;
        public static final BlockState APPLE_LEAVES;
        
        static {
            APPLE_LOG = com.novaventure.survivalessentials.SurvivalEssentials.APPLE_LOG.getDefaultState();
            APPLE_LEAVES = com.novaventure.survivalessentials.SurvivalEssentials.APPLE_LEAVES.getDefaultState();
        }
    }
}
