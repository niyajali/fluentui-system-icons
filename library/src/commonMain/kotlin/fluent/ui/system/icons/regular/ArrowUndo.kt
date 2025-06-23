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

public val FluentIcons.Regular.ArrowUndo: ImageVector
    get() {
        if (_ArrowUndo != null) {
            return _ArrowUndo!!
        }
        _ArrowUndo = ImageVector.Builder(
            name = "Regular.ArrowUndo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 2f)
                curveTo(5.13f, 2f, 5.443f, 2.282f, 5.493f, 2.648f)
                lineTo(5.5f, 2.75f)
                verticalLineTo(8.44f)
                lineTo(10.074f, 3.88f)
                curveTo(12.516f, 1.438f, 16.438f, 1.379f, 18.953f, 3.701f)
                lineTo(19.139f, 3.88f)
                curveTo(21.642f, 6.383f, 21.642f, 10.441f, 19.139f, 12.944f)
                lineTo(10.293f, 21.784f)
                curveTo(10f, 22.076f, 9.526f, 22.076f, 9.233f, 21.783f)
                curveTo(8.94f, 21.49f, 8.94f, 21.015f, 9.233f, 20.722f)
                lineTo(18.078f, 11.884f)
                curveTo(19.995f, 9.966f, 19.995f, 6.858f, 18.078f, 4.941f)
                curveTo(16.219f, 3.082f, 13.24f, 3.025f, 11.312f, 4.772f)
                lineTo(11.134f, 4.942f)
                lineTo(6.562f, 9.5f)
                lineTo(12.25f, 9.5f)
                curveTo(12.63f, 9.5f, 12.943f, 9.782f, 12.993f, 10.148f)
                lineTo(13f, 10.25f)
                curveTo(13f, 10.63f, 12.718f, 10.944f, 12.352f, 10.993f)
                lineTo(12.25f, 11f)
                horizontalLineTo(4.75f)
                curveTo(4.37f, 11f, 4.057f, 10.718f, 4.007f, 10.352f)
                lineTo(4f, 10.25f)
                verticalLineTo(2.75f)
                curveTo(4f, 2.336f, 4.336f, 2f, 4.75f, 2f)
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
        Image(imageVector = FluentIcons.Regular.ArrowUndo, contentDescription = null)
    }
}
