/*
 * Copyright (c) 2016 Vines High School Robotics Team
 *
 *                            Permission is hereby granted, free of charge, to any person obtaining a copy
 *                            of this software and associated documentation files (the "Software"), to deal
 *                            in the Software without restriction, including without limitation the rights
 *                            to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *                            copies of the Software, and to permit persons to whom the Software is
 *                            furnished to do so, subject to the following conditions:
 *
 *                            The above copyright notice and this permission notice shall be included in all
 *                            copies or substantial portions of the Software.
 *
 *                            THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *                            IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *                            FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *                            AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *                            LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *                            OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *                            SOFTWARE.
 */

package org.vinesrobotics.sixteen.utils;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.vinesrobotics.sixteen.hardware.LocalControl;

/**
 * Created by Vines HS Robotics on 10/14/2016.
 */

public class Logging {

    protected static Telemetry telemetry = null;
    public static LocalControl<Telemetry> hardwareAccess = null;

    /**
     * Sets logging telemetry object.
     * @param tel
     */
    public static void setTelemetry(Telemetry tel) {
        telemetry = tel;
        hardwareAccess = new LocalControl<>(tel);
    }

    /**
     * Logs single line to telemetry.
     * @param s
     */
    public static void log(String s) {
        telemetry.addLine(s);
        telemetry.update();
    }

    /**
     * Logs object to telemetry.
     * @param s
     * @param o
     */
    public static void logData(String s,Object o) {
        telemetry.addData(s,o);
        telemetry.update();
    }

}
