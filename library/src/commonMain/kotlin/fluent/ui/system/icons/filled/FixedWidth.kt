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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.FixedWidth: ImageVector
    get() {
        if (_FixedWidth != null) {
            return _FixedWidth!!
        }
        _FixedWidth = ImageVector.Builder(
            name = "Filled.FixedWidth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 4f)
                curveTo(4.164f, 4f, 4.5f, 4.308f, 4.5f, 4.688f)
                verticalLineTo(6f)
                horizontalLineTo(11.25f)
                verticalLineTo(4.688f)
                curveTo(11.25f, 4.308f, 11.586f, 4f, 12f, 4f)
                curveTo(12.414f, 4f, 12.75f, 4.308f, 12.75f, 4.688f)
                verticalLineTo(6f)
                horizontalLineTo(19.5f)
                verticalLineTo(4.688f)
                curveTo(19.5f, 4.308f, 19.836f, 4f, 20.25f, 4f)
                curveTo(20.664f, 4f, 21f, 4.308f, 21f, 4.688f)
                verticalLineTo(8.813f)
                curveTo(21f, 9.192f, 20.664f, 9.5f, 20.25f, 9.5f)
                curveTo(19.836f, 9.5f, 19.5f, 9.192f, 19.5f, 8.813f)
                verticalLineTo(7.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.813f)
                curveTo(12.75f, 9.192f, 12.414f, 9.5f, 12f, 9.5f)
                curveTo(11.586f, 9.5f, 11.25f, 9.192f, 11.25f, 8.813f)
                verticalLineTo(7.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(8.813f)
                curveTo(4.5f, 9.192f, 4.164f, 9.5f, 3.75f, 9.5f)
                curveTo(3.336f, 9.5f, 3f, 9.192f, 3f, 8.813f)
                verticalLineTo(4.688f)
                curveTo(3f, 4.308f, 3.336f, 4f, 3.75f, 4f)
                close()
                moveTo(5.75f, 11f)
                curveTo(4.231f, 11f, 3f, 12.231f, 3f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.269f, 4.231f, 20.5f, 5.75f, 20.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(11f)
                horizontalLineTo(5.75f)
                close()
                moveTo(18.25f, 20.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(11f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 11f, 21f, 12.231f, 21f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.269f, 19.769f, 20.5f, 18.25f, 20.5f)
                close()
            }
        }.build()

        return _FixedWidth!!
    }

@Suppress("ObjectPropertyName")
private var _FixedWidth: ImageVector? = null

@Preview
@Composable
private fun FixedWidthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FixedWidth, contentDescription = null)
    }
}
