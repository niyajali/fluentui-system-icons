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

package fluent.ui.system.icons.light

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
 * Sticker Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used to represent sticker collections in UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_sticker_32_light.svg)
 * 
 * @return The [ImageVector] for the Sticker icon.
 */
public val FluentIcons.Light.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                curveTo(12.105f, 9.0f, 13.0f, 9.895f, 13.0f, 11.0f)
                curveTo(13.0f, 12.105f, 12.105f, 13.0f, 11.0f, 13.0f)
                curveTo(9.895f, 13.0f, 9.0f, 12.105f, 9.0f, 11.0f)
                curveTo(9.0f, 9.895f, 9.895f, 9.0f, 11.0f, 9.0f)
                close()
                moveTo(21.0f, 9.0f)
                curveTo(22.105f, 9.0f, 23.0f, 9.895f, 23.0f, 11.0f)
                curveTo(23.0f, 12.105f, 22.105f, 13.0f, 21.0f, 13.0f)
                curveTo(19.895f, 13.0f, 19.0f, 12.105f, 19.0f, 11.0f)
                curveTo(19.0f, 9.895f, 19.895f, 9.0f, 21.0f, 9.0f)
                close()
                moveTo(24.5f, 3.0f)
                curveTo(26.985f, 3.0f, 29.0f, 5.015f, 29.0f, 7.5f)
                verticalLineTo(17.093f)
                curveTo(29.0f, 18.286f, 28.526f, 19.431f, 27.682f, 20.275f)
                lineTo(20.275f, 27.682f)
                curveTo(19.431f, 28.526f, 18.286f, 29.0f, 17.093f, 29.0f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29.0f, 3.0f, 26.985f, 3.0f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 5.015f, 5.015f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(24.5f)
                close()
                moveTo(7.5f, 4.0f)
                curveTo(5.567f, 4.0f, 4.0f, 5.567f, 4.0f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(4.0f, 26.433f, 5.567f, 28.0f, 7.5f, 28.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.83f)
                curveTo(13.861f, 22.717f, 12.183f, 21.897f, 11.024f, 21.081f)
                curveTo(10.401f, 20.642f, 9.925f, 20.203f, 9.603f, 19.871f)
                curveTo(9.441f, 19.705f, 9.318f, 19.565f, 9.234f, 19.466f)
                curveTo(9.192f, 19.416f, 9.16f, 19.376f, 9.138f, 19.348f)
                curveTo(9.127f, 19.334f, 9.118f, 19.323f, 9.111f, 19.315f)
                curveTo(9.108f, 19.31f, 9.105f, 19.307f, 9.104f, 19.305f)
                lineTo(9.101f, 19.302f)
                verticalLineTo(19.3f)
                curveTo(9.101f, 19.3f, 9.1f, 19.299f, 9.5f, 19.0f)
                lineTo(9.1f, 19.299f)
                curveTo(8.935f, 19.078f, 8.98f, 18.765f, 9.201f, 18.6f)
                curveTo(9.422f, 18.435f, 9.734f, 18.48f, 9.899f, 18.701f)
                curveTo(9.899f, 18.701f, 9.902f, 18.703f, 9.903f, 18.705f)
                curveTo(9.907f, 18.71f, 9.913f, 18.717f, 9.921f, 18.728f)
                curveTo(9.937f, 18.748f, 9.963f, 18.78f, 9.998f, 18.821f)
                curveTo(10.068f, 18.905f, 10.176f, 19.026f, 10.319f, 19.174f)
                curveTo(10.607f, 19.469f, 11.037f, 19.867f, 11.601f, 20.264f)
                curveTo(12.638f, 20.994f, 14.119f, 21.717f, 16.0f, 21.828f)
                verticalLineTo(21.0f)
                curveTo(16.0f, 18.239f, 18.239f, 16.0f, 21.0f, 16.0f)
                horizontalLineTo(28.0f)
                verticalLineTo(7.5f)
                curveTo(28.0f, 5.567f, 26.433f, 4.0f, 24.5f, 4.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(21.0f, 17.0f)
                curveTo(18.791f, 17.0f, 17.0f, 18.791f, 17.0f, 21.0f)
                verticalLineTo(28.0f)
                horizontalLineTo(17.093f)
                curveTo(18.021f, 28.0f, 18.912f, 27.631f, 19.568f, 26.975f)
                lineTo(26.975f, 19.568f)
                curveTo(27.631f, 18.912f, 28.0f, 18.021f, 28.0f, 17.093f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

@Suppress("ObjectPropertyName")
private var _sticker: ImageVector? = null

@Preview
@Composable
private fun StickerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Sticker, contentDescription = "Sticker Icon")
    }
}

