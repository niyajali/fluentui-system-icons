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
 * TapDouble icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tap, double
 * - Source: ic_fluent_tap_double_24_regular.svg
 * 
 * @return The [ImageVector] for the TapDouble icon.
 */
public val FluentIcons.Regular.TapDouble: ImageVector
    get() {
        if (_tapDouble != null) {
            return _tapDouble!!
        }
        _tapDouble = Builder(name = "TapDouble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.75f, 7.0f)
                curveTo(13.099f, 7.0f, 13.929f, 7.969f, 13.995f, 9.329f)
                lineTo(14.0f, 9.508f)
                verticalLineTo(11.624f)
                lineTo(16.219f, 12.027f)
                curveTo(16.306f, 12.043f, 16.392f, 12.062f, 16.477f, 12.085f)
                curveTo(18.152f, 12.532f, 19.17f, 14.208f, 18.821f, 15.884f)
                lineTo(18.778f, 16.063f)
                lineTo(17.73f, 19.987f)
                curveTo(17.512f, 20.803f, 16.857f, 21.423f, 16.041f, 21.603f)
                lineTo(15.876f, 21.633f)
                lineTo(13.458f, 21.98f)
                curveTo(12.533f, 22.113f, 11.63f, 21.66f, 11.177f, 20.857f)
                lineTo(11.098f, 20.702f)
                lineTo(11.069f, 20.639f)
                curveTo(10.834f, 20.135f, 10.482f, 19.695f, 10.043f, 19.356f)
                lineTo(9.849f, 19.218f)
                lineTo(7.965f, 17.962f)
                lineTo(7.872f, 17.903f)
                lineTo(7.774f, 17.851f)
                lineTo(5.411f, 16.676f)
                curveTo(5.162f, 16.552f, 5.002f, 16.299f, 4.995f, 16.021f)
                curveTo(4.971f, 14.912f, 5.461f, 14.057f, 6.414f, 13.58f)
                curveTo(7.116f, 13.229f, 8.049f, 13.249f, 9.241f, 13.597f)
                lineTo(9.5f, 13.676f)
                verticalLineTo(9.508f)
                curveTo(9.5f, 8.055f, 10.342f, 7.0f, 11.75f, 7.0f)
                close()
                moveTo(11.75f, 8.5f)
                curveTo(11.29f, 8.5f, 11.037f, 8.775f, 11.004f, 9.366f)
                lineTo(11.0f, 9.508f)
                verticalLineTo(14.752f)
                curveTo(11.0f, 15.286f, 10.458f, 15.649f, 9.964f, 15.446f)
                curveTo(8.503f, 14.844f, 7.523f, 14.703f, 7.085f, 14.922f)
                curveTo(6.831f, 15.049f, 6.665f, 15.213f, 6.575f, 15.441f)
                lineTo(6.537f, 15.56f)
                lineTo(8.442f, 16.508f)
                lineTo(8.623f, 16.605f)
                lineTo(8.797f, 16.714f)
                lineTo(10.681f, 17.969f)
                curveTo(11.364f, 18.425f, 11.922f, 19.041f, 12.307f, 19.762f)
                lineTo(12.429f, 20.007f)
                lineTo(12.458f, 20.069f)
                curveTo(12.582f, 20.336f, 12.848f, 20.502f, 13.136f, 20.503f)
                lineTo(13.245f, 20.495f)
                lineTo(15.663f, 20.148f)
                curveTo(15.923f, 20.111f, 16.142f, 19.941f, 16.244f, 19.705f)
                lineTo(16.281f, 19.6f)
                lineTo(17.329f, 15.676f)
                curveTo(17.579f, 14.743f, 17.024f, 13.783f, 16.09f, 13.534f)
                lineTo(16.021f, 13.517f)
                lineTo(13.116f, 12.988f)
                curveTo(12.795f, 12.93f, 12.553f, 12.672f, 12.507f, 12.357f)
                lineTo(12.5f, 12.25f)
                verticalLineTo(9.508f)
                curveTo(12.5f, 8.819f, 12.245f, 8.5f, 11.75f, 8.5f)
                close()
                moveTo(11.749f, 2.0f)
                curveTo(15.753f, 2.0f, 18.999f, 5.246f, 18.999f, 9.251f)
                curveTo(18.999f, 10.237f, 18.802f, 11.177f, 18.446f, 12.034f)
                curveTo(18.07f, 11.702f, 17.632f, 11.434f, 17.141f, 11.249f)
                curveTo(17.373f, 10.627f, 17.499f, 9.954f, 17.499f, 9.251f)
                curveTo(17.499f, 6.075f, 14.925f, 3.5f, 11.749f, 3.5f)
                curveTo(8.573f, 3.5f, 5.998f, 6.075f, 5.998f, 9.251f)
                curveTo(5.998f, 10.404f, 6.338f, 11.478f, 6.923f, 12.379f)
                curveTo(6.585f, 12.434f, 6.267f, 12.536f, 5.967f, 12.686f)
                curveTo(5.806f, 12.766f, 5.655f, 12.855f, 5.512f, 12.952f)
                curveTo(4.869f, 11.87f, 4.498f, 10.603f, 4.498f, 9.251f)
                curveTo(4.498f, 5.246f, 7.744f, 2.0f, 11.749f, 2.0f)
                close()
                moveTo(11.749f, 4.502f)
                curveTo(14.371f, 4.502f, 16.497f, 6.628f, 16.497f, 9.251f)
                curveTo(16.497f, 9.869f, 16.379f, 10.459f, 16.165f, 11.001f)
                lineTo(15.0f, 10.789f)
                verticalLineTo(9.508f)
                lineTo(14.996f, 9.314f)
                lineTo(14.998f, 9.251f)
                curveTo(14.998f, 8.57f, 14.788f, 7.938f, 14.431f, 7.416f)
                lineTo(14.341f, 7.284f)
                curveTo(13.783f, 6.496f, 12.892f, 6.0f, 11.75f, 6.0f)
                curveTo(10.575f, 6.0f, 9.665f, 6.526f, 9.111f, 7.353f)
                curveTo(8.727f, 7.887f, 8.5f, 8.542f, 8.5f, 9.251f)
                lineTo(8.502f, 9.361f)
                lineTo(8.5f, 9.508f)
                verticalLineTo(12.398f)
                lineTo(8.238f, 12.362f)
                curveTo(8.0f, 12.332f, 7.781f, 12.219f, 7.621f, 12.041f)
                curveTo(7.207f, 11.584f, 7.0f, 10.654f, 7.0f, 9.251f)
                curveTo(7.0f, 6.628f, 9.126f, 4.502f, 11.749f, 4.502f)
                close()
            }
        }
        .build()
        return _tapDouble!!
    }

@Suppress("ObjectPropertyName")
private var _tapDouble: ImageVector? = null

@Preview
@Composable
private fun TapDoublePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TapDouble, contentDescription = null)
    }
}

