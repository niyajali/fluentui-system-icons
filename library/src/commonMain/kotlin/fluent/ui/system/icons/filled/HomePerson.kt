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

public val FluentUi.Filled.HomePerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomePerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.549f, 2.533f)
            curveTo(11.387f, 1.826f, 12.613f, 1.826f, 13.451f, 2.533f)
            lineTo(20.201f, 8.228f)
            curveTo(20.708f, 8.655f, 21f, 9.284f, 21f, 9.947f)
            verticalLineTo(12.05f)
            curveTo(20.365f, 11.402f, 19.479f, 11f, 18.5f, 11f)
            curveTo(16.567f, 11f, 15f, 12.567f, 15f, 14.5f)
            verticalLineTo(15f)
            curveTo(14.886f, 14.44f, 14.373f, 14.016f, 13.783f, 14f)
            horizontalLineTo(10.217f)
            curveTo(9.542f, 14.018f, 9f, 14.571f, 9f, 15.25f)
            verticalLineTo(19.253f)
            curveTo(9f, 20.219f, 8.217f, 21.003f, 7.25f, 21.003f)
            horizontalLineTo(4.75f)
            curveTo(3.783f, 21.003f, 3f, 20.219f, 3f, 19.253f)
            verticalLineTo(9.947f)
            curveTo(3f, 9.284f, 3.292f, 8.655f, 3.799f, 8.228f)
            lineTo(10.549f, 2.533f)
            close()
            moveTo(21f, 14.5f)
            curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
            curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
            curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
            curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
            close()
            moveTo(23f, 19.875f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
            horizontalLineTo(21.227f)
            curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
            verticalLineTo(19.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomePersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.HomePerson, contentDescription = null)
    }
}
