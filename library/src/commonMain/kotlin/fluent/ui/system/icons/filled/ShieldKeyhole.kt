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

public val FluentUi.Filled.ShieldKeyhole: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShieldKeyhole",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5.75f)
            verticalLineTo(11f)
            curveTo(3f, 16.001f, 5.958f, 19.676f, 11.725f, 21.948f)
            curveTo(11.902f, 22.017f, 12.098f, 22.017f, 12.275f, 21.948f)
            curveTo(18.042f, 19.676f, 21f, 16.001f, 21f, 11f)
            verticalLineTo(5.75f)
            curveTo(21f, 5.336f, 20.664f, 5f, 20.25f, 5f)
            curveTo(17.587f, 5f, 14.992f, 4.057f, 12.45f, 2.15f)
            curveTo(12.183f, 1.95f, 11.817f, 1.95f, 11.55f, 2.15f)
            curveTo(9.008f, 4.057f, 6.413f, 5f, 3.75f, 5f)
            curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
            close()
            moveTo(13.995f, 11f)
            curveTo(13.995f, 11.837f, 13.48f, 12.554f, 12.75f, 12.852f)
            lineTo(12.75f, 15.25f)
            curveTo(12.75f, 15.664f, 12.414f, 16f, 12f, 16f)
            curveTo(11.586f, 16f, 11.25f, 15.664f, 11.25f, 15.25f)
            lineTo(11.25f, 12.856f)
            curveTo(10.515f, 12.56f, 9.996f, 11.841f, 9.996f, 11f)
            curveTo(9.996f, 9.896f, 10.891f, 9f, 11.996f, 9f)
            curveTo(13.1f, 9f, 13.995f, 9.896f, 13.995f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShieldKeyholePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShieldKeyhole, contentDescription = null)
    }
}
