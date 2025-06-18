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

public val FluentUi.Filled.UninstallApp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.UninstallApp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.613f, 8.79f)
            lineTo(16.707f, 8.707f)
            lineTo(18.5f, 6.915f)
            lineTo(20.293f, 8.707f)
            curveTo(20.653f, 9.068f, 21.221f, 9.095f, 21.613f, 8.79f)
            lineTo(21.707f, 8.707f)
            curveTo(22.068f, 8.347f, 22.095f, 7.779f, 21.79f, 7.387f)
            lineTo(21.707f, 7.293f)
            lineTo(19.915f, 5.5f)
            lineTo(21.707f, 3.707f)
            curveTo(22.068f, 3.347f, 22.095f, 2.779f, 21.79f, 2.387f)
            lineTo(21.707f, 2.293f)
            curveTo(21.347f, 1.932f, 20.779f, 1.905f, 20.387f, 2.21f)
            lineTo(20.293f, 2.293f)
            lineTo(18.5f, 4.085f)
            lineTo(16.707f, 2.293f)
            curveTo(16.347f, 1.932f, 15.779f, 1.905f, 15.387f, 2.21f)
            lineTo(15.293f, 2.293f)
            curveTo(14.932f, 2.653f, 14.905f, 3.221f, 15.21f, 3.613f)
            lineTo(15.293f, 3.707f)
            lineTo(17.085f, 5.5f)
            lineTo(15.293f, 7.293f)
            curveTo(14.932f, 7.653f, 14.905f, 8.221f, 15.21f, 8.613f)
            lineTo(15.293f, 8.707f)
            curveTo(15.623f, 9.038f, 16.128f, 9.088f, 16.511f, 8.86f)
            lineTo(16.613f, 8.79f)
            close()
            moveTo(18.5f, 21f)
            curveTo(19.881f, 21f, 21f, 19.881f, 21f, 18.5f)
            verticalLineTo(13.5f)
            curveTo(21f, 12.119f, 19.881f, 11f, 18.5f, 11f)
            horizontalLineTo(13f)
            verticalLineTo(5.5f)
            curveTo(13f, 4.119f, 11.881f, 3f, 10.5f, 3f)
            horizontalLineTo(5.5f)
            curveTo(4.119f, 3f, 3f, 4.119f, 3f, 5.5f)
            verticalLineTo(18.5f)
            curveTo(3f, 19.881f, 4.119f, 21f, 5.5f, 21f)
            horizontalLineTo(18.5f)
            close()
            moveTo(5f, 11f)
            verticalLineTo(5.5f)
            curveTo(5f, 5.224f, 5.224f, 5f, 5.5f, 5f)
            horizontalLineTo(10.5f)
            curveTo(10.776f, 5f, 11f, 5.224f, 11f, 5.5f)
            verticalLineTo(11f)
            horizontalLineTo(5f)
            close()
            moveTo(11f, 19f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 19f, 5f, 18.776f, 5f, 18.5f)
            verticalLineTo(13f)
            horizontalLineTo(11f)
            verticalLineTo(19f)
            close()
            moveTo(18.5f, 19f)
            horizontalLineTo(13f)
            verticalLineTo(13f)
            horizontalLineTo(18.5f)
            curveTo(18.776f, 13f, 19f, 13.224f, 19f, 13.5f)
            verticalLineTo(18.5f)
            curveTo(19f, 18.776f, 18.776f, 19f, 18.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun UninstallAppPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.UninstallApp, contentDescription = null)
    }
}
