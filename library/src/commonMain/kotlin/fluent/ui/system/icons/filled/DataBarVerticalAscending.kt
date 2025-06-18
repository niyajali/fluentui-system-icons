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

public val FluentUi.Filled.DataBarVerticalAscending: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.DataBarVerticalAscending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.251f, 3f)
                curveTo(17.009f, 3f, 16.002f, 4.007f, 16.002f, 5.249f)
                verticalLineTo(18.751f)
                curveTo(16.002f, 19.993f, 17.009f, 21f, 18.251f, 21f)
                curveTo(19.493f, 21f, 20.5f, 19.993f, 20.5f, 18.751f)
                verticalLineTo(5.249f)
                curveTo(20.5f, 4.007f, 19.493f, 3f, 18.251f, 3f)
                close()
                moveTo(11.751f, 7f)
                curveTo(10.509f, 7f, 9.502f, 8.007f, 9.502f, 9.249f)
                verticalLineTo(18.751f)
                curveTo(9.502f, 19.993f, 10.509f, 21f, 11.751f, 21f)
                curveTo(12.993f, 21f, 14f, 19.993f, 14f, 18.751f)
                verticalLineTo(9.249f)
                curveTo(14f, 8.007f, 12.993f, 7f, 11.751f, 7f)
                close()
                moveTo(5.251f, 11f)
                curveTo(4.009f, 11f, 3.002f, 12.007f, 3.002f, 13.249f)
                verticalLineTo(18.751f)
                curveTo(3.002f, 19.993f, 4.009f, 21f, 5.251f, 21f)
                curveTo(6.493f, 21f, 7.5f, 19.993f, 7.5f, 18.751f)
                verticalLineTo(13.249f)
                curveTo(7.5f, 12.007f, 6.493f, 11f, 5.251f, 11f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun DataBarVerticalAscendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DataBarVerticalAscending, contentDescription = null)
    }
}
