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

public val FluentIcons.Filled.ArrowDownLeft: ImageVector
    get() {
        if (_ArrowDownLeft != null) {
            return _ArrowDownLeft!!
        }
        _ArrowDownLeft = ImageVector.Builder(
            name = "Filled.ArrowDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13f, 21f)
                curveTo(13.552f, 21f, 14f, 20.552f, 14f, 20f)
                curveTo(14f, 19.448f, 13.552f, 19f, 13f, 19f)
                horizontalLineTo(6.414f)
                lineTo(20.707f, 4.707f)
                curveTo(21.098f, 4.317f, 21.098f, 3.683f, 20.707f, 3.293f)
                curveTo(20.317f, 2.902f, 19.683f, 2.902f, 19.293f, 3.293f)
                lineTo(5f, 17.586f)
                verticalLineTo(11f)
                curveTo(5f, 10.448f, 4.552f, 10f, 4f, 10f)
                curveTo(3.448f, 10f, 3f, 10.448f, 3f, 11f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _ArrowDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowDownLeft, contentDescription = null)
    }
}
