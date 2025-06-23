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

public val FluentIcons.Regular.Notebook: ImageVector
    get() {
        if (_Notebook != null) {
            return _Notebook!!
        }
        _Notebook = ImageVector.Builder(
            name = "Regular.Notebook",
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
                moveTo(16.749f, 3.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(16.749f)
                curveTo(17.163f, 20.5f, 17.499f, 20.164f, 17.499f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(17.499f, 3.836f, 17.163f, 3.5f, 16.749f, 3.5f)
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
                moveTo(15.249f, 5f)
                curveTo(15.663f, 5f, 15.999f, 5.336f, 15.999f, 5.75f)
                verticalLineTo(8.248f)
                curveTo(15.999f, 8.663f, 15.663f, 8.998f, 15.249f, 8.998f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 8.998f, 7f, 8.663f, 7f, 8.248f)
                verticalLineTo(5.75f)
                curveTo(7f, 5.336f, 7.336f, 5f, 7.75f, 5f)
                horizontalLineTo(15.249f)
                close()
                moveTo(14.499f, 6.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(7.498f)
                horizontalLineTo(14.499f)
                verticalLineTo(6.5f)
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
        Image(imageVector = FluentIcons.Regular.Notebook, contentDescription = null)
    }
}
