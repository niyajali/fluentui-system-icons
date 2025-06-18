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

public val FluentUi.Filled.TextDirectionRotate90Rtl: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TextDirectionRotate90Rtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.385f, 15.327f)
                lineTo(11.385f, 11.577f)
                curveTo(10.875f, 11.364f, 10.289f, 11.605f, 10.077f, 12.115f)
                curveTo(9.865f, 12.625f, 10.106f, 13.21f, 10.615f, 13.423f)
                lineTo(13f, 14.416f)
                verticalLineTo(18.083f)
                lineTo(10.615f, 19.077f)
                curveTo(10.106f, 19.289f, 9.865f, 19.875f, 10.077f, 20.384f)
                curveTo(10.289f, 20.894f, 10.875f, 21.135f, 11.385f, 20.923f)
                lineTo(20.385f, 17.173f)
                curveTo(20.757f, 17.017f, 21f, 16.653f, 21f, 16.25f)
                curveTo(21f, 15.846f, 20.757f, 15.482f, 20.385f, 15.327f)
                close()
                moveTo(15f, 15.25f)
                lineTo(17.4f, 16.25f)
                lineTo(15f, 17.25f)
                verticalLineTo(15.25f)
                close()
                moveTo(8f, 20f)
                curveTo(8f, 20.552f, 7.552f, 21f, 7f, 21f)
                curveTo(6.448f, 21f, 6f, 20.552f, 6f, 20f)
                verticalLineTo(6.414f)
                lineTo(5.707f, 6.707f)
                curveTo(5.317f, 7.098f, 4.683f, 7.098f, 4.293f, 6.707f)
                curveTo(3.902f, 6.317f, 3.902f, 5.683f, 4.293f, 5.293f)
                lineTo(6.293f, 3.293f)
                curveTo(6.683f, 2.902f, 7.317f, 2.902f, 7.707f, 3.293f)
                lineTo(9.707f, 5.293f)
                curveTo(10.098f, 5.683f, 10.098f, 6.317f, 9.707f, 6.707f)
                curveTo(9.317f, 7.098f, 8.683f, 7.098f, 8.293f, 6.707f)
                lineTo(8f, 6.414f)
                verticalLineTo(20f)
                close()
                moveTo(16f, 11f)
                curveTo(15.448f, 11f, 15f, 10.552f, 15f, 10f)
                verticalLineTo(6.414f)
                lineTo(14.707f, 6.707f)
                curveTo(14.317f, 7.098f, 13.683f, 7.098f, 13.293f, 6.707f)
                curveTo(12.902f, 6.317f, 12.902f, 5.683f, 13.293f, 5.293f)
                lineTo(15.293f, 3.293f)
                curveTo(15.683f, 2.902f, 16.317f, 2.902f, 16.707f, 3.293f)
                lineTo(18.707f, 5.293f)
                curveTo(19.098f, 5.683f, 19.098f, 6.317f, 18.707f, 6.707f)
                curveTo(18.317f, 7.098f, 17.683f, 7.098f, 17.293f, 6.707f)
                lineTo(17f, 6.414f)
                verticalLineTo(10f)
                curveTo(17f, 10.552f, 16.552f, 11f, 16f, 11f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextDirectionRotate90RtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextDirectionRotate90Rtl, contentDescription = null)
    }
}
