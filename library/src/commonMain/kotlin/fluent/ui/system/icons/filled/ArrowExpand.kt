/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.ArrowExpand: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExpand",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.669f, 14.923f)
            curveTo(8.059f, 14.532f, 8.692f, 14.532f, 9.083f, 14.923f)
            curveTo(9.473f, 15.313f, 9.473f, 15.947f, 9.083f, 16.337f)
            lineTo(6.415f, 19.004f)
            horizontalLineTo(8f)
            curveTo(8.513f, 19.004f, 8.936f, 19.39f, 8.993f, 19.888f)
            lineTo(9f, 20.004f)
            curveTo(9f, 20.556f, 8.552f, 21.004f, 8f, 21.004f)
            horizontalLineTo(4f)
            curveTo(3.448f, 21.004f, 3f, 20.556f, 3f, 20.004f)
            verticalLineTo(16.004f)
            curveTo(3f, 15.452f, 3.448f, 15.004f, 4f, 15.004f)
            curveTo(4.552f, 15.004f, 5f, 15.452f, 5f, 16.004f)
            verticalLineTo(17.591f)
            lineTo(7.669f, 14.923f)
            close()
            moveTo(16.005f, 21.004f)
            curveTo(15.453f, 21.004f, 15.005f, 20.556f, 15.005f, 20.004f)
            curveTo(15.005f, 19.452f, 15.453f, 19.004f, 16.005f, 19.004f)
            horizontalLineTo(17.588f)
            lineTo(14.923f, 16.337f)
            curveTo(14.562f, 15.976f, 14.535f, 15.409f, 14.84f, 15.017f)
            lineTo(14.923f, 14.923f)
            curveTo(15.314f, 14.532f, 15.947f, 14.533f, 16.337f, 14.923f)
            lineTo(19.005f, 17.593f)
            verticalLineTo(16.004f)
            curveTo(19.005f, 15.491f, 19.391f, 15.069f, 19.888f, 15.011f)
            lineTo(20.005f, 15.004f)
            curveTo(20.557f, 15.004f, 21.005f, 15.452f, 21.005f, 16.004f)
            verticalLineTo(20.004f)
            curveTo(21.005f, 20.556f, 20.557f, 21.004f, 20.005f, 21.004f)
            horizontalLineTo(16.005f)
            close()
            moveTo(8f, 3f)
            curveTo(8.552f, 3f, 9f, 3.448f, 9f, 4f)
            curveTo(9f, 4.552f, 8.552f, 5f, 8f, 5f)
            horizontalLineTo(6.417f)
            lineTo(9.082f, 7.668f)
            curveTo(9.443f, 8.029f, 9.47f, 8.596f, 9.165f, 8.988f)
            lineTo(9.082f, 9.082f)
            curveTo(8.691f, 9.473f, 8.058f, 9.473f, 7.668f, 9.082f)
            lineTo(5f, 6.412f)
            verticalLineTo(8f)
            curveTo(5f, 8.513f, 4.614f, 8.936f, 4.117f, 8.993f)
            lineTo(4f, 9f)
            curveTo(3.448f, 9f, 3f, 8.552f, 3f, 8f)
            verticalLineTo(4f)
            curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
            horizontalLineTo(8f)
            close()
            moveTo(20.005f, 3f)
            curveTo(20.557f, 3f, 21.005f, 3.448f, 21.005f, 4f)
            verticalLineTo(8f)
            curveTo(21.005f, 8.552f, 20.557f, 9f, 20.005f, 9f)
            curveTo(19.453f, 9f, 19.005f, 8.552f, 19.005f, 8f)
            verticalLineTo(6.412f)
            lineTo(16.337f, 9.082f)
            curveTo(15.977f, 9.443f, 15.41f, 9.47f, 15.017f, 9.165f)
            lineTo(14.923f, 9.082f)
            curveTo(14.532f, 8.692f, 14.532f, 8.059f, 14.923f, 7.668f)
            lineTo(17.589f, 5f)
            horizontalLineTo(16.005f)
            curveTo(15.492f, 5f, 15.069f, 4.614f, 15.012f, 4.117f)
            lineTo(15.005f, 4f)
            curveTo(15.005f, 3.448f, 15.453f, 3f, 16.005f, 3f)
            horizontalLineTo(20.005f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowExpandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowExpand, contentDescription = null)
    }
}
