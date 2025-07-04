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

public val FluentIcons.Filled.TextWrap: ImageVector
    get() {
        if (_TextWrap != null) {
            return _TextWrap!!
        }
        _TextWrap = ImageVector.Builder(
            name = "Filled.TextWrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 6f)
                curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
                horizontalLineTo(21f)
                curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
                curveTo(22f, 6.552f, 21.552f, 7f, 21f, 7f)
                horizontalLineTo(3f)
                curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
                close()
                moveTo(3f, 17f)
                curveTo(2.448f, 17f, 2f, 17.448f, 2f, 18f)
                curveTo(2f, 18.552f, 2.448f, 19f, 3f, 19f)
                horizontalLineTo(9f)
                curveTo(9.552f, 19f, 10f, 18.552f, 10f, 18f)
                curveTo(10f, 17.448f, 9.552f, 17f, 9f, 17f)
                horizontalLineTo(3f)
                close()
                moveTo(15.414f, 17f)
                horizontalLineTo(19f)
                curveTo(20.105f, 17f, 21f, 16.105f, 21f, 15f)
                curveTo(21f, 13.895f, 20.105f, 13f, 19f, 13f)
                horizontalLineTo(3f)
                curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
                curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
                horizontalLineTo(19f)
                curveTo(21.209f, 11f, 23f, 12.791f, 23f, 15f)
                curveTo(23f, 17.209f, 21.209f, 19f, 19f, 19f)
                horizontalLineTo(15.414f)
                lineTo(15.707f, 19.293f)
                curveTo(16.098f, 19.683f, 16.098f, 20.317f, 15.707f, 20.707f)
                curveTo(15.317f, 21.098f, 14.683f, 21.098f, 14.293f, 20.707f)
                lineTo(12.293f, 18.707f)
                curveTo(11.902f, 18.317f, 11.902f, 17.683f, 12.293f, 17.293f)
                lineTo(14.293f, 15.293f)
                curveTo(14.683f, 14.902f, 15.317f, 14.902f, 15.707f, 15.293f)
                curveTo(16.098f, 15.683f, 16.098f, 16.317f, 15.707f, 16.707f)
                lineTo(15.414f, 17f)
                close()
            }
        }.build()

        return _TextWrap!!
    }

@Suppress("ObjectPropertyName")
private var _TextWrap: ImageVector? = null

@Preview
@Composable
private fun TextWrapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextWrap, contentDescription = null)
    }
}
