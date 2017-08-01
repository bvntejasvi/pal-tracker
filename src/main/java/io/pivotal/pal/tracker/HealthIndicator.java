package io.pivotal.pal.tracker;

import org.springframework.boot.actuate.health.Health;

/**
 * Created by accenturelabs on 8/1/17.
 */
public interface HealthIndicator {
    Health health();
}
