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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Column: ImageVector
    get() {
        if (_Column != null) {
            return _Column!!
        }
        _Column = ImageVector.Builder(
            name = "Regular.Column",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.5f, 3.75f)
                curveTo(2.5f, 3.336f, 2.836f, 3f, 3.25f, 3f)
                horizontalLineTo(3.75f)
                curveTo(5.269f, 3f, 6.5f, 4.231f, 6.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(6.5f, 19.769f, 5.269f, 21f, 3.75f, 21f)
                horizontalLineTo(3.25f)
                curveTo(2.836f, 21f, 2.5f, 20.664f, 2.5f, 20.25f)
                curveTo(2.5f, 19.836f, 2.836f, 19.5f, 3.25f, 19.5f)
                horizontalLineTo(3.75f)
                curveTo(4.44f, 19.5f, 5f, 18.94f, 5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(5f, 5.06f, 4.44f, 4.5f, 3.75f, 4.5f)
                horizontalLineTo(3.25f)
                curveTo(2.836f, 4.5f, 2.5f, 4.164f, 2.5f, 3.75f)
                close()
                moveTo(8f, 5.75f)
                curveTo(8f, 4.231f, 9.231f, 3f, 10.75f, 3f)
                horizontalLineTo(13.25f)
                curveTo(14.769f, 3f, 16f, 4.231f, 16f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(16f, 19.769f, 14.769f, 21f, 13.25f, 21f)
                horizontalLineTo(10.75f)
                curveTo(9.231f, 21f, 8f, 19.769f, 8f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(10.75f, 4.5f)
                curveTo(10.06f, 4.5f, 9.5f, 5.06f, 9.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(9.5f, 18.94f, 10.06f, 19.5f, 10.75f, 19.5f)
                horizontalLineTo(13.25f)
                curveTo(13.94f, 19.5f, 14.5f, 18.94f, 14.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(14.5f, 5.06f, 13.94f, 4.5f, 13.25f, 4.5f)
                horizontalLineTo(10.75f)
                close()
                moveTo(20.75f, 3f)
                curveTo(21.164f, 3f, 21.5f, 3.336f, 21.5f, 3.75f)
                curveTo(21.5f, 4.164f, 21.164f, 4.5f, 20.75f, 4.5f)
                horizontalLineTo(20.25f)
                curveTo(19.56f, 4.5f, 19f, 5.06f, 19f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(19f, 18.94f, 19.56f, 19.5f, 20.25f, 19.5f)
                horizontalLineTo(20.75f)
                curveTo(21.164f, 19.5f, 21.5f, 19.836f, 21.5f, 20.25f)
                curveTo(21.5f, 20.664f, 21.164f, 21f, 20.75f, 21f)
                horizontalLineTo(20.25f)
                curveTo(18.731f, 21f, 17.5f, 19.769f, 17.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(17.5f, 4.231f, 18.731f, 3f, 20.25f, 3f)
                horizontalLineTo(20.75f)
                close()
            }
        }.build()

        return _Column!!
    }

@Suppress("ObjectPropertyName")
private var _Column: ImageVector? = null

@Preview
@Composable
private fun ColumnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Column, contentDescription = null)
    }
}
