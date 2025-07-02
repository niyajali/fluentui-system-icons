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
 * VideoBackgroundEffect icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: video, background, effect
 * - Source: ic_fluent_video_background_effect_24_regular.svg
 * 
 * @return The [ImageVector] for the VideoBackgroundEffect icon.
 */
public val FluentIcons.Regular.VideoBackgroundEffect: ImageVector
    get() {
        if (_videoBackgroundEffect != null) {
            return _videoBackgroundEffect!!
        }
        _videoBackgroundEffect = Builder(name = "VideoBackgroundEffect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 16.938f)
                verticalLineTo(19.059f)
                lineTo(5.059f, 20.0f)
                horizontalLineTo(2.939f)
                lineTo(6.0f, 16.938f)
                close()
                moveTo(22.001f, 14.435f)
                verticalLineTo(16.557f)
                lineTo(18.559f, 20.0f)
                horizontalLineTo(17.993f)
                lineTo(17.994f, 18.443f)
                lineTo(22.001f, 14.435f)
                close()
                moveTo(8.75f, 14.0f)
                horizontalLineTo(15.245f)
                curveTo(16.163f, 14.0f, 16.916f, 14.707f, 16.989f, 15.606f)
                lineTo(16.995f, 15.75f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.495f)
                verticalLineTo(15.75f)
                curveTo(15.495f, 15.632f, 15.412f, 15.533f, 15.302f, 15.507f)
                lineTo(15.245f, 15.5f)
                horizontalLineTo(8.75f)
                curveTo(8.632f, 15.5f, 8.532f, 15.582f, 8.506f, 15.693f)
                lineTo(8.5f, 15.75f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.75f)
                curveTo(7.0f, 14.832f, 7.707f, 14.079f, 8.606f, 14.006f)
                lineTo(8.75f, 14.0f)
                close()
                moveTo(8.021f, 10.416f)
                curveTo(8.081f, 10.995f, 8.264f, 11.537f, 8.544f, 12.015f)
                lineTo(2.0f, 18.56f)
                verticalLineTo(16.438f)
                lineTo(8.021f, 10.416f)
                close()
                moveTo(22.001f, 9.932f)
                verticalLineTo(12.055f)
                lineTo(17.994f, 16.065f)
                lineTo(17.995f, 15.75f)
                lineTo(17.99f, 15.583f)
                curveTo(17.962f, 15.128f, 17.825f, 14.703f, 17.603f, 14.335f)
                lineTo(22.001f, 9.932f)
                close()
                moveTo(12.057f, 4.0f)
                lineTo(2.0f, 14.06f)
                verticalLineTo(11.939f)
                lineTo(9.936f, 4.0f)
                horizontalLineTo(12.057f)
                close()
                moveTo(22.001f, 5.432f)
                verticalLineTo(7.555f)
                lineTo(16.335f, 13.224f)
                curveTo(16.067f, 13.109f, 15.778f, 13.035f, 15.475f, 13.009f)
                lineTo(15.245f, 13.0f)
                lineTo(14.646f, 13.0f)
                curveTo(14.987f, 12.699f, 15.277f, 12.34f, 15.5f, 11.938f)
                lineTo(22.001f, 5.432f)
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
                moveTo(7.559f, 4.0f)
                lineTo(2.0f, 9.56f)
                verticalLineTo(7.438f)
                lineTo(5.438f, 4.0f)
                horizontalLineTo(7.559f)
                close()
                moveTo(21.056f, 4.0f)
                lineTo(15.909f, 9.149f)
                curveTo(15.792f, 8.61f, 15.567f, 8.112f, 15.257f, 7.678f)
                lineTo(18.934f, 4.0f)
                horizontalLineTo(21.056f)
                close()
                moveTo(16.559f, 4.0f)
                lineTo(14.015f, 6.544f)
                curveTo(13.536f, 6.265f, 12.994f, 6.082f, 12.416f, 6.022f)
                lineTo(14.436f, 4.0f)
                horizontalLineTo(16.559f)
                close()
            }
        }
        .build()
        return _videoBackgroundEffect!!
    }

@Suppress("ObjectPropertyName")
private var _videoBackgroundEffect: ImageVector? = null

@Preview
@Composable
private fun VideoBackgroundEffectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoBackgroundEffect, contentDescription = null)
    }
}

