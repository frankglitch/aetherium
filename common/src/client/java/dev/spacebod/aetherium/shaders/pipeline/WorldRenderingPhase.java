package dev.spacebod.aetherium.shaders.pipeline;

/**
 * The world-rendering stages packs read as {@code renderStage}, in the order of the pack format's
 * {@code MC_RENDER_STAGE_*} constants (the value is the ordinal).
 */
public enum WorldRenderingPhase {
	NONE,
	SKY,
	SUNSET,
	CUSTOM_SKY,
	SUN,
	MOON,
	STARS,
	VOID,
	TERRAIN_SOLID,
	TERRAIN_CUTOUT_MIPPED,
	TERRAIN_CUTOUT,
	ENTITIES,
	BLOCK_ENTITIES,
	DESTROY,
	OUTLINE,
	DEBUG,
	HAND_SOLID,
	TERRAIN_TRANSLUCENT,
	TRIPWIRE,
	PARTICLES,
	CLOUDS,
	RAIN_SNOW,
	WORLD_BORDER,
	HAND_TRANSLUCENT,
	/**
	 * Aetherium only: the second terrain draw of the shadow pass for packs that voxelise there ({@code MC_RENDER_STAGE_SHADOW_VOXEL}).
	 * Devices without geometry stages (Metal) cannot let a geometry stage emit the voxel copy of each triangle, so the pack's
	 * shadow vertex stage places the triangle in its voxel volume while this stage is current.
	 */
	SHADOW_VOXEL
}
