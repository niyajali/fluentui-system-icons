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

public val FluentUi.Filled.EraserSmall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EraserSmall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.651f, 2.638f)
            curveTo(13.537f, 1.76f, 14.968f, 1.771f, 15.841f, 2.661f)
            lineTo(20.751f, 7.669f)
            curveTo(21.612f, 8.547f, 21.609f, 9.953f, 20.744f, 10.827f)
            lineTo(18.487f, 13.108f)
            curveTo(18.169f, 13.037f, 17.839f, 13f, 17.5f, 13f)
            curveTo(15.015f, 13f, 13f, 15.014f, 13f, 17.5f)
            curveTo(13f, 17.855f, 13.041f, 18.2f, 13.119f, 18.532f)
            lineTo(11.335f, 20.335f)
            curveTo(10.463f, 21.216f, 9.043f, 21.226f, 8.159f, 20.358f)
            lineTo(3.06f, 15.35f)
            curveTo(2.164f, 14.471f, 2.161f, 13.03f, 3.053f, 12.146f)
            lineTo(12.651f, 2.638f)
            close()
            moveTo(4.108f, 13.212f)
            curveTo(3.811f, 13.506f, 3.812f, 13.987f, 4.111f, 14.28f)
            lineTo(9.21f, 19.288f)
            curveTo(9.505f, 19.577f, 9.978f, 19.573f, 10.268f, 19.28f)
            lineTo(11.736f, 17.797f)
            lineTo(5.637f, 11.698f)
            lineTo(4.108f, 13.212f)
            close()
            moveTo(17.5f, 21f)
            curveTo(19.433f, 21f, 21f, 19.433f, 21f, 17.5f)
            curveTo(21f, 15.566f, 19.433f, 14f, 17.5f, 14f)
            curveTo(15.567f, 14f, 14f, 15.566f, 14f, 17.5f)
            curveTo(14f, 19.433f, 15.567f, 21f, 17.5f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EraserSmallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EraserSmall, contentDescription = null)
    }
}
