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
 * DocumentHeader Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used to represent file type content styles and scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_header_32_light.svg)
 * 
 * @return The [ImageVector] for the DocumentHeader icon.
 */
public val FluentIcons.Light.DocumentHeader: ImageVector
    get() {
        if (_documentHeader != null) {
            return _documentHeader!!
        }
        _documentHeader = Builder(name = "DocumentHeader", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.75f, 2.0f)
                curveTo(26.545f, 2.0f, 28.0f, 3.455f, 28.0f, 5.25f)
                verticalLineTo(26.75f)
                curveTo(28.0f, 28.545f, 26.545f, 30.0f, 24.75f, 30.0f)
                horizontalLineTo(7.25f)
                curveTo(5.511f, 30.0f, 4.091f, 28.634f, 4.004f, 26.917f)
                lineTo(4.0f, 26.75f)
                verticalLineTo(5.25f)
                curveTo(4.0f, 3.455f, 5.455f, 2.0f, 7.25f, 2.0f)
                horizontalLineTo(24.75f)
                close()
                moveTo(7.25f, 3.0f)
                curveTo(6.007f, 3.0f, 5.0f, 4.007f, 5.0f, 5.25f)
                verticalLineTo(26.75f)
                lineTo(5.012f, 26.98f)
                curveTo(5.127f, 28.115f, 6.085f, 29.0f, 7.25f, 29.0f)
                horizontalLineTo(24.75f)
                curveTo(25.993f, 29.0f, 27.0f, 27.993f, 27.0f, 26.75f)
                verticalLineTo(5.25f)
                curveTo(27.0f, 4.007f, 25.993f, 3.0f, 24.75f, 3.0f)
                horizontalLineTo(7.25f)
                close()
                moveTo(21.5f, 7.0f)
                curveTo(22.605f, 7.0f, 23.5f, 7.895f, 23.5f, 9.0f)
                curveTo(23.5f, 10.105f, 22.605f, 11.0f, 21.5f, 11.0f)
                horizontalLineTo(10.5f)
                curveTo(9.395f, 11.0f, 8.5f, 10.105f, 8.5f, 9.0f)
                curveTo(8.5f, 7.895f, 9.395f, 7.0f, 10.5f, 7.0f)
                horizontalLineTo(21.5f)
                close()
            }
        }
        .build()
        return _documentHeader!!
    }

@Suppress("ObjectPropertyName")
private var _documentHeader: ImageVector? = null

@Preview
@Composable
private fun DocumentHeaderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.DocumentHeader, contentDescription = "DocumentHeader Icon")
    }
}

