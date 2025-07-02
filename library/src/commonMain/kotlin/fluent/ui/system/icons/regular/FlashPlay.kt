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
 * FlashPlay icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: flash, play
 * - Source: ic_fluent_flash_play_20_regular.svg
 * 
 * @return The [ImageVector] for the FlashPlay icon.
 */
public val FluentIcons.Regular.FlashPlay: ImageVector
    get() {
        if (_flashPlay != null) {
            return _flashPlay!!
        }
        _flashPlay = Builder(name = "FlashPlay", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.192f, 2.771f)
                curveTo(6.322f, 2.314f, 6.739f, 2.0f, 7.213f, 2.0f)
                horizontalLineTo(12.462f)
                curveTo(13.187f, 2.0f, 13.699f, 2.71f, 13.47f, 3.398f)
                lineTo(13.467f, 3.406f)
                lineTo(12.206f, 7.0f)
                horizontalLineTo(14.77f)
                curveTo(15.716f, 7.0f, 16.177f, 8.144f, 15.536f, 8.811f)
                lineTo(15.533f, 8.815f)
                lineTo(15.296f, 9.057f)
                curveTo(15.036f, 9.019f, 14.77f, 9.0f, 14.5f, 9.0f)
                curveTo(14.305f, 9.0f, 14.112f, 9.01f, 13.922f, 9.03f)
                lineTo(14.816f, 8.118f)
                curveTo(14.828f, 8.105f, 14.831f, 8.095f, 14.833f, 8.086f)
                curveTo(14.834f, 8.075f, 14.833f, 8.059f, 14.826f, 8.042f)
                curveTo(14.819f, 8.025f, 14.809f, 8.014f, 14.801f, 8.008f)
                curveTo(14.796f, 8.004f, 14.788f, 8.0f, 14.77f, 8.0f)
                horizontalLineTo(11.501f)
                curveTo(11.339f, 8.0f, 11.186f, 7.921f, 11.093f, 7.789f)
                curveTo(10.999f, 7.657f, 10.975f, 7.487f, 11.029f, 7.334f)
                lineTo(12.522f, 3.08f)
                curveTo(12.534f, 3.04f, 12.504f, 3.0f, 12.462f, 3.0f)
                horizontalLineTo(7.213f)
                curveTo(7.185f, 3.0f, 7.161f, 3.018f, 7.153f, 3.045f)
                lineTo(4.903f, 10.919f)
                curveTo(4.892f, 10.959f, 4.922f, 10.998f, 4.963f, 10.998f)
                horizontalLineTo(6.871f)
                curveTo(7.025f, 10.998f, 7.17f, 11.069f, 7.265f, 11.191f)
                curveTo(7.36f, 11.312f, 7.394f, 11.47f, 7.356f, 11.62f)
                lineTo(6.031f, 16.92f)
                curveTo(6.027f, 16.935f, 6.028f, 16.945f, 6.028f, 16.949f)
                curveTo(6.028f, 16.953f, 6.029f, 16.957f, 6.031f, 16.96f)
                curveTo(6.035f, 16.968f, 6.044f, 16.98f, 6.061f, 16.99f)
                curveTo(6.079f, 16.999f, 6.094f, 17.001f, 6.103f, 17.0f)
                curveTo(6.106f, 16.999f, 6.11f, 16.998f, 6.114f, 16.996f)
                curveTo(6.117f, 16.994f, 6.126f, 16.99f, 6.137f, 16.978f)
                lineTo(6.14f, 16.975f)
                lineTo(9.019f, 14.035f)
                curveTo(9.007f, 14.189f, 9.0f, 14.344f, 9.0f, 14.5f)
                curveTo(9.0f, 14.809f, 9.026f, 15.113f, 9.075f, 15.408f)
                lineTo(6.856f, 17.673f)
                curveTo(6.102f, 18.455f, 4.797f, 17.733f, 5.061f, 16.677f)
                lineTo(6.231f, 11.998f)
                horizontalLineTo(4.963f)
                curveTo(4.258f, 11.998f, 3.748f, 11.323f, 3.942f, 10.644f)
                lineTo(6.192f, 2.771f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(16.713f, 14.063f)
                lineTo(13.743f, 12.413f)
                curveTo(13.41f, 12.227f, 13.0f, 12.469f, 13.0f, 12.85f)
                lineTo(13.0f, 16.15f)
                curveTo(13.0f, 16.531f, 13.41f, 16.772f, 13.743f, 16.587f)
                lineTo(16.713f, 14.937f)
                curveTo(17.056f, 14.747f, 17.056f, 14.253f, 16.713f, 14.063f)
                close()
            }
        }
        .build()
        return _flashPlay!!
    }

@Suppress("ObjectPropertyName")
private var _flashPlay: ImageVector? = null

@Preview
@Composable
private fun FlashPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FlashPlay, contentDescription = null)
    }
}

