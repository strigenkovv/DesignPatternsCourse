package be.vdab.test;

/**
 * Op het eiland kunnen vulkaanuitbarstingen gebeuren.
 * Iedere inwoner moet op deze gebeurtenis reageren.
 */
public interface InwonerObserver {
    /**
     * Reageert op een vulkaanuitbarsting.
     */
    void reageerOpVulkaanuitbarsting();
}
