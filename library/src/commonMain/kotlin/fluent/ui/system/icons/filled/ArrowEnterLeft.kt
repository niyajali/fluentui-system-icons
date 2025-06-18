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

public val FluentUi.Filled.ArrowEnterLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowEnterLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 4f)
            curveTo(21.513f, 4f, 21.935f, 4.386f, 21.993f, 4.883f)
            lineTo(22f, 5f)
            verticalLineTo(11.5f)
            curveTo(22f, 13.369f, 20.536f, 14.895f, 18.692f, 14.995f)
            lineTo(18.5f, 15f)
            horizontalLineTo(5.415f)
            lineTo(8.707f, 18.293f)
            curveTo(9.068f, 18.653f, 9.095f, 19.221f, 8.79f, 19.613f)
            lineTo(8.707f, 19.707f)
            curveTo(8.347f, 20.068f, 7.779f, 20.095f, 7.387f, 19.79f)
            lineTo(7.293f, 19.707f)
            lineTo(2.293f, 14.707f)
            curveTo(2.257f, 14.672f, 2.225f, 14.634f, 2.196f, 14.595f)
            lineTo(2.125f, 14.484f)
            lineTo(2.071f, 14.371f)
            lineTo(2.036f, 14.266f)
            lineTo(2.011f, 14.149f)
            lineTo(2.004f, 14.09f)
            lineTo(2f, 14f)
            lineTo(2.003f, 13.925f)
            lineTo(2.02f, 13.799f)
            lineTo(2.05f, 13.688f)
            lineTo(2.094f, 13.577f)
            lineTo(2.146f, 13.479f)
            lineTo(2.21f, 13.387f)
            lineTo(2.293f, 13.293f)
            lineTo(7.293f, 8.293f)
            curveTo(7.683f, 7.902f, 8.317f, 7.902f, 8.707f, 8.293f)
            curveTo(9.068f, 8.653f, 9.095f, 9.221f, 8.79f, 9.613f)
            lineTo(8.707f, 9.707f)
            lineTo(5.415f, 13f)
            horizontalLineTo(18.5f)
            curveTo(19.28f, 13f, 19.92f, 12.405f, 19.993f, 11.644f)
            lineTo(20f, 11.5f)
            verticalLineTo(5f)
            curveTo(20f, 4.448f, 20.448f, 4f, 21f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowEnterLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowEnterLeft, contentDescription = null)
    }
}
