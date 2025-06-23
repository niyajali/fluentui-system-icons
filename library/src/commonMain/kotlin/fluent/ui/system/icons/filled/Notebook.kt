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

public val FluentIcons.Filled.Notebook: ImageVector
    get() {
        if (_Notebook != null) {
            return _Notebook!!
        }
        _Notebook = ImageVector.Builder(
            name = "Filled.Notebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.749f, 2f)
                curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(16.749f)
                close()
                moveTo(20f, 15.002f)
                horizontalLineTo(20.75f)
                curveTo(21.13f, 15.002f, 21.444f, 15.284f, 21.493f, 15.65f)
                lineTo(21.5f, 15.752f)
                verticalLineTo(17.25f)
                curveTo(21.5f, 17.63f, 21.218f, 17.944f, 20.852f, 17.993f)
                lineTo(20.75f, 18f)
                horizontalLineTo(20f)
                verticalLineTo(15.002f)
                horizontalLineTo(20.75f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 11.002f)
                horizontalLineTo(20.75f)
                curveTo(21.13f, 11.002f, 21.444f, 11.284f, 21.493f, 11.65f)
                lineTo(21.5f, 11.752f)
                verticalLineTo(13.25f)
                curveTo(21.5f, 13.63f, 21.218f, 13.943f, 20.852f, 13.993f)
                lineTo(20.75f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(11.002f)
                horizontalLineTo(20.75f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 7.002f)
                horizontalLineTo(20.75f)
                curveTo(21.13f, 7.002f, 21.444f, 7.284f, 21.493f, 7.65f)
                lineTo(21.5f, 7.752f)
                verticalLineTo(9.25f)
                curveTo(21.5f, 9.63f, 21.218f, 9.943f, 20.852f, 9.993f)
                lineTo(20.75f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(7.002f)
                horizontalLineTo(20.75f)
                horizontalLineTo(20f)
                close()
                moveTo(14.754f, 5.497f)
                horizontalLineTo(8.251f)
                curveTo(7.872f, 5.497f, 7.558f, 5.78f, 7.508f, 6.146f)
                lineTo(7.501f, 6.247f)
                verticalLineTo(7.751f)
                curveTo(7.501f, 8.131f, 7.784f, 8.444f, 8.15f, 8.494f)
                lineTo(8.251f, 8.501f)
                horizontalLineTo(14.754f)
                curveTo(15.133f, 8.501f, 15.447f, 8.219f, 15.497f, 7.853f)
                lineTo(15.504f, 7.751f)
                verticalLineTo(6.247f)
                curveTo(15.504f, 5.833f, 15.168f, 5.497f, 14.754f, 5.497f)
                close()
            }
        }.build()

        return _Notebook!!
    }

@Suppress("ObjectPropertyName")
private var _Notebook: ImageVector? = null

@Preview
@Composable
private fun NotebookPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Notebook, contentDescription = null)
    }
}
