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

public val FluentIcons.Regular.History: ImageVector
    get() {
        if (_History != null) {
            return _History!!
        }
        _History = ImageVector.Builder(
            name = "Regular.History",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 4.5f)
                curveTo(16.142f, 4.5f, 19.5f, 7.858f, 19.5f, 12f)
                curveTo(19.5f, 16.142f, 16.142f, 19.5f, 12f, 19.5f)
                curveTo(7.858f, 19.5f, 4.5f, 16.142f, 4.5f, 12f)
                curveTo(4.5f, 11.624f, 4.528f, 11.254f, 4.581f, 10.892f)
                curveTo(4.648f, 10.438f, 4.316f, 10f, 3.857f, 10f)
                curveTo(3.486f, 10f, 3.161f, 10.256f, 3.105f, 10.623f)
                curveTo(3.036f, 11.072f, 3f, 11.532f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(9.695f, 3f, 7.592f, 3.867f, 6f, 5.292f)
                verticalLineTo(4.25f)
                curveTo(6f, 3.836f, 5.664f, 3.5f, 5.25f, 3.5f)
                curveTo(4.836f, 3.5f, 4.5f, 3.836f, 4.5f, 4.25f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 7.664f, 4.836f, 8f, 5.25f, 8f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 8f, 9f, 7.664f, 9f, 7.25f)
                curveTo(9f, 6.836f, 8.664f, 6.5f, 8.25f, 6.5f)
                horizontalLineTo(6.901f)
                curveTo(8.239f, 5.259f, 10.031f, 4.5f, 12f, 4.5f)
                close()
                moveTo(12.5f, 7.75f)
                curveTo(12.5f, 7.336f, 12.164f, 7f, 11.75f, 7f)
                curveTo(11.336f, 7f, 11f, 7.336f, 11f, 7.75f)
                verticalLineTo(12.25f)
                curveTo(11f, 12.664f, 11.336f, 13f, 11.75f, 13f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 13f, 15.5f, 12.664f, 15.5f, 12.25f)
                curveTo(15.5f, 11.836f, 15.164f, 11.5f, 14.75f, 11.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(7.75f)
                close()
            }
        }.build()

        return _History!!
    }

@Suppress("ObjectPropertyName")
private var _History: ImageVector? = null

@Preview
@Composable
private fun HistoryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.History, contentDescription = null)
    }
}
