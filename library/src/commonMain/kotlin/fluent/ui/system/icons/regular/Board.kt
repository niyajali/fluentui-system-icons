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

public val FluentIcons.Regular.Board: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Board",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.251f, 2.498f)
            curveTo(19.984f, 2.498f, 21.401f, 3.854f, 21.496f, 5.564f)
            lineTo(21.501f, 5.748f)
            lineTo(21.501f, 17.752f)
            curveTo(21.501f, 19.547f, 20.046f, 21.002f, 18.251f, 21.002f)
            horizontalLineTo(6.25f)
            curveTo(4.517f, 21.002f, 3.101f, 19.645f, 3.005f, 17.936f)
            lineTo(3f, 17.752f)
            lineTo(3.001f, 5.748f)
            curveTo(3.001f, 3.953f, 4.456f, 2.498f, 6.251f, 2.498f)
            horizontalLineTo(18.251f)
            close()
            moveTo(11.5f, 9.498f)
            lineTo(4.5f, 9.499f)
            lineTo(4.5f, 17.752f)
            lineTo(4.507f, 17.912f)
            curveTo(4.588f, 18.804f, 5.338f, 19.502f, 6.25f, 19.502f)
            lineTo(11.5f, 19.501f)
            verticalLineTo(9.498f)
            close()
            moveTo(20f, 15.498f)
            lineTo(13f, 15.499f)
            verticalLineTo(19.501f)
            lineTo(18.251f, 19.502f)
            curveTo(19.217f, 19.502f, 20.001f, 18.718f, 20.001f, 17.752f)
            lineTo(20f, 15.498f)
            close()
            moveTo(18.251f, 3.998f)
            lineTo(13f, 3.997f)
            verticalLineTo(13.999f)
            lineTo(20f, 13.998f)
            lineTo(20.001f, 5.748f)
            lineTo(19.994f, 5.587f)
            curveTo(19.913f, 4.696f, 19.164f, 3.998f, 18.251f, 3.998f)
            close()
            moveTo(11.5f, 3.997f)
            lineTo(6.251f, 3.998f)
            lineTo(6.107f, 4.004f)
            curveTo(5.208f, 4.077f, 4.501f, 4.83f, 4.501f, 5.748f)
            lineTo(4.5f, 7.999f)
            lineTo(11.5f, 7.998f)
            verticalLineTo(3.997f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BoardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Board, contentDescription = null)
    }
}
