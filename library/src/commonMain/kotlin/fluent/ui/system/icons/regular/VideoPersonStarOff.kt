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
 * VideoPersonStarOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: video, person, star, off
 * - Source: ic_fluent_video_person_star_off_24_regular.svg
 * 
 * @return The [ImageVector] for the VideoPersonStarOff icon.
 */
public val FluentIcons.Regular.VideoPersonStarOff: ImageVector
    get() {
        if (_videoPersonStarOff != null) {
            return _videoPersonStarOff!!
        }
        _videoPersonStarOff = Builder(name = "VideoPersonStarOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(3.199f, 4.26f)
                curveTo(2.486f, 4.637f, 2.0f, 5.387f, 2.0f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(2.0f, 18.997f, 3.007f, 20.005f, 4.25f, 20.005f)
                horizontalLineTo(11.5f)
                curveTo(11.302f, 19.53f, 11.158f, 19.028f, 11.077f, 18.504f)
                horizontalLineTo(8.499f)
                lineTo(8.5f, 15.75f)
                lineTo(8.507f, 15.693f)
                curveTo(8.533f, 15.582f, 8.632f, 15.5f, 8.75f, 15.5f)
                horizontalLineTo(11.314f)
                curveTo(11.486f, 14.967f, 11.725f, 14.463f, 12.022f, 14.0f)
                horizontalLineTo(8.75f)
                lineTo(8.606f, 14.006f)
                curveTo(7.707f, 14.079f, 7.0f, 14.832f, 7.0f, 15.75f)
                lineTo(6.999f, 18.504f)
                lineTo(4.25f, 18.505f)
                curveTo(3.836f, 18.505f, 3.5f, 18.169f, 3.5f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.836f, 3.836f, 5.5f, 4.25f, 5.5f)
                horizontalLineTo(4.439f)
                lineTo(9.001f, 10.061f)
                curveTo(9.033f, 11.67f, 10.331f, 12.968f, 11.939f, 13.0f)
                lineTo(13.117f, 14.177f)
                curveTo(12.416f, 15.101f, 12.0f, 16.252f, 12.0f, 17.5f)
                curveTo(12.0f, 20.538f, 14.462f, 23.0f, 17.5f, 23.0f)
                curveTo(18.753f, 23.0f, 19.909f, 22.581f, 20.834f, 21.875f)
                curveTo(21.125f, 22.069f, 21.523f, 22.038f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(19.736f, 20.797f)
                curveTo(19.55f, 21.008f, 19.227f, 21.084f, 18.958f, 20.881f)
                lineTo(17.5f, 19.777f)
                lineTo(16.042f, 20.881f)
                curveTo(15.584f, 21.228f, 14.968f, 20.761f, 15.143f, 20.2f)
                lineTo(15.7f, 18.413f)
                lineTo(14.242f, 17.309f)
                curveTo(13.784f, 16.962f, 14.019f, 16.208f, 14.585f, 16.208f)
                horizontalLineTo(15.147f)
                lineTo(19.736f, 20.797f)
                close()
                moveTo(10.554f, 7.372f)
                lineTo(11.71f, 8.528f)
                curveTo(11.804f, 8.51f, 11.901f, 8.5f, 12.0f, 8.5f)
                curveTo(12.828f, 8.5f, 13.5f, 9.172f, 13.5f, 10.0f)
                curveTo(13.5f, 10.1f, 13.49f, 10.196f, 13.472f, 10.29f)
                lineTo(14.629f, 11.447f)
                curveTo(14.865f, 11.018f, 15.0f, 10.525f, 15.0f, 10.0f)
                curveTo(15.0f, 8.344f, 13.657f, 7.0f, 12.0f, 7.0f)
                curveTo(11.476f, 7.0f, 10.982f, 7.135f, 10.554f, 7.372f)
                close()
                moveTo(15.541f, 12.359f)
                lineTo(17.242f, 14.06f)
                curveTo(17.536f, 13.914f, 17.935f, 14.034f, 18.055f, 14.421f)
                lineTo(18.26f, 15.079f)
                lineTo(19.389f, 16.208f)
                horizontalLineTo(20.415f)
                curveTo(20.981f, 16.208f, 21.216f, 16.962f, 20.758f, 17.309f)
                lineTo(20.606f, 17.424f)
                lineTo(22.641f, 19.459f)
                curveTo(22.873f, 18.851f, 23.0f, 18.19f, 23.0f, 17.5f)
                curveTo(23.0f, 14.462f, 20.538f, 12.0f, 17.5f, 12.0f)
                curveTo(16.81f, 12.0f, 16.149f, 12.127f, 15.541f, 12.359f)
                close()
                moveTo(7.182f, 4.0f)
                lineTo(8.682f, 5.5f)
                horizontalLineTo(19.745f)
                curveTo(20.16f, 5.5f, 20.495f, 5.836f, 20.495f, 6.25f)
                verticalLineTo(11.73f)
                curveTo(21.046f, 12.016f, 21.551f, 12.38f, 21.995f, 12.805f)
                verticalLineTo(6.25f)
                curveTo(21.995f, 5.007f, 20.988f, 4.0f, 19.745f, 4.0f)
                horizontalLineTo(7.182f)
                close()
            }
        }
        .build()
        return _videoPersonStarOff!!
    }

@Suppress("ObjectPropertyName")
private var _videoPersonStarOff: ImageVector? = null

@Preview
@Composable
private fun VideoPersonStarOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoPersonStarOff, contentDescription = null)
    }
}

