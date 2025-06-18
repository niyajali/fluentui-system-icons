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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ArrowRotateCounterclockwise: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.ArrowRotateCounterclockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 15.078f, 4.559f, 17.865f, 7.023f, 19.501f)
                lineTo(5.25f, 19.5f)
                curveTo(4.836f, 19.5f, 4.5f, 19.836f, 4.5f, 20.25f)
                curveTo(4.5f, 20.63f, 4.782f, 20.944f, 5.148f, 20.993f)
                lineTo(5.25f, 21f)
                horizontalLineTo(9.25f)
                curveTo(9.63f, 21f, 9.943f, 20.718f, 9.993f, 20.352f)
                lineTo(10f, 20.25f)
                verticalLineTo(16.25f)
                curveTo(10f, 15.836f, 9.664f, 15.5f, 9.25f, 15.5f)
                curveTo(8.87f, 15.5f, 8.557f, 15.782f, 8.507f, 16.148f)
                lineTo(8.5f, 16.25f)
                lineTo(8.499f, 18.635f)
                curveTo(6.076f, 17.356f, 4.5f, 14.825f, 4.5f, 12f)
                curveTo(4.5f, 7.858f, 7.858f, 4.5f, 12f, 4.5f)
                curveTo(16.142f, 4.5f, 19.5f, 7.858f, 19.5f, 12f)
                curveTo(19.5f, 12.414f, 19.836f, 12.75f, 20.25f, 12.75f)
                curveTo(20.664f, 12.75f, 21f, 12.414f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                close()
                moveTo(12f, 9.25f)
                curveTo(10.481f, 9.25f, 9.25f, 10.481f, 9.25f, 12f)
                curveTo(9.25f, 13.519f, 10.481f, 14.75f, 12f, 14.75f)
                curveTo(13.519f, 14.75f, 14.75f, 13.519f, 14.75f, 12f)
                curveTo(14.75f, 10.481f, 13.519f, 9.25f, 12f, 9.25f)
                close()
                moveTo(12f, 10.75f)
                curveTo(12.69f, 10.75f, 13.25f, 11.31f, 13.25f, 12f)
                curveTo(13.25f, 12.69f, 12.69f, 13.25f, 12f, 13.25f)
                curveTo(11.31f, 13.25f, 10.75f, 12.69f, 10.75f, 12f)
                curveTo(10.75f, 11.31f, 11.31f, 10.75f, 12f, 10.75f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ArrowRotateCounterclockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowRotateCounterclockwise, contentDescription = null)
    }
}
