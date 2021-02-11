package com.dq;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Car {
    void drive();
}
