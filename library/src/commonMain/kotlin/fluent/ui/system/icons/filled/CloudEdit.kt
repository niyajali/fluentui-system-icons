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

public val FluentUi.Filled.CloudEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.08f, 9.019f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.019f)
            curveTo(18.839f, 9.104f, 19.678f, 9.466f, 20.353f, 10.02f)
            curveTo(19.637f, 10.099f, 18.942f, 10.413f, 18.393f, 10.962f)
            lineTo(12.49f, 16.865f)
            curveTo(12.162f, 17.193f, 11.901f, 17.578f, 11.717f, 18f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
            close()
            moveTo(19.1f, 11.67f)
            lineTo(13.197f, 17.572f)
            curveTo(12.853f, 17.916f, 12.609f, 18.347f, 12.491f, 18.819f)
            lineTo(12.033f, 20.65f)
            curveTo(11.834f, 21.446f, 12.556f, 22.167f, 13.352f, 21.968f)
            lineTo(15.182f, 21.511f)
            curveTo(15.655f, 21.393f, 16.086f, 21.149f, 16.43f, 20.804f)
            lineTo(22.332f, 14.902f)
            curveTo(23.225f, 14.009f, 23.225f, 12.562f, 22.332f, 11.67f)
            curveTo(21.44f, 10.777f, 19.993f, 10.777f, 19.1f, 11.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CloudEdit, contentDescription = null)
    }
}
