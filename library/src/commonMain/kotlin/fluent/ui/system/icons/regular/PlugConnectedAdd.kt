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

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * PlugConnectedAdd icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: plug, connected, add
 * - Source: ic_fluent_plug_connected_add_20_regular.svg
 * 
 * @return The [ImageVector] for the PlugConnectedAdd icon.
 */
public val FluentIcons.Regular.PlugConnectedAdd: ImageVector
    get() {
        if (_plugConnectedAdd != null) {
            return _plugConnectedAdd!!
        }
        _plugConnectedAdd = Builder(name = "PlugConnectedAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.964f, 2.309f)
                curveTo(17.938f, 2.248f, 17.902f, 2.193f, 17.855f, 2.146f)
                curveTo(17.808f, 2.1f, 17.753f, 2.063f, 17.691f, 2.038f)
                curveTo(17.63f, 2.012f, 17.565f, 2.0f, 17.499f, 2.0f)
                curveTo(17.433f, 2.0f, 17.367f, 2.014f, 17.306f, 2.04f)
                curveTo(17.245f, 2.066f, 17.19f, 2.103f, 17.144f, 2.15f)
                lineTo(14.444f, 4.85f)
                curveTo(13.667f, 4.246f, 12.697f, 3.947f, 11.715f, 4.008f)
                curveTo(10.733f, 4.069f, 9.808f, 4.487f, 9.112f, 5.182f)
                lineTo(8.501f, 5.793f)
                curveTo(8.403f, 5.891f, 8.326f, 6.007f, 8.273f, 6.134f)
                curveTo(8.221f, 6.261f, 8.193f, 6.398f, 8.193f, 6.536f)
                curveTo(8.193f, 6.674f, 8.221f, 6.81f, 8.273f, 6.938f)
                curveTo(8.326f, 7.065f, 8.403f, 7.181f, 8.501f, 7.278f)
                lineTo(11.275f, 10.045f)
                curveTo(11.551f, 9.845f, 11.847f, 9.669f, 12.159f, 9.522f)
                lineTo(9.519f, 6.882f)
                curveTo(9.427f, 6.79f, 9.376f, 6.666f, 9.376f, 6.536f)
                curveTo(9.376f, 6.406f, 9.427f, 6.281f, 9.519f, 6.189f)
                lineTo(9.819f, 5.889f)
                curveTo(10.387f, 5.32f, 11.157f, 5.0f, 11.961f, 4.999f)
                curveTo(12.765f, 4.998f, 13.537f, 5.316f, 14.106f, 5.883f)
                lineTo(14.112f, 5.894f)
                lineTo(14.118f, 5.9f)
                curveTo(14.683f, 6.47f, 14.999f, 7.24f, 14.998f, 8.043f)
                curveTo(14.997f, 8.375f, 14.942f, 8.702f, 14.838f, 9.011f)
                curveTo(15.183f, 9.032f, 15.519f, 9.084f, 15.845f, 9.166f)
                curveTo(15.928f, 8.88f, 15.981f, 8.585f, 15.999f, 8.283f)
                curveTo(16.061f, 7.301f, 15.76f, 6.33f, 15.155f, 5.554f)
                lineTo(17.855f, 2.854f)
                curveTo(17.902f, 2.808f, 17.938f, 2.753f, 17.964f, 2.692f)
                curveTo(17.989f, 2.631f, 18.002f, 2.566f, 18.002f, 2.5f)
                curveTo(18.002f, 2.435f, 17.989f, 2.37f, 17.964f, 2.309f)
                close()
                moveTo(7.279f, 8.5f)
                lineTo(10.048f, 11.27f)
                curveTo(9.847f, 11.546f, 9.671f, 11.842f, 9.524f, 12.155f)
                lineTo(6.888f, 9.518f)
                curveTo(6.796f, 9.427f, 6.672f, 9.375f, 6.542f, 9.375f)
                curveTo(6.412f, 9.375f, 6.288f, 9.427f, 6.196f, 9.518f)
                lineTo(5.896f, 9.818f)
                curveTo(5.328f, 10.387f, 5.008f, 11.157f, 5.007f, 11.961f)
                curveTo(5.006f, 12.764f, 5.323f, 13.536f, 5.89f, 14.105f)
                lineTo(5.896f, 14.111f)
                lineTo(5.901f, 14.117f)
                curveTo(6.183f, 14.399f, 6.517f, 14.622f, 6.885f, 14.774f)
                curveTo(7.253f, 14.926f, 7.647f, 15.004f, 8.046f, 15.003f)
                curveTo(8.374f, 15.003f, 8.7f, 14.949f, 9.011f, 14.844f)
                curveTo(9.032f, 15.185f, 9.084f, 15.518f, 9.164f, 15.84f)
                curveTo(8.88f, 15.922f, 8.586f, 15.974f, 8.287f, 15.993f)
                curveTo(7.305f, 16.054f, 6.334f, 15.755f, 5.558f, 15.15f)
                lineTo(2.858f, 17.85f)
                curveTo(2.812f, 17.898f, 2.757f, 17.935f, 2.696f, 17.961f)
                curveTo(2.635f, 17.987f, 2.569f, 18.0f, 2.503f, 18.001f)
                curveTo(2.437f, 18.001f, 2.372f, 17.989f, 2.31f, 17.963f)
                curveTo(2.249f, 17.938f, 2.194f, 17.901f, 2.147f, 17.854f)
                curveTo(2.1f, 17.808f, 2.063f, 17.753f, 2.038f, 17.692f)
                curveTo(2.013f, 17.631f, 2.0f, 17.566f, 2.0f, 17.5f)
                curveTo(2.0f, 17.435f, 2.013f, 17.37f, 2.038f, 17.309f)
                curveTo(2.063f, 17.248f, 2.1f, 17.193f, 2.147f, 17.146f)
                lineTo(4.847f, 14.446f)
                curveTo(4.242f, 13.67f, 3.941f, 12.7f, 4.002f, 11.717f)
                curveTo(4.064f, 10.735f, 4.482f, 9.809f, 5.179f, 9.114f)
                lineTo(5.479f, 8.814f)
                lineTo(5.794f, 8.5f)
                curveTo(5.891f, 8.403f, 6.007f, 8.326f, 6.135f, 8.273f)
                curveTo(6.262f, 8.22f, 6.398f, 8.193f, 6.536f, 8.193f)
                curveTo(6.674f, 8.193f, 6.811f, 8.22f, 6.938f, 8.273f)
                curveTo(7.066f, 8.326f, 7.181f, 8.403f, 7.279f, 8.5f)
                close()
                moveTo(17.0f, 18.242f)
                curveTo(16.26f, 18.737f, 15.39f, 19.0f, 14.5f, 19.0f)
                curveTo(13.307f, 19.0f, 12.162f, 18.526f, 11.318f, 17.683f)
                curveTo(10.474f, 16.839f, 10.0f, 15.694f, 10.0f, 14.5f)
                curveTo(10.0f, 13.611f, 10.264f, 12.74f, 10.758f, 12.0f)
                curveTo(11.253f, 11.26f, 11.956f, 10.684f, 12.778f, 10.343f)
                curveTo(13.6f, 10.002f, 14.505f, 9.913f, 15.378f, 10.087f)
                curveTo(16.251f, 10.261f, 17.053f, 10.689f, 17.682f, 11.318f)
                curveTo(18.311f, 11.948f, 18.74f, 12.75f, 18.913f, 13.623f)
                curveTo(19.087f, 14.495f, 18.998f, 15.4f, 18.657f, 16.223f)
                curveTo(18.317f, 17.045f, 17.74f, 17.748f, 17.0f, 18.242f)
                close()
                moveTo(14.854f, 12.147f)
                curveTo(14.76f, 12.053f, 14.633f, 12.0f, 14.5f, 12.0f)
                curveTo(14.367f, 12.0f, 14.24f, 12.053f, 14.146f, 12.147f)
                curveTo(14.053f, 12.241f, 14.0f, 12.368f, 14.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.367f, 14.0f, 12.24f, 14.053f, 12.146f, 14.147f)
                curveTo(12.053f, 14.241f, 12.0f, 14.368f, 12.0f, 14.5f)
                curveTo(12.0f, 14.633f, 12.053f, 14.76f, 12.146f, 14.854f)
                curveTo(12.24f, 14.948f, 12.367f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 16.633f, 14.053f, 16.76f, 14.146f, 16.854f)
                curveTo(14.24f, 16.948f, 14.367f, 17.0f, 14.5f, 17.0f)
                curveTo(14.633f, 17.0f, 14.76f, 16.948f, 14.854f, 16.854f)
                curveTo(14.947f, 16.76f, 15.0f, 16.633f, 15.0f, 16.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                curveTo(16.633f, 15.0f, 16.76f, 14.948f, 16.854f, 14.854f)
                curveTo(16.947f, 14.76f, 17.0f, 14.633f, 17.0f, 14.5f)
                curveTo(17.0f, 14.368f, 16.947f, 14.241f, 16.854f, 14.147f)
                curveTo(16.76f, 14.053f, 16.633f, 14.0f, 16.5f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 12.368f, 14.947f, 12.241f, 14.854f, 12.147f)
                close()
            }
        }
        .build()
        return _plugConnectedAdd!!
    }

@Suppress("ObjectPropertyName")
private var _plugConnectedAdd: ImageVector? = null

@Preview
@Composable
private fun PlugConnectedAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PlugConnectedAdd, contentDescription = null)
    }
}

