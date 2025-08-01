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

public val FluentIcons.Regular.EraserTool: ImageVector
    get() {
        if (_EraserTool != null) {
            return _EraserTool!!
        }
        _EraserTool = ImageVector.Builder(
            name = "Regular.EraserTool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 2f)
                curveTo(4.164f, 2f, 4.5f, 2.336f, 4.5f, 2.75f)
                verticalLineTo(7f)
                horizontalLineTo(19.5f)
                verticalLineTo(2.75f)
                curveTo(19.5f, 2.336f, 19.836f, 2f, 20.25f, 2f)
                curveTo(20.664f, 2f, 21f, 2.336f, 21f, 2.75f)
                verticalLineTo(17.25f)
                curveTo(21f, 19.873f, 18.873f, 22f, 16.25f, 22f)
                horizontalLineTo(7.75f)
                curveTo(5.127f, 22f, 3f, 19.873f, 3f, 17.25f)
                verticalLineTo(2.75f)
                curveTo(3f, 2.336f, 3.336f, 2f, 3.75f, 2f)
                close()
                moveTo(19.5f, 8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(12f)
                horizontalLineTo(19.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(4.5f, 17.25f)
                curveTo(4.5f, 19.045f, 5.955f, 20.5f, 7.75f, 20.5f)
                horizontalLineTo(16.25f)
                curveTo(18.045f, 20.5f, 19.5f, 19.045f, 19.5f, 17.25f)
                verticalLineTo(13.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.25f)
                close()
            }
        }.build()

        return _EraserTool!!
    }

@Suppress("ObjectPropertyName")
private var _EraserTool: ImageVector? = null

@Preview
@Composable
private fun EraserToolPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.EraserTool, contentDescription = null)
    }
}
