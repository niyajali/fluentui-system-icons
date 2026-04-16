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

package fluent.ui.system.icons.filled

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
 * Refrigerator Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a refrigerator.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_refrigerator_20_filled.svg)
 * 
 * @return The [ImageVector] for the Refrigerator icon.
 */
public val FluentIcons.Filled.Refrigerator: ImageVector
    get() {
        if (_refrigerator != null) {
            return _refrigerator!!
        }
        _refrigerator = Builder(name = "Refrigerator", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                curveTo(16.0f, 16.657f, 14.657f, 18.0f, 13.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(5.343f, 18.0f, 4.0f, 16.657f, 4.0f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(6.5f, 10.0f)
                curveTo(6.224f, 10.0f, 6.0f, 10.224f, 6.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(6.0f, 13.776f, 6.224f, 14.0f, 6.5f, 14.0f)
                curveTo(6.776f, 14.0f, 7.0f, 13.776f, 7.0f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(7.0f, 10.224f, 6.776f, 10.0f, 6.5f, 10.0f)
                close()
                moveTo(13.154f, 2.004f)
                curveTo(14.739f, 2.084f, 16.0f, 3.395f, 16.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 3.343f, 5.343f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(13.0f)
                lineTo(13.154f, 2.004f)
                close()
                moveTo(6.5f, 4.0f)
                curveTo(6.224f, 4.0f, 6.0f, 4.224f, 6.0f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(6.0f, 6.776f, 6.224f, 7.0f, 6.5f, 7.0f)
                curveTo(6.776f, 7.0f, 7.0f, 6.776f, 7.0f, 6.5f)
                verticalLineTo(4.5f)
                curveTo(7.0f, 4.224f, 6.776f, 4.0f, 6.5f, 4.0f)
                close()
            }
        }
        .build()
        return _refrigerator!!
    }

@Suppress("ObjectPropertyName")
private var _refrigerator: ImageVector? = null

@Preview
@Composable
private fun RefrigeratorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Refrigerator, contentDescription = "Refrigerator Icon")
    }
}

