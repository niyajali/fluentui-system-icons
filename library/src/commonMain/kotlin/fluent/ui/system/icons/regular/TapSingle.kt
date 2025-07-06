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
 * TapSingle Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent tap actions in touchscreen scenarios. Contains single and double tap variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tap_single_24_regular.svg)
 * 
 * @return The [ImageVector] for the TapSingle icon.
 */
public val FluentIcons.Regular.TapSingle: ImageVector
    get() {
        if (_tapSingle != null) {
            return _tapSingle!!
        }
        _tapSingle = Builder(name = "TapSingle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.75f, 6.0f)
                curveTo(13.099f, 6.0f, 13.929f, 6.969f, 13.996f, 8.329f)
                lineTo(14.0f, 8.508f)
                verticalLineTo(10.624f)
                lineTo(16.219f, 11.027f)
                curveTo(16.306f, 11.042f, 16.392f, 11.062f, 16.478f, 11.085f)
                curveTo(18.152f, 11.532f, 19.17f, 13.208f, 18.821f, 14.884f)
                lineTo(18.779f, 15.063f)
                lineTo(17.731f, 18.986f)
                curveTo(17.513f, 19.803f, 16.858f, 20.423f, 16.042f, 20.603f)
                lineTo(15.876f, 20.633f)
                lineTo(13.458f, 20.98f)
                curveTo(12.534f, 21.113f, 11.63f, 20.66f, 11.178f, 19.856f)
                lineTo(11.099f, 19.702f)
                lineTo(11.069f, 19.639f)
                curveTo(10.835f, 19.134f, 10.482f, 18.695f, 10.043f, 18.356f)
                lineTo(9.85f, 18.217f)
                lineTo(7.966f, 16.962f)
                lineTo(7.872f, 16.903f)
                lineTo(7.775f, 16.851f)
                lineTo(5.412f, 15.675f)
                curveTo(5.162f, 15.551f, 5.002f, 15.299f, 4.996f, 15.021f)
                curveTo(4.971f, 13.912f, 5.462f, 13.057f, 6.415f, 12.58f)
                curveTo(7.117f, 12.229f, 8.05f, 12.249f, 9.241f, 12.597f)
                lineTo(9.5f, 12.676f)
                verticalLineTo(8.508f)
                curveTo(9.5f, 7.055f, 10.343f, 6.0f, 11.75f, 6.0f)
                close()
                moveTo(11.75f, 7.5f)
                curveTo(11.29f, 7.5f, 11.038f, 7.775f, 11.004f, 8.366f)
                lineTo(11.0f, 8.508f)
                verticalLineTo(13.752f)
                curveTo(11.0f, 14.286f, 10.458f, 14.649f, 9.964f, 14.446f)
                curveTo(8.504f, 13.843f, 7.523f, 13.703f, 7.086f, 13.922f)
                curveTo(6.832f, 14.049f, 6.666f, 14.212f, 6.576f, 14.441f)
                lineTo(6.538f, 14.56f)
                lineTo(8.443f, 15.508f)
                lineTo(8.624f, 15.605f)
                lineTo(8.798f, 15.714f)
                lineTo(10.682f, 16.969f)
                curveTo(11.365f, 17.424f, 11.922f, 18.041f, 12.308f, 18.762f)
                lineTo(12.429f, 19.007f)
                lineTo(12.459f, 19.069f)
                curveTo(12.583f, 19.336f, 12.849f, 19.502f, 13.137f, 19.503f)
                lineTo(13.245f, 19.495f)
                lineTo(15.663f, 19.148f)
                curveTo(15.924f, 19.111f, 16.142f, 18.941f, 16.245f, 18.704f)
                lineTo(16.281f, 18.599f)
                lineTo(17.33f, 14.676f)
                curveTo(17.579f, 13.742f, 17.024f, 12.783f, 16.091f, 12.534f)
                lineTo(16.021f, 12.517f)
                lineTo(13.116f, 11.988f)
                curveTo(12.795f, 11.929f, 12.553f, 11.672f, 12.508f, 11.357f)
                lineTo(12.5f, 11.25f)
                verticalLineTo(8.508f)
                curveTo(12.5f, 7.819f, 12.246f, 7.5f, 11.75f, 7.5f)
                close()
                moveTo(11.749f, 2.5f)
                curveTo(14.925f, 2.5f, 17.5f, 5.075f, 17.5f, 8.25f)
                curveTo(17.5f, 8.953f, 17.374f, 9.627f, 17.143f, 10.249f)
                lineTo(16.999f, 10.196f)
                curveTo(16.854f, 10.146f, 16.649f, 10.08f, 16.391f, 10.021f)
                curveTo(16.151f, 9.965f, 15.908f, 9.928f, 15.664f, 9.909f)
                curveTo(15.88f, 9.399f, 16.0f, 8.839f, 16.0f, 8.25f)
                curveTo(16.0f, 5.903f, 14.097f, 4.0f, 11.749f, 4.0f)
                curveTo(9.402f, 4.0f, 7.499f, 5.903f, 7.499f, 8.25f)
                curveTo(7.499f, 9.295f, 7.875f, 10.251f, 8.5f, 10.991f)
                curveTo(8.177f, 11.019f, 7.902f, 11.06f, 7.676f, 11.114f)
                curveTo(7.325f, 11.199f, 7.088f, 11.284f, 6.924f, 11.377f)
                curveTo(6.339f, 10.479f, 5.999f, 9.404f, 5.999f, 8.25f)
                curveTo(5.999f, 5.075f, 8.573f, 2.5f, 11.749f, 2.5f)
                close()
            }
        }
        .build()
        return _tapSingle!!
    }

@Suppress("ObjectPropertyName")
private var _tapSingle: ImageVector? = null

@Preview
@Composable
private fun TapSinglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TapSingle, contentDescription = "TapSingle Icon")
    }
}

