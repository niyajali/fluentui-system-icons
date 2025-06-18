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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.DataBarVerticalArrowDown: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.DataBarVerticalArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.251f, 3f)
                curveTo(17.009f, 3f, 16.002f, 4.007f, 16.002f, 5.249f)
                verticalLineTo(11.174f)
                curveTo(16.483f, 11.06f, 16.984f, 11f, 17.5f, 11f)
                curveTo(18.582f, 11f, 19.603f, 11.264f, 20.5f, 11.732f)
                verticalLineTo(5.249f)
                curveTo(20.5f, 4.007f, 19.493f, 3f, 18.251f, 3f)
                close()
                moveTo(14f, 9.249f)
                verticalLineTo(12.022f)
                curveTo(12.196f, 13.177f, 11f, 15.199f, 11f, 17.5f)
                curveTo(11f, 18.782f, 11.371f, 19.978f, 12.012f, 20.985f)
                curveTo(11.927f, 20.995f, 11.839f, 21f, 11.751f, 21f)
                curveTo(10.509f, 21f, 9.502f, 19.993f, 9.502f, 18.751f)
                verticalLineTo(9.249f)
                curveTo(9.502f, 8.007f, 10.509f, 7f, 11.751f, 7f)
                curveTo(12.993f, 7f, 14f, 8.007f, 14f, 9.249f)
                close()
                moveTo(5.251f, 11f)
                curveTo(4.009f, 11f, 3.002f, 12.007f, 3.002f, 13.249f)
                verticalLineTo(18.751f)
                curveTo(3.002f, 19.993f, 4.009f, 21f, 5.251f, 21f)
                curveTo(6.493f, 21f, 7.5f, 19.993f, 7.5f, 18.751f)
                verticalLineTo(13.249f)
                curveTo(7.5f, 12.007f, 6.493f, 11f, 5.251f, 11f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(18f, 14.5f)
                curveTo(18f, 14.224f, 17.776f, 14f, 17.5f, 14f)
                curveTo(17.224f, 14f, 17f, 14.224f, 17f, 14.5f)
                verticalLineTo(19.293f)
                lineTo(15.354f, 17.646f)
                curveTo(15.158f, 17.451f, 14.842f, 17.451f, 14.646f, 17.646f)
                curveTo(14.451f, 17.842f, 14.451f, 18.158f, 14.646f, 18.354f)
                lineTo(17.146f, 20.854f)
                curveTo(17.342f, 21.049f, 17.658f, 21.049f, 17.854f, 20.854f)
                lineTo(20.354f, 18.354f)
                curveTo(20.549f, 18.158f, 20.549f, 17.842f, 20.354f, 17.646f)
                curveTo(20.158f, 17.451f, 19.842f, 17.451f, 19.646f, 17.646f)
                lineTo(18f, 19.293f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun DataBarVerticalArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DataBarVerticalArrowDown, contentDescription = null)
    }
}
