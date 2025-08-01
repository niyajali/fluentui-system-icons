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

public val FluentIcons.Regular.PrintAdd: ImageVector
    get() {
        if (_PrintAdd != null) {
            return _PrintAdd!!
        }
        _PrintAdd = ImageVector.Builder(
            name = "Regular.PrintAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.5f)
                curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
                curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
                curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
                close()
                moveTo(18.001f, 7f)
                lineTo(18.001f, 9.504f)
                curveTo(18.001f, 9.78f, 17.777f, 10.003f, 17.501f, 10.003f)
                curveTo(17.225f, 10.003f, 17.001f, 9.78f, 17.001f, 9.504f)
                lineTo(17.001f, 7f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 7f, 13.996f, 6.776f, 13.996f, 6.5f)
                curveTo(13.996f, 6.224f, 14.22f, 6f, 14.496f, 6f)
                horizontalLineTo(17f)
                lineTo(17f, 3.499f)
                curveTo(17f, 3.223f, 17.224f, 2.999f, 17.5f, 2.999f)
                curveTo(17.776f, 2.999f, 18f, 3.223f, 18f, 3.499f)
                lineTo(18f, 6f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 6f, 20.996f, 6.224f, 20.996f, 6.5f)
                curveTo(20.996f, 6.776f, 20.772f, 7f, 20.497f, 7f)
                horizontalLineTo(18.001f)
                close()
                moveTo(20.507f, 16.251f)
                lineTo(20.505f, 12.265f)
                curveTo(21.056f, 11.977f, 21.56f, 11.613f, 22.004f, 11.186f)
                lineTo(22.007f, 16.25f)
                curveTo(22.009f, 17.492f, 21.002f, 18.5f, 19.759f, 18.501f)
                lineTo(18f, 18.5f)
                verticalLineTo(19.75f)
                curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
                lineTo(6.001f, 18.5f)
                lineTo(4.25f, 18.5f)
                curveTo(3.007f, 18.5f, 2f, 17.493f, 2f, 16.25f)
                verticalLineTo(10.254f)
                curveTo(2f, 8.459f, 3.455f, 7.004f, 5.25f, 7.004f)
                lineTo(5.999f, 7.003f)
                lineTo(6f, 6.25f)
                curveTo(6f, 5.007f, 7.007f, 4f, 8.25f, 4f)
                horizontalLineTo(11.498f)
                curveTo(11.3f, 4.474f, 11.157f, 4.977f, 11.076f, 5.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 5.5f, 7.5f, 5.836f, 7.5f, 6.25f)
                lineTo(7.499f, 7.003f)
                horizontalLineTo(11.019f)
                curveTo(11.059f, 7.523f, 11.16f, 8.025f, 11.315f, 8.504f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 8.504f, 3.5f, 9.287f, 3.5f, 10.254f)
                verticalLineTo(16.25f)
                curveTo(3.5f, 16.664f, 3.836f, 17f, 4.25f, 17f)
                lineTo(6f, 17f)
                verticalLineTo(15.25f)
                curveTo(6f, 14.007f, 7.007f, 13f, 8.25f, 13f)
                horizontalLineTo(15.75f)
                curveTo(16.993f, 13f, 18f, 14.007f, 18f, 15.25f)
                lineTo(18.001f, 17f)
                lineTo(19.783f, 17f)
                curveTo(20.185f, 16.987f, 20.508f, 16.657f, 20.507f, 16.251f)
                close()
                moveTo(16.5f, 15.25f)
                curveTo(16.5f, 14.836f, 16.164f, 14.5f, 15.75f, 14.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 14.5f, 7.5f, 14.836f, 7.5f, 15.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.164f, 7.836f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 20.5f, 16.5f, 20.164f, 16.5f, 19.75f)
                verticalLineTo(15.25f)
                close()
            }
        }.build()

        return _PrintAdd!!
    }

@Suppress("ObjectPropertyName")
private var _PrintAdd: ImageVector? = null

@Preview
@Composable
private fun PrintAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PrintAdd, contentDescription = null)
    }
}
