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

public val FluentUi.Filled.Board: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Board",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.499f, 9.499f)
            lineTo(11.5f, 21.001f)
            lineTo(6.25f, 21.002f)
            curveTo(4.517f, 21.002f, 3.101f, 19.645f, 3.005f, 17.936f)
            lineTo(3f, 17.752f)
            verticalLineTo(9.499f)
            horizontalLineTo(11.499f)
            close()
            moveTo(12.999f, 15.499f)
            horizontalLineTo(21.5f)
            lineTo(21.501f, 17.752f)
            curveTo(21.501f, 19.547f, 20.046f, 21.002f, 18.251f, 21.002f)
            lineTo(13f, 21.001f)
            lineTo(12.999f, 15.499f)
            close()
            moveTo(18.251f, 2.498f)
            curveTo(19.984f, 2.498f, 21.401f, 3.854f, 21.496f, 5.564f)
            lineTo(21.501f, 5.748f)
            lineTo(21.5f, 13.999f)
            horizontalLineTo(12.999f)
            lineTo(13f, 2.498f)
            horizontalLineTo(18.251f)
            close()
            moveTo(11.5f, 2.498f)
            lineTo(11.499f, 7.999f)
            horizontalLineTo(3f)
            lineTo(3.001f, 5.748f)
            curveTo(3.001f, 3.953f, 4.456f, 2.498f, 6.251f, 2.498f)
            horizontalLineTo(11.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BoardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Board, contentDescription = null)
    }
}
