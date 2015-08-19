/*******************************************************************************
 * Copyright (c) 2011-2015 Sebastien Soudan
 *
 * All rights reserved.
 *******************************************************************************/
package hello;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * User: ssoudan
 * Date: 8/13/15
 * Time: 6:10 PM
 */
@Component
public class AnotherHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    private int check() {
        return new Random().nextInt() % 4;
    }


}
