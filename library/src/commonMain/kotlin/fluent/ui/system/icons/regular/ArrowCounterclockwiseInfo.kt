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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ArrowCounterclockwiseInfo: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.ArrowCounterclockwiseInfo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 4.5f)
                curveTo(15.907f, 4.5f, 19.117f, 7.488f, 19.468f, 11.303f)
                curveTo(20.013f, 11.476f, 20.528f, 11.719f, 21f, 12.022f)
                lineTo(21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(9.695f, 3f, 7.592f, 3.867f, 6f, 5.292f)
                verticalLineTo(4.25f)
                curveTo(6f, 3.836f, 5.664f, 3.5f, 5.25f, 3.5f)
                curveTo(4.836f, 3.5f, 4.5f, 3.836f, 4.5f, 4.25f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 7.664f, 4.836f, 8f, 5.25f, 8f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 8f, 9f, 7.664f, 9f, 7.25f)
                curveTo(9f, 6.836f, 8.664f, 6.5f, 8.25f, 6.5f)
                horizontalLineTo(6.901f)
                curveTo(8.239f, 5.259f, 10.031f, 4.5f, 12f, 4.5f)
                close()
                moveTo(4.5f, 12f)
                curveTo(4.5f, 15.907f, 7.488f, 19.117f, 11.303f, 19.468f)
                curveTo(11.476f, 20.013f, 11.719f, 20.528f, 12.022f, 21f)
                lineTo(12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 11.532f, 3.036f, 11.072f, 3.105f, 10.623f)
                curveTo(3.161f, 10.256f, 3.486f, 10f, 3.857f, 10f)
                curveTo(4.316f, 10f, 4.648f, 10.438f, 4.581f, 10.892f)
                curveTo(4.528f, 11.254f, 4.5f, 11.624f, 4.5f, 12f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                close()
                moveTo(17.5f, 21f)
                curveTo(17.776f, 21f, 18f, 20.776f, 18f, 20.5f)
                lineTo(18f, 16.5f)
                curveTo(18f, 16.224f, 17.776f, 16f, 17.5f, 16f)
                curveTo(17.224f, 16f, 17f, 16.224f, 17f, 16.5f)
                lineTo(17f, 20.5f)
                curveTo(17f, 20.776f, 17.224f, 21f, 17.5f, 21f)
                close()
                moveTo(17.5f, 13.875f)
                curveTo(17.155f, 13.875f, 16.875f, 14.155f, 16.875f, 14.5f)
                curveTo(16.875f, 14.845f, 17.155f, 15.125f, 17.5f, 15.125f)
                curveTo(17.845f, 15.125f, 18.125f, 14.845f, 18.125f, 14.5f)
                curveTo(18.125f, 14.155f, 17.845f, 13.875f, 17.5f, 13.875f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ArrowCounterclockwiseInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowCounterclockwiseInfo, contentDescription = null)
    }
}
