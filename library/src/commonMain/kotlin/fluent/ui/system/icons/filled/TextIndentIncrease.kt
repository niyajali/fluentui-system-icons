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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.TextIndentIncrease: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextIndentIncrease",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 16f)
            horizontalLineTo(17.5f)
            curveTo(18.052f, 16f, 18.5f, 16.448f, 18.5f, 17f)
            curveTo(18.5f, 17.513f, 18.114f, 17.935f, 17.617f, 17.993f)
            lineTo(17.5f, 18f)
            horizontalLineTo(9f)
            curveTo(8.448f, 18f, 8f, 17.552f, 8f, 17f)
            curveTo(8f, 16.487f, 8.386f, 16.065f, 8.883f, 16.007f)
            lineTo(9f, 16f)
            horizontalLineTo(17.5f)
            horizontalLineTo(9f)
            close()
            moveTo(2.293f, 9.293f)
            curveTo(2.653f, 8.932f, 3.221f, 8.905f, 3.613f, 9.21f)
            lineTo(3.707f, 9.293f)
            lineTo(5.707f, 11.293f)
            curveTo(6.068f, 11.653f, 6.095f, 12.221f, 5.79f, 12.613f)
            lineTo(5.707f, 12.707f)
            lineTo(3.707f, 14.707f)
            curveTo(3.317f, 15.098f, 2.683f, 15.098f, 2.293f, 14.707f)
            curveTo(1.932f, 14.347f, 1.905f, 13.779f, 2.21f, 13.387f)
            lineTo(2.293f, 13.293f)
            lineTo(3.586f, 12f)
            lineTo(2.293f, 10.707f)
            curveTo(1.902f, 10.317f, 1.902f, 9.683f, 2.293f, 9.293f)
            close()
            moveTo(9f, 11f)
            lineTo(20.5f, 10.999f)
            curveTo(21.052f, 10.999f, 21.5f, 11.446f, 21.5f, 11.999f)
            curveTo(21.5f, 12.512f, 21.114f, 12.934f, 20.617f, 12.992f)
            lineTo(20.5f, 12.999f)
            lineTo(9f, 13f)
            curveTo(8.448f, 13f, 8f, 12.552f, 8f, 12f)
            curveTo(8f, 11.487f, 8.386f, 11.065f, 8.883f, 11.007f)
            lineTo(9f, 11f)
            lineTo(20.5f, 10.999f)
            lineTo(9f, 11f)
            close()
            moveTo(9f, 6f)
            horizontalLineTo(17.5f)
            curveTo(18.052f, 6f, 18.5f, 6.448f, 18.5f, 7f)
            curveTo(18.5f, 7.513f, 18.114f, 7.936f, 17.617f, 7.993f)
            lineTo(17.5f, 8f)
            horizontalLineTo(9f)
            curveTo(8.448f, 8f, 8f, 7.552f, 8f, 7f)
            curveTo(8f, 6.487f, 8.386f, 6.064f, 8.883f, 6.007f)
            lineTo(9f, 6f)
            horizontalLineTo(17.5f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextIndentIncreasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextIndentIncrease, contentDescription = null)
    }
}
