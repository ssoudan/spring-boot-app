/*******************************************************************************
 * Copyright (c) 2011-2015 Sebastien Soudan
 *
 * All rights reserved.
 *******************************************************************************/
package hello.services;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * User: ssoudan
 * Date: 8/13/15
 * Time: 6:49 PM
 */
@Service
public class HomeService implements HealthIndicator {

    private static final Random rand = new Random();
    public static final int MAX = 100;

    public String doSomething() {

        int a = rand.nextInt() % MAX;
        int b = rand.nextInt() % MAX;

        return String.format("%d - %d = %d", a, b, a - b);
    }

    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    private int check() {
        // TODO(ssoudan) that's where more has to be done
        return 0;
    }
}
