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

public val FluentIcons.Filled.TextWrapOff: ImageVector
    get() {
        if (_TextWrapOff != null) {
            return _TextWrapOff!!
        }
        _TextWrapOff = ImageVector.Builder(
            name = "Filled.TextWrapOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(3.939f, 5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 5f, 2f, 5.448f, 2f, 6f)
                curveTo(2f, 6.552f, 2.448f, 7f, 3f, 7f)
                horizontalLineTo(5.939f)
                lineTo(9.939f, 11f)
                horizontalLineTo(3f)
                curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
                curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
                horizontalLineTo(11.939f)
                lineTo(14.262f, 15.323f)
                lineTo(12.293f, 17.293f)
                curveTo(11.902f, 17.683f, 11.902f, 18.317f, 12.293f, 18.707f)
                lineTo(14.293f, 20.707f)
                curveTo(14.683f, 21.098f, 15.317f, 21.098f, 15.707f, 20.707f)
                curveTo(16.098f, 20.317f, 16.098f, 19.683f, 15.707f, 19.293f)
                lineTo(15.414f, 19f)
                horizontalLineTo(17.939f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(14.181f, 11f)
                horizontalLineTo(19f)
                curveTo(21.209f, 11f, 23f, 12.791f, 23f, 15f)
                curveTo(23f, 16.313f, 22.367f, 17.479f, 21.389f, 18.208f)
                lineTo(19.945f, 16.763f)
                curveTo(20.573f, 16.426f, 21f, 15.763f, 21f, 15f)
                curveTo(21f, 13.895f, 20.105f, 13f, 19f, 13f)
                horizontalLineTo(16.181f)
                lineTo(14.181f, 11f)
                close()
                moveTo(10.182f, 7f)
                lineTo(8.182f, 5f)
                horizontalLineTo(21f)
                curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
                curveTo(22f, 6.552f, 21.552f, 7f, 21f, 7f)
                horizontalLineTo(10.182f)
                close()
                moveTo(2f, 18f)
                curveTo(2f, 17.448f, 2.448f, 17f, 3f, 17f)
                horizontalLineTo(9f)
                curveTo(9.552f, 17f, 10f, 17.448f, 10f, 18f)
                curveTo(10f, 18.552f, 9.552f, 19f, 9f, 19f)
                horizontalLineTo(3f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                close()
            }
        }.build()

        return _TextWrapOff!!
    }

@Suppress("ObjectPropertyName")
private var _TextWrapOff: ImageVector? = null

@Preview
@Composable
private fun TextWrapOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextWrapOff, contentDescription = null)
    }
}
