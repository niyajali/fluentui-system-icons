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
 * Wand Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in smart edits to content and other AI touch up scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_wand_24_regular.svg)
 * 
 * @return The [ImageVector] for the Wand icon.
 */
public val FluentIcons.Regular.Wand: ImageVector
    get() {
        if (_wand != null) {
            return _wand!!
        }
        _wand = Builder(name = "Wand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.314f, 7.565f)
                lineTo(13.177f, 7.691f)
                lineTo(2.698f, 18.178f)
                curveTo(1.812f, 19.065f, 1.813f, 20.502f, 2.699f, 21.388f)
                curveTo(3.586f, 22.274f, 5.023f, 22.274f, 5.909f, 21.387f)
                lineTo(16.388f, 10.9f)
                curveTo(17.265f, 10.021f, 17.265f, 8.597f, 16.387f, 7.718f)
                lineTo(16.23f, 7.571f)
                curveTo(15.393f, 6.854f, 14.153f, 6.852f, 13.314f, 7.565f)
                close()
                moveTo(12.466f, 10.526f)
                lineTo(13.554f, 11.614f)
                lineTo(4.848f, 20.327f)
                curveTo(4.547f, 20.628f, 4.06f, 20.628f, 3.76f, 20.327f)
                curveTo(3.459f, 20.027f, 3.459f, 19.539f, 3.759f, 19.239f)
                lineTo(12.466f, 10.526f)
                close()
                moveTo(16.852f, 15.007f)
                lineTo(16.75f, 15.0f)
                curveTo(16.37f, 15.0f, 16.056f, 15.282f, 16.007f, 15.648f)
                lineTo(16.0f, 15.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(15.25f)
                curveTo(14.87f, 16.5f, 14.557f, 16.782f, 14.507f, 17.148f)
                lineTo(14.5f, 17.25f)
                curveTo(14.5f, 17.63f, 14.782f, 17.944f, 15.148f, 17.993f)
                lineTo(15.25f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.75f)
                curveTo(16.0f, 19.13f, 16.282f, 19.444f, 16.648f, 19.493f)
                lineTo(16.75f, 19.5f)
                curveTo(17.13f, 19.5f, 17.444f, 19.218f, 17.493f, 18.852f)
                lineTo(17.5f, 18.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.25f)
                curveTo(18.63f, 18.0f, 18.944f, 17.718f, 18.993f, 17.352f)
                lineTo(19.0f, 17.25f)
                curveTo(19.0f, 16.87f, 18.718f, 16.556f, 18.352f, 16.507f)
                lineTo(18.25f, 16.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.75f)
                curveTo(17.5f, 15.37f, 17.218f, 15.057f, 16.852f, 15.007f)
                lineTo(16.75f, 15.0f)
                lineTo(16.852f, 15.007f)
                close()
                moveTo(15.299f, 8.752f)
                lineTo(15.326f, 8.779f)
                curveTo(15.619f, 9.072f, 15.619f, 9.547f, 15.327f, 9.84f)
                lineTo(14.615f, 10.553f)
                lineTo(13.526f, 9.464f)
                lineTo(14.256f, 8.735f)
                curveTo(14.55f, 8.459f, 15.012f, 8.464f, 15.299f, 8.752f)
                close()
                moveTo(6.852f, 5.007f)
                lineTo(6.75f, 5.0f)
                curveTo(6.37f, 5.0f, 6.057f, 5.282f, 6.007f, 5.648f)
                lineTo(6.0f, 5.75f)
                verticalLineTo(6.5f)
                horizontalLineTo(5.25f)
                curveTo(4.87f, 6.5f, 4.557f, 6.782f, 4.507f, 7.148f)
                lineTo(4.5f, 7.25f)
                curveTo(4.5f, 7.63f, 4.782f, 7.943f, 5.148f, 7.993f)
                lineTo(5.25f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.75f)
                curveTo(6.0f, 9.13f, 6.282f, 9.443f, 6.648f, 9.493f)
                lineTo(6.75f, 9.5f)
                curveTo(7.13f, 9.5f, 7.443f, 9.218f, 7.493f, 8.852f)
                lineTo(7.5f, 8.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.25f)
                curveTo(8.63f, 8.0f, 8.943f, 7.718f, 8.993f, 7.352f)
                lineTo(9.0f, 7.25f)
                curveTo(9.0f, 6.87f, 8.718f, 6.557f, 8.352f, 6.507f)
                lineTo(8.25f, 6.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(5.75f)
                curveTo(7.5f, 5.37f, 7.218f, 5.057f, 6.852f, 5.007f)
                lineTo(6.75f, 5.0f)
                lineTo(6.852f, 5.007f)
                close()
                moveTo(18.852f, 3.007f)
                lineTo(18.75f, 3.0f)
                curveTo(18.37f, 3.0f, 18.056f, 3.282f, 18.007f, 3.648f)
                lineTo(18.0f, 3.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(17.25f)
                curveTo(16.87f, 4.5f, 16.556f, 4.782f, 16.507f, 5.148f)
                lineTo(16.5f, 5.25f)
                curveTo(16.5f, 5.63f, 16.782f, 5.943f, 17.148f, 5.993f)
                lineTo(17.25f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.75f)
                curveTo(18.0f, 7.13f, 18.282f, 7.443f, 18.648f, 7.493f)
                lineTo(18.75f, 7.5f)
                curveTo(19.13f, 7.5f, 19.444f, 7.218f, 19.493f, 6.852f)
                lineTo(19.5f, 6.75f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.25f)
                curveTo(20.63f, 6.0f, 20.944f, 5.718f, 20.993f, 5.352f)
                lineTo(21.0f, 5.25f)
                curveTo(21.0f, 4.87f, 20.718f, 4.557f, 20.352f, 4.507f)
                lineTo(20.25f, 4.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(3.75f)
                curveTo(19.5f, 3.37f, 19.218f, 3.057f, 18.852f, 3.007f)
                lineTo(18.75f, 3.0f)
                lineTo(18.852f, 3.007f)
                close()
            }
        }
        .build()
        return _wand!!
    }

@Suppress("ObjectPropertyName")
private var _wand: ImageVector? = null

@Preview
@Composable
private fun WandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Wand, contentDescription = "Wand Icon")
    }
}

