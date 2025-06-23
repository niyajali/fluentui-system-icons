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

public val FluentIcons.Regular.CaretLeft: ImageVector
    get() {
        if (_CaretLeft != null) {
            return _CaretLeft!!
        }
        _CaretLeft = ImageVector.Builder(
            name = "Regular.CaretLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.927f, 18.839f)
                curveTo(13.735f, 19.546f, 15f, 18.972f, 15f, 17.898f)
                lineTo(15f, 6.102f)
                curveTo(15f, 5.028f, 13.735f, 4.454f, 12.927f, 5.161f)
                lineTo(6.616f, 10.683f)
                curveTo(5.819f, 11.38f, 5.819f, 12.62f, 6.616f, 13.317f)
                lineTo(12.927f, 18.839f)
                close()
                moveTo(13.5f, 17.347f)
                lineTo(7.604f, 12.188f)
                curveTo(7.49f, 12.089f, 7.49f, 11.912f, 7.604f, 11.812f)
                lineTo(13.5f, 6.653f)
                lineTo(13.5f, 17.347f)
                close()
            }
        }.build()

        return _CaretLeft!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLeft: ImageVector? = null

@Preview
@Composable
private fun CaretLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CaretLeft, contentDescription = null)
    }
}
