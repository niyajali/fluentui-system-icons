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

public val FluentIcons.Regular.PersonError: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonError",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(12.023f, 14f)
            curveTo(11.726f, 14.463f, 11.487f, 14.967f, 11.314f, 15.5f)
            horizontalLineTo(4.254f)
            curveTo(3.84f, 15.5f, 3.504f, 15.836f, 3.504f, 16.25f)
            verticalLineTo(17.157f)
            curveTo(3.504f, 17.813f, 3.79f, 18.436f, 4.287f, 18.863f)
            curveTo(5.545f, 19.945f, 7.441f, 20.501f, 10f, 20.501f)
            curveTo(10.599f, 20.501f, 11.162f, 20.471f, 11.689f, 20.41f)
            curveTo(11.937f, 20.91f, 12.251f, 21.375f, 12.617f, 21.791f)
            curveTo(11.815f, 21.932f, 10.942f, 22.001f, 10f, 22.001f)
            curveTo(7.111f, 22.001f, 4.872f, 21.344f, 3.31f, 20.001f)
            curveTo(2.481f, 19.289f, 2.004f, 18.25f, 2.004f, 17.157f)
            verticalLineTo(16.25f)
            curveTo(2.004f, 15.007f, 3.011f, 14f, 4.254f, 14f)
            horizontalLineTo(12.023f)
            close()
            moveTo(17.5f, 19.875f)
            curveTo(17.155f, 19.875f, 16.875f, 20.155f, 16.875f, 20.5f)
            curveTo(16.875f, 20.845f, 17.155f, 21.125f, 17.5f, 21.125f)
            curveTo(17.845f, 21.125f, 18.125f, 20.845f, 18.125f, 20.5f)
            curveTo(18.125f, 20.155f, 17.845f, 19.875f, 17.5f, 19.875f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.224f, 14f, 17f, 14.224f, 17f, 14.5f)
            verticalLineTo(18.5f)
            curveTo(17f, 18.776f, 17.224f, 19f, 17.5f, 19f)
            curveTo(17.776f, 19f, 18f, 18.776f, 18f, 18.5f)
            verticalLineTo(14.5f)
            curveTo(18f, 14.224f, 17.776f, 14f, 17.5f, 14f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.761f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.761f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.244f, 7.239f, 2.005f, 10f, 2.005f)
            close()
            moveTo(10f, 3.505f)
            curveTo(8.067f, 3.505f, 6.5f, 5.072f, 6.5f, 7.005f)
            curveTo(6.5f, 8.938f, 8.067f, 10.505f, 10f, 10.505f)
            curveTo(11.933f, 10.505f, 13.5f, 8.938f, 13.5f, 7.005f)
            curveTo(13.5f, 5.072f, 11.933f, 3.505f, 10f, 3.505f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonError, contentDescription = null)
    }
}
