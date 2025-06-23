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

public val FluentIcons.Regular.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) {
            return _CaretUp!!
        }
        _CaretUp = ImageVector.Builder(
            name = "Regular.CaretUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.161f, 14.907f)
                curveTo(4.454f, 15.716f, 5.028f, 16.98f, 6.102f, 16.98f)
                horizontalLineTo(17.898f)
                curveTo(18.972f, 16.98f, 19.546f, 15.716f, 18.839f, 14.907f)
                lineTo(13.317f, 8.597f)
                curveTo(12.62f, 7.8f, 11.38f, 7.8f, 10.683f, 8.597f)
                lineTo(5.161f, 14.907f)
                close()
                moveTo(6.653f, 15.481f)
                lineTo(11.812f, 9.584f)
                curveTo(11.912f, 9.471f, 12.089f, 9.471f, 12.188f, 9.584f)
                lineTo(17.347f, 15.481f)
                horizontalLineTo(6.653f)
                close()
            }
        }.build()

        return _CaretUp!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUp: ImageVector? = null

@Preview
@Composable
private fun CaretUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CaretUp, contentDescription = null)
    }
}
