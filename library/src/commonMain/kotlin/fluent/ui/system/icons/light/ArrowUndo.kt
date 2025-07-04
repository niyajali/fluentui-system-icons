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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.ArrowUndo: ImageVector
    get() {
        if (_ArrowUndo != null) {
            return _ArrowUndo!!
        }
        _ArrowUndo = ImageVector.Builder(
            name = "Light.ArrowUndo",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 3.5f)
                curveTo(6f, 3.224f, 5.776f, 3f, 5.5f, 3f)
                curveTo(5.224f, 3f, 5f, 3.224f, 5f, 3.5f)
                verticalLineTo(15.5f)
                curveTo(5f, 15.776f, 5.224f, 16f, 5.5f, 16f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 16f, 18f, 15.776f, 18f, 15.5f)
                curveTo(18f, 15.224f, 17.776f, 15f, 17.5f, 15f)
                horizontalLineTo(6.707f)
                lineTo(15.778f, 5.93f)
                curveTo(18.254f, 3.454f, 22.236f, 3.354f, 24.833f, 5.703f)
                curveTo(27.619f, 8.225f, 27.728f, 12.565f, 25.07f, 15.222f)
                lineTo(12.146f, 28.146f)
                curveTo(11.951f, 28.342f, 11.951f, 28.658f, 12.146f, 28.854f)
                curveTo(12.342f, 29.049f, 12.658f, 29.049f, 12.854f, 28.854f)
                lineTo(25.778f, 15.929f)
                curveTo(28.839f, 12.868f, 28.714f, 7.867f, 25.504f, 4.962f)
                curveTo(22.512f, 2.255f, 17.923f, 2.37f, 15.071f, 5.222f)
                lineTo(6f, 14.293f)
                verticalLineTo(3.5f)
                close()
            }
        }.build()

        return _ArrowUndo!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUndo: ImageVector? = null

@Preview
@Composable
private fun ArrowUndoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.ArrowUndo, contentDescription = null)
    }
}
