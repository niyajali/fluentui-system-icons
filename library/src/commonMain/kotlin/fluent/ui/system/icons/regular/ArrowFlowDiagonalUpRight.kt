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

public val FluentIcons.Regular.ArrowFlowDiagonalUpRight: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.ArrowFlowDiagonalUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.75f, 4f)
                curveTo(12.336f, 4f, 12f, 4.336f, 12f, 4.75f)
                curveTo(12f, 5.164f, 12.336f, 5.5f, 12.75f, 5.5f)
                horizontalLineTo(17.439f)
                lineTo(9.248f, 13.691f)
                curveTo(8.608f, 13.255f, 7.834f, 13f, 7f, 13f)
                curveTo(4.791f, 13f, 3f, 14.791f, 3f, 17f)
                curveTo(3f, 19.209f, 4.791f, 21f, 7f, 21f)
                curveTo(9.209f, 21f, 11f, 19.209f, 11f, 17f)
                curveTo(11f, 16.167f, 10.745f, 15.392f, 10.309f, 14.752f)
                lineTo(18.5f, 6.561f)
                verticalLineTo(11.25f)
                curveTo(18.5f, 11.664f, 18.836f, 12f, 19.25f, 12f)
                curveTo(19.664f, 12f, 20f, 11.664f, 20f, 11.25f)
                verticalLineTo(4.75f)
                curveTo(20f, 4.336f, 19.664f, 4f, 19.25f, 4f)
                horizontalLineTo(12.75f)
                close()
                moveTo(4.5f, 17f)
                curveTo(4.5f, 15.619f, 5.619f, 14.5f, 7f, 14.5f)
                curveTo(8.381f, 14.5f, 9.5f, 15.619f, 9.5f, 17f)
                curveTo(9.5f, 18.381f, 8.381f, 19.5f, 7f, 19.5f)
                curveTo(5.619f, 19.5f, 4.5f, 18.381f, 4.5f, 17f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ArrowFlowDiagonalUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowFlowDiagonalUpRight, contentDescription = null)
    }
}
