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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Cube: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cube",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.049f, 7.983f)
            curveTo(6.196f, 7.596f, 6.629f, 7.401f, 7.016f, 7.548f)
            lineTo(12f, 9.439f)
            lineTo(16.984f, 7.548f)
            curveTo(17.371f, 7.401f, 17.804f, 7.596f, 17.951f, 7.983f)
            curveTo(18.098f, 8.37f, 17.903f, 8.803f, 17.516f, 8.95f)
            lineTo(12.75f, 10.759f)
            verticalLineTo(16.249f)
            curveTo(12.75f, 16.663f, 12.414f, 16.999f, 12f, 16.999f)
            curveTo(11.586f, 16.999f, 11.25f, 16.663f, 11.25f, 16.249f)
            verticalLineTo(10.759f)
            lineTo(6.484f, 8.95f)
            curveTo(6.097f, 8.803f, 5.902f, 8.37f, 6.049f, 7.983f)
            close()
            moveTo(10.591f, 2.511f)
            curveTo(11.495f, 2.145f, 12.505f, 2.145f, 13.409f, 2.511f)
            lineTo(20.907f, 5.551f)
            curveTo(21.568f, 5.819f, 22f, 6.46f, 22f, 7.173f)
            verticalLineTo(16.826f)
            curveTo(22f, 17.538f, 21.568f, 18.18f, 20.907f, 18.447f)
            lineTo(13.409f, 21.487f)
            curveTo(12.505f, 21.854f, 11.495f, 21.854f, 10.591f, 21.487f)
            lineTo(3.093f, 18.447f)
            curveTo(2.432f, 18.18f, 2f, 17.538f, 2f, 16.826f)
            verticalLineTo(7.173f)
            curveTo(2f, 6.46f, 2.432f, 5.819f, 3.093f, 5.551f)
            lineTo(10.591f, 2.511f)
            close()
            moveTo(12.845f, 3.901f)
            curveTo(12.303f, 3.681f, 11.697f, 3.681f, 11.155f, 3.901f)
            lineTo(3.656f, 6.941f)
            curveTo(3.562f, 6.979f, 3.5f, 7.071f, 3.5f, 7.173f)
            verticalLineTo(16.826f)
            curveTo(3.5f, 16.927f, 3.562f, 17.019f, 3.656f, 17.057f)
            lineTo(11.155f, 20.097f)
            curveTo(11.697f, 20.317f, 12.303f, 20.317f, 12.845f, 20.097f)
            lineTo(20.344f, 17.057f)
            curveTo(20.438f, 17.019f, 20.5f, 16.927f, 20.5f, 16.826f)
            verticalLineTo(7.173f)
            curveTo(20.5f, 7.071f, 20.438f, 6.979f, 20.344f, 6.941f)
            lineTo(12.845f, 3.901f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CubePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Cube, contentDescription = null)
    }
}
