/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.ArrowClockwiseDashes: ImageVector
    get() {
        if (_ArrowClockwiseDashes != null) {
            return _ArrowClockwiseDashes!!
        }
        _ArrowClockwiseDashes = ImageVector.Builder(
            name = "Colored.ArrowClockwiseDashes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0FAFFF),
                        0.923f to Color(0xFF0067BF)
                    ),
                    start = Offset(5.536f, 3f),
                    end = Offset(21.03f, 26.625f)
                )
            ) {
                moveTo(13.241f, 3.085f)
                curveTo(13.688f, 3.147f, 14f, 3.543f, 14f, 3.994f)
                curveTo(14f, 4.641f, 13.374f, 5.104f, 12.731f, 5.038f)
                curveTo(12.491f, 5.013f, 12.247f, 5f, 12f, 5f)
                curveTo(11.753f, 5f, 11.509f, 5.013f, 11.269f, 5.038f)
                curveTo(10.626f, 5.104f, 10f, 4.641f, 10f, 3.994f)
                curveTo(10f, 3.543f, 10.312f, 3.147f, 10.759f, 3.085f)
                curveTo(11.165f, 3.029f, 11.579f, 3f, 12f, 3f)
                curveTo(12.421f, 3f, 12.836f, 3.029f, 13.241f, 3.085f)
                close()
                moveTo(12.731f, 18.962f)
                curveTo(13.374f, 18.896f, 14f, 19.359f, 14f, 20.006f)
                curveTo(14f, 20.457f, 13.688f, 20.853f, 13.241f, 20.915f)
                curveTo(12.835f, 20.971f, 12.421f, 21f, 12f, 21f)
                curveTo(11.579f, 21f, 11.165f, 20.971f, 10.759f, 20.915f)
                curveTo(10.312f, 20.853f, 10f, 20.457f, 10f, 20.006f)
                curveTo(10f, 19.359f, 10.626f, 18.896f, 11.269f, 18.962f)
                curveTo(11.509f, 18.987f, 11.753f, 19f, 12f, 19f)
                curveTo(12.247f, 19f, 12.491f, 18.987f, 12.731f, 18.962f)
                close()
                moveTo(15.5f, 18.681f)
                curveTo(15.5f, 19.446f, 16.281f, 19.955f, 16.922f, 19.536f)
                curveTo(17.963f, 18.855f, 18.855f, 17.963f, 19.536f, 16.922f)
                curveTo(19.955f, 16.281f, 19.446f, 15.5f, 18.681f, 15.5f)
                curveTo(18.299f, 15.5f, 17.951f, 15.707f, 17.731f, 16.02f)
                curveTo(17.264f, 16.685f, 16.685f, 17.264f, 16.02f, 17.731f)
                curveTo(15.707f, 17.951f, 15.5f, 18.299f, 15.5f, 18.681f)
                close()
                moveTo(19f, 6.713f)
                verticalLineTo(7f)
                curveTo(19f, 7.552f, 18.552f, 8f, 18f, 8f)
                horizontalLineTo(15f)
                curveTo(14.448f, 8f, 14f, 7.552f, 14f, 7f)
                curveTo(14f, 6.448f, 14.448f, 6f, 15f, 6f)
                horizontalLineTo(15.739f)
                curveTo(15.589f, 5.805f, 15.5f, 5.57f, 15.5f, 5.319f)
                curveTo(15.5f, 4.554f, 16.281f, 4.045f, 16.922f, 4.464f)
                curveTo(16.948f, 4.481f, 16.974f, 4.498f, 17f, 4.516f)
                verticalLineTo(4f)
                curveTo(17f, 3.448f, 17.448f, 3f, 18f, 3f)
                curveTo(18.552f, 3f, 19f, 3.448f, 19f, 4f)
                verticalLineTo(6.703f)
                curveTo(19f, 6.706f, 19f, 6.71f, 19f, 6.713f)
                close()
                moveTo(7.078f, 4.464f)
                curveTo(7.719f, 4.045f, 8.5f, 4.554f, 8.5f, 5.319f)
                curveTo(8.5f, 5.701f, 8.293f, 6.049f, 7.98f, 6.269f)
                curveTo(7.315f, 6.736f, 6.736f, 7.315f, 6.269f, 7.98f)
                curveTo(6.049f, 8.293f, 5.701f, 8.5f, 5.319f, 8.5f)
                curveTo(4.554f, 8.5f, 4.045f, 7.719f, 4.464f, 7.078f)
                curveTo(5.145f, 6.037f, 6.037f, 5.145f, 7.078f, 4.464f)
                close()
                moveTo(3.085f, 10.759f)
                curveTo(3.029f, 11.165f, 3f, 11.579f, 3f, 12f)
                curveTo(3f, 12.421f, 3.029f, 12.835f, 3.085f, 13.241f)
                curveTo(3.147f, 13.688f, 3.543f, 14f, 3.994f, 14f)
                curveTo(4.641f, 14f, 5.104f, 13.374f, 5.038f, 12.731f)
                curveTo(5.013f, 12.491f, 5f, 12.247f, 5f, 12f)
                curveTo(5f, 11.753f, 5.013f, 11.509f, 5.038f, 11.269f)
                curveTo(5.104f, 10.626f, 4.641f, 10f, 3.994f, 10f)
                curveTo(3.543f, 10f, 3.147f, 10.312f, 3.085f, 10.759f)
                close()
                moveTo(7.078f, 19.536f)
                curveTo(7.719f, 19.955f, 8.5f, 19.446f, 8.5f, 18.681f)
                curveTo(8.5f, 18.299f, 8.293f, 17.951f, 7.98f, 17.731f)
                curveTo(7.315f, 17.264f, 6.736f, 16.685f, 6.269f, 16.02f)
                curveTo(6.049f, 15.707f, 5.701f, 15.5f, 5.319f, 15.5f)
                curveTo(4.554f, 15.5f, 4.045f, 16.281f, 4.464f, 16.922f)
                curveTo(5.145f, 17.963f, 6.037f, 18.855f, 7.078f, 19.536f)
                close()
                moveTo(20.945f, 12.998f)
                curveTo(21.006f, 12.449f, 20.552f, 12f, 20f, 12f)
                horizontalLineTo(19.866f)
                curveTo(19.388f, 12f, 19.005f, 12.402f, 18.946f, 12.877f)
                curveTo(18.874f, 13.452f, 19.292f, 14f, 19.872f, 14f)
                horizontalLineTo(20.006f)
                curveTo(20.457f, 14f, 20.853f, 13.688f, 20.915f, 13.241f)
                curveTo(20.926f, 13.16f, 20.936f, 13.079f, 20.945f, 12.998f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00885EDB),
                        1f to Color(0xFFE362F8)
                    ),
                    start = Offset(11.975f, 0.857f),
                    end = Offset(16.036f, 31.286f)
                )
            ) {
                moveTo(13.241f, 3.085f)
                curveTo(13.688f, 3.147f, 14f, 3.543f, 14f, 3.994f)
                curveTo(14f, 4.641f, 13.374f, 5.104f, 12.731f, 5.038f)
                curveTo(12.491f, 5.013f, 12.247f, 5f, 12f, 5f)
                curveTo(11.753f, 5f, 11.509f, 5.013f, 11.269f, 5.038f)
                curveTo(10.626f, 5.104f, 10f, 4.641f, 10f, 3.994f)
                curveTo(10f, 3.543f, 10.312f, 3.147f, 10.759f, 3.085f)
                curveTo(11.165f, 3.029f, 11.579f, 3f, 12f, 3f)
                curveTo(12.421f, 3f, 12.836f, 3.029f, 13.241f, 3.085f)
                close()
                moveTo(12.731f, 18.962f)
                curveTo(13.374f, 18.896f, 14f, 19.359f, 14f, 20.006f)
                curveTo(14f, 20.457f, 13.688f, 20.853f, 13.241f, 20.915f)
                curveTo(12.835f, 20.971f, 12.421f, 21f, 12f, 21f)
                curveTo(11.579f, 21f, 11.165f, 20.971f, 10.759f, 20.915f)
                curveTo(10.312f, 20.853f, 10f, 20.457f, 10f, 20.006f)
                curveTo(10f, 19.359f, 10.626f, 18.896f, 11.269f, 18.962f)
                curveTo(11.509f, 18.987f, 11.753f, 19f, 12f, 19f)
                curveTo(12.247f, 19f, 12.491f, 18.987f, 12.731f, 18.962f)
                close()
                moveTo(15.5f, 18.681f)
                curveTo(15.5f, 19.446f, 16.281f, 19.955f, 16.922f, 19.536f)
                curveTo(17.963f, 18.855f, 18.855f, 17.963f, 19.536f, 16.922f)
                curveTo(19.955f, 16.281f, 19.446f, 15.5f, 18.681f, 15.5f)
                curveTo(18.299f, 15.5f, 17.951f, 15.707f, 17.731f, 16.02f)
                curveTo(17.264f, 16.685f, 16.685f, 17.264f, 16.02f, 17.731f)
                curveTo(15.707f, 17.951f, 15.5f, 18.299f, 15.5f, 18.681f)
                close()
                moveTo(19f, 6.713f)
                verticalLineTo(7f)
                curveTo(19f, 7.552f, 18.552f, 8f, 18f, 8f)
                horizontalLineTo(15f)
                curveTo(14.448f, 8f, 14f, 7.552f, 14f, 7f)
                curveTo(14f, 6.448f, 14.448f, 6f, 15f, 6f)
                horizontalLineTo(15.739f)
                curveTo(15.589f, 5.805f, 15.5f, 5.57f, 15.5f, 5.319f)
                curveTo(15.5f, 4.554f, 16.281f, 4.045f, 16.922f, 4.464f)
                curveTo(16.948f, 4.481f, 16.974f, 4.498f, 17f, 4.516f)
                verticalLineTo(4f)
                curveTo(17f, 3.448f, 17.448f, 3f, 18f, 3f)
                curveTo(18.552f, 3f, 19f, 3.448f, 19f, 4f)
                verticalLineTo(6.703f)
                curveTo(19f, 6.706f, 19f, 6.71f, 19f, 6.713f)
                close()
                moveTo(7.078f, 4.464f)
                curveTo(7.719f, 4.045f, 8.5f, 4.554f, 8.5f, 5.319f)
                curveTo(8.5f, 5.701f, 8.293f, 6.049f, 7.98f, 6.269f)
                curveTo(7.315f, 6.736f, 6.736f, 7.315f, 6.269f, 7.98f)
                curveTo(6.049f, 8.293f, 5.701f, 8.5f, 5.319f, 8.5f)
                curveTo(4.554f, 8.5f, 4.045f, 7.719f, 4.464f, 7.078f)
                curveTo(5.145f, 6.037f, 6.037f, 5.145f, 7.078f, 4.464f)
                close()
                moveTo(3.085f, 10.759f)
                curveTo(3.029f, 11.165f, 3f, 11.579f, 3f, 12f)
                curveTo(3f, 12.421f, 3.029f, 12.835f, 3.085f, 13.241f)
                curveTo(3.147f, 13.688f, 3.543f, 14f, 3.994f, 14f)
                curveTo(4.641f, 14f, 5.104f, 13.374f, 5.038f, 12.731f)
                curveTo(5.013f, 12.491f, 5f, 12.247f, 5f, 12f)
                curveTo(5f, 11.753f, 5.013f, 11.509f, 5.038f, 11.269f)
                curveTo(5.104f, 10.626f, 4.641f, 10f, 3.994f, 10f)
                curveTo(3.543f, 10f, 3.147f, 10.312f, 3.085f, 10.759f)
                close()
                moveTo(7.078f, 19.536f)
                curveTo(7.719f, 19.955f, 8.5f, 19.446f, 8.5f, 18.681f)
                curveTo(8.5f, 18.299f, 8.293f, 17.951f, 7.98f, 17.731f)
                curveTo(7.315f, 17.264f, 6.736f, 16.685f, 6.269f, 16.02f)
                curveTo(6.049f, 15.707f, 5.701f, 15.5f, 5.319f, 15.5f)
                curveTo(4.554f, 15.5f, 4.045f, 16.281f, 4.464f, 16.922f)
                curveTo(5.145f, 17.963f, 6.037f, 18.855f, 7.078f, 19.536f)
                close()
                moveTo(20.945f, 12.998f)
                curveTo(21.006f, 12.449f, 20.552f, 12f, 20f, 12f)
                horizontalLineTo(19.866f)
                curveTo(19.388f, 12f, 19.005f, 12.402f, 18.946f, 12.877f)
                curveTo(18.874f, 13.452f, 19.292f, 14f, 19.872f, 14f)
                horizontalLineTo(20.006f)
                curveTo(20.457f, 14f, 20.853f, 13.688f, 20.915f, 13.241f)
                curveTo(20.926f, 13.16f, 20.936f, 13.079f, 20.945f, 12.998f)
                close()
            }
        }.build()

        return _ArrowClockwiseDashes!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwiseDashes: ImageVector? = null

@Preview
@Composable
private fun ArrowClockwiseDashesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.ArrowClockwiseDashes, contentDescription = null)
    }
}
