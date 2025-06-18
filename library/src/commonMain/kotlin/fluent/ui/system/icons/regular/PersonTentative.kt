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

public val FluentIcons.Regular.PersonTentative: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonTentative",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.314f, 15.5f)
            curveTo(11.486f, 14.966f, 11.726f, 14.463f, 12.023f, 13.999f)
            lineTo(4.254f, 14f)
            curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.25f)
            verticalLineTo(17.157f)
            curveTo(2.004f, 18.25f, 2.481f, 19.288f, 3.309f, 20.001f)
            curveTo(4.872f, 21.344f, 7.111f, 22.001f, 10f, 22.001f)
            curveTo(10.942f, 22.001f, 11.815f, 21.931f, 12.618f, 21.791f)
            curveTo(12.251f, 21.374f, 11.937f, 20.91f, 11.689f, 20.41f)
            curveTo(11.162f, 20.471f, 10.599f, 20.501f, 10f, 20.501f)
            curveTo(7.441f, 20.501f, 5.545f, 19.945f, 4.287f, 18.863f)
            curveTo(3.79f, 18.436f, 3.504f, 17.813f, 3.504f, 17.157f)
            verticalLineTo(16.25f)
            curveTo(3.504f, 15.836f, 3.84f, 15.5f, 4.254f, 15.5f)
            lineTo(11.314f, 15.5f)
            close()
            moveTo(15f, 7.005f)
            curveTo(15f, 4.243f, 12.762f, 2.005f, 10f, 2.005f)
            curveTo(7.239f, 2.005f, 5f, 4.243f, 5f, 7.005f)
            curveTo(5f, 9.766f, 7.239f, 12.005f, 10f, 12.005f)
            curveTo(12.762f, 12.005f, 15f, 9.766f, 15f, 7.005f)
            close()
            moveTo(6.5f, 7.005f)
            curveTo(6.5f, 5.072f, 8.067f, 3.505f, 10f, 3.505f)
            curveTo(11.933f, 3.505f, 13.5f, 5.072f, 13.5f, 7.005f)
            curveTo(13.5f, 8.938f, 11.933f, 10.505f, 10f, 10.505f)
            curveTo(8.067f, 10.505f, 6.5f, 8.938f, 6.5f, 7.005f)
            close()
            moveTo(17.439f, 12f)
            curveTo(14.45f, 12.033f, 12.032f, 14.45f, 12f, 17.439f)
            lineTo(17.439f, 12f)
            close()
            moveTo(13.116f, 20.823f)
            curveTo(12.763f, 20.358f, 12.482f, 19.834f, 12.291f, 19.27f)
            lineTo(19.27f, 12.291f)
            curveTo(19.834f, 12.483f, 20.357f, 12.764f, 20.823f, 13.117f)
            lineTo(13.116f, 20.823f)
            close()
            moveTo(14.177f, 21.883f)
            curveTo(14.642f, 22.237f, 15.166f, 22.517f, 15.73f, 22.709f)
            lineTo(22.709f, 15.731f)
            curveTo(22.517f, 15.166f, 22.236f, 14.643f, 21.883f, 14.177f)
            lineTo(14.177f, 21.883f)
            close()
            moveTo(22.999f, 17.561f)
            curveTo(22.967f, 20.55f, 20.55f, 22.967f, 17.561f, 23f)
            lineTo(22.999f, 17.561f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonTentativePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonTentative, contentDescription = null)
    }
}
