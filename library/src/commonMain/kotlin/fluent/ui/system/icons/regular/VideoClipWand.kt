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
 * VideoClipWand Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent video content enhanced.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_clip_wand_24_regular.svg)
 * 
 * @return The [ImageVector] for the VideoClipWand icon.
 */
public val FluentIcons.Regular.VideoClipWand: ImageVector
    get() {
        if (_videoClipWand != null) {
            return _videoClipWand!!
        }
        _videoClipWand = Builder(name = "VideoClipWand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.25f, 2.0f)
                curveTo(2.455f, 2.0f, 1.0f, 3.455f, 1.0f, 5.25f)
                verticalLineTo(16.75f)
                curveTo(1.0f, 18.545f, 2.455f, 20.0f, 4.25f, 20.0f)
                horizontalLineTo(11.525f)
                lineTo(13.025f, 18.5f)
                horizontalLineTo(4.25f)
                curveTo(3.283f, 18.5f, 2.5f, 17.716f, 2.5f, 16.75f)
                verticalLineTo(5.25f)
                curveTo(2.5f, 4.284f, 3.283f, 3.5f, 4.25f, 3.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 3.5f, 19.5f, 4.284f, 19.5f, 5.25f)
                verticalLineTo(9.314f)
                curveTo(19.896f, 9.59f, 20.174f, 10.026f, 20.237f, 10.536f)
                lineTo(20.376f, 11.666f)
                curveTo(20.438f, 12.169f, 20.664f, 12.62f, 21.0f, 12.964f)
                verticalLineTo(5.25f)
                curveTo(21.0f, 3.455f, 19.545f, 2.0f, 17.75f, 2.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(19.5f, 12.338f)
                curveTo(19.705f, 13.012f, 20.121f, 13.591f, 20.671f, 14.0f)
                curveTo(21.111f, 14.327f, 21.638f, 14.546f, 22.212f, 14.617f)
                lineTo(23.342f, 14.756f)
                curveTo(23.718f, 14.802f, 24.0f, 15.121f, 24.0f, 15.5f)
                curveTo(24.0f, 15.879f, 23.718f, 16.198f, 23.342f, 16.244f)
                lineTo(22.212f, 16.383f)
                curveTo(20.732f, 16.566f, 19.566f, 17.732f, 19.383f, 19.212f)
                lineTo(19.244f, 20.342f)
                curveTo(19.198f, 20.718f, 18.879f, 21.0f, 18.5f, 21.0f)
                curveTo(18.121f, 21.0f, 17.802f, 20.718f, 17.756f, 20.342f)
                lineTo(17.617f, 19.212f)
                curveTo(17.434f, 17.732f, 16.268f, 16.566f, 14.788f, 16.383f)
                lineTo(13.658f, 16.244f)
                curveTo(13.282f, 16.198f, 13.0f, 15.879f, 13.0f, 15.5f)
                curveTo(13.0f, 15.121f, 13.282f, 14.802f, 13.658f, 14.756f)
                lineTo(14.788f, 14.617f)
                curveTo(16.268f, 14.434f, 17.434f, 13.268f, 17.617f, 11.788f)
                lineTo(17.756f, 10.658f)
                curveTo(17.802f, 10.282f, 18.121f, 10.0f, 18.5f, 10.0f)
                curveTo(18.879f, 10.0f, 19.198f, 10.282f, 19.244f, 10.658f)
                lineTo(19.383f, 11.788f)
                curveTo(19.407f, 11.977f, 19.446f, 12.161f, 19.5f, 12.338f)
                close()
                moveTo(16.774f, 15.5f)
                curveTo(17.489f, 15.915f, 18.085f, 16.511f, 18.5f, 17.226f)
                curveTo(18.915f, 16.511f, 19.511f, 15.915f, 20.226f, 15.5f)
                curveTo(19.511f, 15.085f, 18.915f, 14.489f, 18.5f, 13.774f)
                curveTo(18.085f, 14.489f, 17.489f, 15.085f, 16.774f, 15.5f)
                close()
                moveTo(14.72f, 18.22f)
                curveTo(15.013f, 17.927f, 15.487f, 17.927f, 15.78f, 18.22f)
                curveTo(16.073f, 18.513f, 16.073f, 18.987f, 15.78f, 19.28f)
                lineTo(11.28f, 23.78f)
                curveTo(10.987f, 24.073f, 10.513f, 24.073f, 10.22f, 23.78f)
                curveTo(9.927f, 23.487f, 9.927f, 23.013f, 10.22f, 22.72f)
                lineTo(14.72f, 18.22f)
                close()
                moveTo(8.0f, 13.75f)
                verticalLineTo(8.251f)
                curveTo(8.0f, 7.49f, 8.815f, 7.008f, 9.482f, 7.374f)
                lineTo(14.481f, 10.124f)
                curveTo(15.172f, 10.504f, 15.172f, 11.497f, 14.481f, 11.877f)
                lineTo(9.482f, 14.626f)
                curveTo(8.815f, 14.993f, 8.0f, 14.511f, 8.0f, 13.75f)
                close()
            }
        }
        .build()
        return _videoClipWand!!
    }

@Suppress("ObjectPropertyName")
private var _videoClipWand: ImageVector? = null

@Preview
@Composable
private fun VideoClipWandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoClipWand, contentDescription = "VideoClipWand Icon")
    }
}

