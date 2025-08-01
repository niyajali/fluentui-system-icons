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

public val FluentIcons.Filled.Smartwatch: ImageVector
    get() {
        if (_Smartwatch != null) {
            return _Smartwatch!!
        }
        _Smartwatch = ImageVector.Builder(
            name = "Filled.Smartwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.5f, 2f)
                curveTo(8.395f, 2f, 7.5f, 2.895f, 7.5f, 4f)
                verticalLineTo(5.291f)
                curveTo(7.963f, 5.103f, 8.47f, 5f, 9f, 5f)
                horizontalLineTo(15f)
                curveTo(15.53f, 5f, 16.037f, 5.103f, 16.5f, 5.291f)
                verticalLineTo(4f)
                curveTo(16.5f, 2.895f, 15.605f, 2f, 14.5f, 2f)
                horizontalLineTo(9.5f)
                close()
                moveTo(9f, 6f)
                curveTo(7.343f, 6f, 6f, 7.343f, 6f, 9f)
                verticalLineTo(15f)
                curveTo(6f, 16.657f, 7.343f, 18f, 9f, 18f)
                horizontalLineTo(15f)
                curveTo(16.657f, 18f, 18f, 16.657f, 18f, 15f)
                verticalLineTo(13f)
                curveTo(18.552f, 13f, 19f, 12.552f, 19f, 12f)
                verticalLineTo(11f)
                curveTo(19f, 10.448f, 18.552f, 10f, 18f, 10f)
                verticalLineTo(9f)
                curveTo(18f, 7.343f, 16.657f, 6f, 15f, 6f)
                horizontalLineTo(9f)
                close()
                moveTo(9f, 19f)
                curveTo(8.47f, 19f, 7.963f, 18.897f, 7.5f, 18.709f)
                verticalLineTo(20f)
                curveTo(7.5f, 21.105f, 8.395f, 22f, 9.5f, 22f)
                horizontalLineTo(14.5f)
                curveTo(15.605f, 22f, 16.5f, 21.105f, 16.5f, 20f)
                verticalLineTo(18.709f)
                curveTo(16.037f, 18.897f, 15.531f, 19f, 15f, 19f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _Smartwatch!!
    }

@Suppress("ObjectPropertyName")
private var _Smartwatch: ImageVector? = null

@Preview
@Composable
private fun SmartwatchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Smartwatch, contentDescription = null)
    }
}
