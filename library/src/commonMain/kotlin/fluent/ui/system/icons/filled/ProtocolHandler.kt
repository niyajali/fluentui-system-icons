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

public val FluentUi.Filled.ProtocolHandler: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProtocolHandler",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.482f, 17.732f)
            lineTo(12.707f, 16.957f)
            lineTo(15.189f, 14.474f)
            curveTo(16.556f, 13.108f, 16.556f, 10.892f, 15.189f, 9.525f)
            lineTo(12.707f, 7.043f)
            lineTo(13.482f, 6.267f)
            curveTo(14.458f, 5.291f, 16.041f, 5.291f, 17.017f, 6.267f)
            lineTo(20.982f, 10.232f)
            curveTo(21.958f, 11.208f, 21.958f, 12.791f, 20.982f, 13.767f)
            lineTo(17.017f, 17.732f)
            curveTo(16.041f, 18.708f, 14.458f, 18.708f, 13.482f, 17.732f)
            close()
            moveTo(14.482f, 13.767f)
            curveTo(15.458f, 12.791f, 15.458f, 11.208f, 14.482f, 10.232f)
            lineTo(10.517f, 6.267f)
            curveTo(9.541f, 5.291f, 7.958f, 5.291f, 6.982f, 6.267f)
            lineTo(3.017f, 10.232f)
            curveTo(2.041f, 11.208f, 2.041f, 12.791f, 3.017f, 13.767f)
            lineTo(6.982f, 17.732f)
            curveTo(7.958f, 18.708f, 9.541f, 18.708f, 10.517f, 17.732f)
            lineTo(14.482f, 13.767f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ProtocolHandlerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ProtocolHandler, contentDescription = null)
    }
}
