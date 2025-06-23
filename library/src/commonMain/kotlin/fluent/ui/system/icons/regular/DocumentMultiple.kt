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

public val FluentIcons.Regular.DocumentMultiple: ImageVector
    get() {
        if (_DocumentMultiple != null) {
            return _DocumentMultiple!!
        }
        _DocumentMultiple = ImageVector.Builder(
            name = "Regular.DocumentMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(10.631f)
                curveTo(11.228f, 2f, 11.8f, 2.237f, 12.222f, 2.659f)
                lineTo(16.841f, 7.278f)
                curveTo(17.263f, 7.7f, 17.5f, 8.272f, 17.5f, 8.869f)
                verticalLineTo(17.25f)
                curveTo(17.5f, 18.493f, 16.493f, 19.5f, 15.25f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 19.5f, 4f, 18.493f, 4f, 17.25f)
                verticalLineTo(4.25f)
                close()
                moveTo(6.25f, 3.5f)
                curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(5.5f, 17.664f, 5.836f, 18f, 6.25f, 18f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 18f, 16f, 17.664f, 16f, 17.25f)
                verticalLineTo(8.998f)
                horizontalLineTo(12.754f)
                curveTo(11.511f, 8.998f, 10.504f, 7.99f, 10.504f, 6.748f)
                verticalLineTo(3.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(12.004f, 4.562f)
                verticalLineTo(6.748f)
                curveTo(12.004f, 7.162f, 12.34f, 7.498f, 12.754f, 7.498f)
                horizontalLineTo(14.939f)
                lineTo(12.004f, 4.562f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.629f, 20.5f)
                curveTo(6.938f, 21.374f, 7.771f, 22f, 8.751f, 22f)
                horizontalLineTo(15.251f)
                curveTo(17.874f, 22f, 20.001f, 19.873f, 20.001f, 17.25f)
                verticalLineTo(11.369f)
                curveTo(20.001f, 10.772f, 19.764f, 10.2f, 19.342f, 9.778f)
                lineTo(18.501f, 8.937f)
                verticalLineTo(17.25f)
                curveTo(18.501f, 19.045f, 17.046f, 20.5f, 15.251f, 20.5f)
                horizontalLineTo(6.629f)
                close()
            }
        }.build()

        return _DocumentMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentMultiple: ImageVector? = null

@Preview
@Composable
private fun DocumentMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentMultiple, contentDescription = null)
    }
}
