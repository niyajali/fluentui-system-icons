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
 * VideoPersonStar icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: video, person, star
 * - Source: ic_fluent_video_person_star_24_regular.svg
 * 
 * @return The [ImageVector] for the VideoPersonStar icon.
 */
public val FluentIcons.Regular.VideoPersonStar: ImageVector
    get() {
        if (_videoPersonStar != null) {
            return _videoPersonStar!!
        }
        _videoPersonStar = Builder(name = "VideoPersonStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.745f, 4.0f)
                curveTo(20.988f, 4.0f, 21.995f, 5.007f, 21.995f, 6.25f)
                verticalLineTo(12.805f)
                curveTo(21.551f, 12.38f, 21.046f, 12.016f, 20.495f, 11.73f)
                verticalLineTo(6.25f)
                curveTo(20.495f, 5.836f, 20.16f, 5.5f, 19.745f, 5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(3.5f, 18.169f, 3.836f, 18.505f, 4.25f, 18.505f)
                lineTo(6.999f, 18.504f)
                lineTo(7.0f, 15.75f)
                curveTo(7.0f, 14.832f, 7.707f, 14.079f, 8.606f, 14.006f)
                lineTo(8.75f, 14.0f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 14.463f, 11.486f, 14.967f, 11.314f, 15.5f)
                horizontalLineTo(8.75f)
                curveTo(8.632f, 15.5f, 8.533f, 15.582f, 8.507f, 15.693f)
                lineTo(8.5f, 15.75f)
                lineTo(8.499f, 18.504f)
                horizontalLineTo(11.077f)
                curveTo(11.158f, 19.028f, 11.302f, 19.53f, 11.5f, 20.005f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.005f, 2.0f, 18.997f, 2.0f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.007f, 3.007f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.745f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(13.657f, 7.0f, 15.0f, 8.344f, 15.0f, 10.0f)
                curveTo(15.0f, 11.657f, 13.657f, 13.0f, 12.0f, 13.0f)
                curveTo(10.343f, 13.0f, 9.0f, 11.657f, 9.0f, 10.0f)
                curveTo(9.0f, 8.344f, 10.343f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 8.5f)
                curveTo(11.172f, 8.5f, 10.5f, 9.172f, 10.5f, 10.0f)
                curveTo(10.5f, 10.829f, 11.172f, 11.5f, 12.0f, 11.5f)
                curveTo(12.828f, 11.5f, 13.5f, 10.829f, 13.5f, 10.0f)
                curveTo(13.5f, 9.172f, 12.828f, 8.5f, 12.0f, 8.5f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.538f, 20.538f, 23.0f, 17.5f, 23.0f)
                curveTo(14.462f, 23.0f, 12.0f, 20.538f, 12.0f, 17.5f)
                curveTo(12.0f, 14.462f, 14.462f, 12.0f, 17.5f, 12.0f)
                curveTo(20.538f, 12.0f, 23.0f, 14.462f, 23.0f, 17.5f)
                close()
                moveTo(18.055f, 14.421f)
                curveTo(17.881f, 13.86f, 17.119f, 13.86f, 16.945f, 14.421f)
                lineTo(16.388f, 16.208f)
                horizontalLineTo(14.585f)
                curveTo(14.019f, 16.208f, 13.784f, 16.962f, 14.242f, 17.309f)
                lineTo(15.7f, 18.413f)
                lineTo(15.143f, 20.2f)
                curveTo(14.968f, 20.761f, 15.584f, 21.228f, 16.042f, 20.881f)
                lineTo(17.5f, 19.777f)
                lineTo(18.958f, 20.881f)
                curveTo(19.416f, 21.228f, 20.032f, 20.761f, 19.857f, 20.2f)
                lineTo(19.3f, 18.413f)
                lineTo(20.758f, 17.309f)
                curveTo(21.216f, 16.962f, 20.981f, 16.208f, 20.415f, 16.208f)
                horizontalLineTo(18.612f)
                lineTo(18.055f, 14.421f)
                close()
            }
        }
        .build()
        return _videoPersonStar!!
    }

@Suppress("ObjectPropertyName")
private var _videoPersonStar: ImageVector? = null

@Preview
@Composable
private fun VideoPersonStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoPersonStar, contentDescription = null)
    }
}

