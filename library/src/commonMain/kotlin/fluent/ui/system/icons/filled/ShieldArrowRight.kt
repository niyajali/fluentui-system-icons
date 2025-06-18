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

public val FluentUi.Filled.ShieldArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShieldArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5.75f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
            curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
            curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
            curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
            verticalLineTo(11f)
            curveTo(21f, 11.338f, 20.986f, 11.67f, 20.959f, 11.996f)
            curveTo(19.958f, 11.365f, 18.771f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 19.151f, 11.616f, 20.658f, 12.63f, 21.805f)
            curveTo(12.513f, 21.853f, 12.394f, 21.901f, 12.275f, 21.948f)
            curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
            curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
            verticalLineTo(5.75f)
            close()
            moveTo(23f, 17.496f)
            curveTo(23f, 14.458f, 20.538f, 11.996f, 17.5f, 11.996f)
            curveTo(14.462f, 11.996f, 12f, 14.458f, 12f, 17.496f)
            curveTo(12f, 20.534f, 14.462f, 22.996f, 17.5f, 22.996f)
            curveTo(20.538f, 22.996f, 23f, 20.534f, 23f, 17.496f)
            close()
            moveTo(14f, 17.496f)
            curveTo(14f, 17.22f, 14.224f, 16.996f, 14.5f, 16.996f)
            lineTo(19.293f, 16.996f)
            lineTo(17.646f, 15.35f)
            curveTo(17.451f, 15.154f, 17.451f, 14.838f, 17.646f, 14.642f)
            curveTo(17.842f, 14.447f, 18.158f, 14.447f, 18.354f, 14.642f)
            lineTo(20.854f, 17.142f)
            curveTo(21.049f, 17.338f, 21.049f, 17.654f, 20.854f, 17.85f)
            lineTo(18.354f, 20.35f)
            curveTo(18.158f, 20.545f, 17.842f, 20.545f, 17.646f, 20.35f)
            curveTo(17.451f, 20.154f, 17.451f, 19.838f, 17.646f, 19.642f)
            lineTo(19.293f, 17.996f)
            lineTo(14.5f, 17.996f)
            curveTo(14.224f, 17.996f, 14f, 17.772f, 14f, 17.496f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShieldArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShieldArrowRight, contentDescription = null)
    }
}
