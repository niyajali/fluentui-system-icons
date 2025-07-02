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
 * ThumbLike icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: thumb, like
 * - Source: ic_fluent_thumb_like_24_regular.svg
 * 
 * @return The [ImageVector] for the ThumbLike icon.
 */
public val FluentIcons.Regular.ThumbLike: ImageVector
    get() {
        if (_thumbLike != null) {
            return _thumbLike!!
        }
        _thumbLike = Builder(name = "ThumbLike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 5.203f)
                curveTo(16.5f, 2.761f, 15.359f, 1.004f, 13.493f, 1.004f)
                curveTo(12.467f, 1.004f, 12.115f, 1.605f, 11.747f, 3.003f)
                curveTo(11.672f, 3.292f, 11.635f, 3.433f, 11.596f, 3.572f)
                curveTo(11.495f, 3.93f, 11.319f, 4.541f, 11.069f, 5.403f)
                curveTo(11.062f, 5.426f, 11.052f, 5.447f, 11.04f, 5.467f)
                lineTo(8.173f, 9.953f)
                curveTo(7.495f, 11.014f, 6.494f, 11.83f, 5.318f, 12.28f)
                lineTo(4.845f, 12.461f)
                curveTo(3.598f, 12.938f, 2.875f, 14.242f, 3.129f, 15.553f)
                lineTo(3.533f, 17.639f)
                curveTo(3.775f, 18.884f, 4.718f, 19.875f, 5.95f, 20.177f)
                lineTo(13.578f, 22.046f)
                curveTo(16.109f, 22.667f, 18.667f, 21.132f, 19.311f, 18.606f)
                lineTo(20.726f, 13.057f)
                curveTo(21.17f, 11.318f, 20.119f, 9.548f, 18.38f, 9.105f)
                curveTo(18.118f, 9.038f, 17.848f, 9.004f, 17.577f, 9.004f)
                horizontalLineTo(15.754f)
                curveTo(16.25f, 7.371f, 16.5f, 6.112f, 16.5f, 5.203f)
                close()
                moveTo(4.601f, 15.267f)
                curveTo(4.486f, 14.672f, 4.815f, 14.079f, 5.381f, 13.862f)
                lineTo(5.855f, 13.681f)
                curveTo(7.33f, 13.116f, 8.586f, 12.092f, 9.437f, 10.761f)
                lineTo(12.304f, 6.275f)
                curveTo(12.394f, 6.134f, 12.463f, 5.981f, 12.509f, 5.821f)
                curveTo(12.761f, 4.956f, 12.938f, 4.342f, 13.04f, 3.978f)
                curveTo(13.083f, 3.825f, 13.124f, 3.669f, 13.198f, 3.385f)
                curveTo(13.387f, 2.663f, 13.481f, 2.504f, 13.493f, 2.504f)
                curveTo(14.361f, 2.504f, 15.0f, 3.488f, 15.0f, 5.203f)
                curveTo(15.0f, 6.087f, 14.674f, 7.538f, 14.016f, 9.518f)
                curveTo(13.854f, 10.003f, 14.216f, 10.504f, 14.727f, 10.504f)
                horizontalLineTo(17.577f)
                curveTo(17.723f, 10.504f, 17.868f, 10.522f, 18.009f, 10.559f)
                curveTo(18.946f, 10.797f, 19.511f, 11.75f, 19.273f, 12.687f)
                lineTo(17.858f, 18.236f)
                curveTo(17.417f, 19.964f, 15.667f, 21.014f, 13.935f, 20.589f)
                lineTo(6.307f, 18.72f)
                curveTo(5.644f, 18.557f, 5.136f, 18.024f, 5.006f, 17.353f)
                lineTo(4.601f, 15.267f)
                close()
            }
        }
        .build()
        return _thumbLike!!
    }

@Suppress("ObjectPropertyName")
private var _thumbLike: ImageVector? = null

@Preview
@Composable
private fun ThumbLikePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ThumbLike, contentDescription = null)
    }
}

