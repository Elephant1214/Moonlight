package ca.spottedleaf.starlight.common.chunk;

public interface ExtendedChunk {
    SWMRNibbleArray[] getBlockNibbles();

    void setBlockNibbles(final SWMRNibbleArray[] nibbleArrays);

    SWMRNibbleArray[] getSkyNibbles();

    void setSkyNibbles(final SWMRNibbleArray[] nibbleArrays);

    boolean[] getSkyEmptinessMap();

    void setSkyEmptinessMap(final boolean[] booleans);

    boolean[] getBlockEmptinessMap();

    void setBlockEmptinessMap(final boolean[] booleans);
}
