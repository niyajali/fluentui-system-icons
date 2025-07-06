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
 * Toolbox Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general tooling and settings scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_toolbox_24_regular.svg)
 * 
 * @return The [ImageVector] for the Toolbox icon.
 */
public val FluentIcons.Regular.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox = Builder(name = "Toolbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 6.253f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 7.0f, 2.0f, 8.008f, 2.0f, 9.25f)
                verticalLineTo(17.747f)
                curveTo(2.0f, 18.99f, 3.007f, 19.997f, 4.25f, 19.997f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 19.997f, 22.0f, 18.99f, 22.0f, 17.747f)
                verticalLineTo(9.25f)
                curveTo(22.0f, 8.008f, 20.993f, 7.0f, 19.75f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.253f)
                curveTo(17.0f, 5.01f, 15.993f, 4.003f, 14.75f, 4.003f)
                horizontalLineTo(9.25f)
                curveTo(8.007f, 4.003f, 7.0f, 5.01f, 7.0f, 6.253f)
                close()
                moveTo(9.25f, 5.503f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 5.503f, 15.5f, 5.839f, 15.5f, 6.253f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.253f)
                curveTo(8.5f, 5.839f, 8.836f, 5.503f, 9.25f, 5.503f)
                close()
                moveTo(7.0f, 8.503f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.503f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 8.5f, 20.5f, 8.836f, 20.5f, 9.25f)
                verticalLineTo(11.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.75f)
                curveTo(17.5f, 10.336f, 17.164f, 10.0f, 16.75f, 10.0f)
                curveTo(16.336f, 10.0f, 16.0f, 10.336f, 16.0f, 10.75f)
                verticalLineTo(11.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.75f)
                curveTo(8.0f, 10.336f, 7.664f, 10.0f, 7.25f, 10.0f)
                curveTo(6.836f, 10.0f, 6.5f, 10.336f, 6.5f, 10.75f)
                verticalLineTo(11.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(9.25f)
                curveTo(3.5f, 8.836f, 3.836f, 8.5f, 4.25f, 8.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.503f)
                close()
                moveTo(16.0f, 13.0f)
                verticalLineTo(14.25f)
                curveTo(16.0f, 14.665f, 16.336f, 15.0f, 16.75f, 15.0f)
                curveTo(17.164f, 15.0f, 17.5f, 14.665f, 17.5f, 14.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(17.747f)
                curveTo(20.5f, 18.161f, 20.164f, 18.497f, 19.75f, 18.497f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 18.497f, 3.5f, 18.161f, 3.5f, 17.747f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(14.25f)
                curveTo(6.5f, 14.665f, 6.836f, 15.0f, 7.25f, 15.0f)
                curveTo(7.664f, 15.0f, 8.0f, 14.665f, 8.0f, 14.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _toolbox!!
    }

@Suppress("ObjectPropertyName")
private var _toolbox: ImageVector? = null

@Preview
@Composable
private fun ToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Toolbox, contentDescription = "Toolbox Icon")
    }
}

